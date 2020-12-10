package by.praded.dice.model;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class Dice {
    private final int[] values;

    public Dice() {
        this.values = new int[]{1, 2, 3, 4, 5, 6};
    }

    public int size(){
        return values.length;
    }

    public int findElement(int idx) {
        return values[idx];
    }
}
