package javaExample.main;

public class ExEnum {

    public static void main(String[] args) {

        Coffee coffee = new Coffee(Size.BIG);

        System.out.println(coffee);

    }
}

class Coffee {

    Size size;

    public Coffee(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coffee [size= " + size + " " + size.getMililiters() + " ml ]";
    }
    

}

enum Size {
    SMALL(100), MEDIUM(200), BIG(300);

    private int mililiters;

    Size(int mililiters) {
        this.mililiters = mililiters;
    }

    public int getMililiters() {
        return mililiters;
    }

    public void setMililiters(int mililiters) {
        this.mililiters = mililiters;
    }

};