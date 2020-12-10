package by.praded.dragon.model;

import by.praded.dragon.service.DragonService;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class Dragon {
    private String name;
    private int age;
    private int amountOfHeads;

    public Dragon(String name, int age) {
        this.age = age;
        this.name = name;
        amountOfHeads = DragonService.countHeads(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        amountOfHeads = DragonService.countHeads(this);
    }

    public int getAmountOfHeads() {
        return amountOfHeads;
    }

    @Override
    public String toString() {
        return "Dragon[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amountOfHeads=" + amountOfHeads +
                ']';
    }
}
