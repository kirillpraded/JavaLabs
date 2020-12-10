package by.praded;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String... args) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        ArrayList<Integer> maxValueOfDif = new ArrayList();
        String reading;
        Tree tree = new Tree();
        try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"))) {
            while((reading = reader.readLine()) != null){
                tree.add(Integer.parseInt(reading));
            }
        }catch(IOException ex){
        }
        int i1 = -1;
        tree.leftTSearch(tree.Head(),hashMap);
        for(Map.Entry<Integer,Integer> i : hashMap.entrySet()){
            if(i.getValue() > i1){
                i1 = i.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> i : hashMap.entrySet()){
            if(i.getValue() == i1){
                maxValueOfDif.add(i.getKey());
            }
        }
        if(maxValueOfDif.size()%2 != 0){
            maxValueOfDif.sort((Integer a,Integer b)->Integer.compare(a, b));
            tree.deleteValue(maxValueOfDif.get((maxValueOfDif.size()-1)/2));
        }
        maxValueOfDif.clear();
        tree.leftTLocate(tree.Head(), maxValueOfDif);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))){
            for(Integer item : maxValueOfDif){
                writer.write(String.valueOf(item));
                if(item == maxValueOfDif.get(maxValueOfDif.size()-1))
                    break;
                writer.newLine();
            }
        }
        catch(IOException ex){
        }
    }

}

class Node{

    //ключ
    public Integer key;
    //левое поддерево
    public Node leftTree;
    //правое поддерево
    public Node rightTree;

    public Node(Integer k){
        key = k;
        leftTree = null;
        rightTree = null;
    }
}

class Tree{
    private Node head;

    public Tree(){
        head = null;
    }
    public Node Head(){
        return this.head;
    }
    public void add(Integer key){
        Node head1 = head;
        if(head == null){
            head = new Node(key);
        }
        else{
            while(head1 != null){
                if(key == head1.key)
                    break;
                if(key < head1.key){
                    if(head1.leftTree != null){
                        head1 = head1.leftTree;
                    }
                    else{
                        head1.leftTree = new Node(key);
                        head1 = null;
                        continue;
                    }
                }
                if(key > head1.key){
                    if(head1.rightTree != null){
                        head1 = head1.rightTree;
                    }
                    else{
                        head1.rightTree = new Node(key);
                        head1 = null;
                    }
                }
            }
        }
    }
    public void leftTSearch(Node n, HashMap<Integer,Integer> hashMap){
        if(n != null){
            int leftValue = 0;
            int rightValue = 0;
            ArrayList<Integer> list = new ArrayList<>();
            if(n.leftTree != null){
                this.leftTLocate(n.leftTree, list);
                leftValue = list.size();
                list.clear();
            }
            if(n.rightTree != null){
                this.leftTLocate(n.rightTree, list);
                rightValue = list.size();
                list.clear();
            }
            hashMap.put(n.key, Math.abs(rightValue-leftValue));
            leftTSearch(n.leftTree, hashMap);
            leftTSearch(n.rightTree, hashMap);
        }
    }
    public void leftTLocate(Node n, ArrayList<Integer> arrayList){
        if(n != null){
            arrayList.add(n.key);
            leftTLocate(n.leftTree,arrayList);
            leftTLocate(n.rightTree,arrayList);
        }
    }
    public void deleteValue(Integer key){

        boolean flag = false;
        if(key == head.key && (head.leftTree == null || head.rightTree == null)){
            if(head.leftTree != null){
                head = head.leftTree;
            }
            else if(head.rightTree != null)
                head = head.rightTree;
            else
                head = null;
            flag = true;

        }
        Node node = head;
        while(node != null){
            if(flag == true)
                break;
            if(key == node.key && node.leftTree != null && node.rightTree != null){
                if(node.rightTree.leftTree != null){
                    Node pointer2 = node.rightTree;
                    while(pointer2.leftTree.leftTree != null){
                        pointer2 = pointer2.leftTree;
                    }
                    if(pointer2.leftTree.rightTree == null){
                        node.key = pointer2.leftTree.key;
                        pointer2.leftTree = null;
                    }
                    else{
                        node.key = pointer2.leftTree.key;
                        pointer2.leftTree = pointer2.leftTree.rightTree;
                    }
                }
                else{
                    node.key = node.rightTree.key;
                    if(node.rightTree.rightTree == null)
                        node.rightTree = null;
                    else{
                        node.rightTree = node.rightTree.rightTree;
                    }

                }
                break;
            }
            if(key < node.key){
                if(node.leftTree != null){
                    if(node.leftTree.key == key && (node.leftTree.leftTree == null | node.leftTree.rightTree == null)){
                        if(node.leftTree.leftTree != null)
                            node.leftTree = node.leftTree.leftTree;
                        else if(node.leftTree.rightTree != null)
                            node.leftTree = node.leftTree.rightTree;
                        else
                            node.leftTree = null;
                    }else
                        node = node.leftTree;
                }
                else{
                    break;
                }
            }
            if(key > node.key){
                if(node.rightTree != null){
                    if(node.rightTree.key == key && (node.rightTree.leftTree == null || node.rightTree.rightTree == null)){
                        if(node.rightTree.leftTree != null)
                            node.rightTree = node.rightTree.leftTree;
                        else if(node.rightTree.rightTree != null)
                            node.rightTree = node.rightTree.rightTree;
                        else
                            node.rightTree = null;
                    }else
                        node = node.rightTree;
                }
                else{
                    break;
                }
            }
        }
    }
}

