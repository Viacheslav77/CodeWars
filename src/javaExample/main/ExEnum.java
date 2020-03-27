package javaExample.main;

public class ExEnum {

    public static void main(String[] args) {

        Coffee coffee = new Coffee(Size.BIG);
        Coffee coffee1 = new Coffee(Size.SMALL);

        System.out.println(coffee);
        System.out.println(coffee1);
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
        return "Coffee [size= " + size + " " + size.getMililiters() + " ml " + size.getCoffeeClass() + " ]";
    }

}

enum Size {
    SMALL(100), MEDIUM(200), BIG(300) {
        public String getCoffeeClass() {
            return "B";
        }
    };

    private String coffeeClass = "A";
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

    public String getCoffeeClass() {
        return coffeeClass;
    }

    public void setCoffeeClass(String coffeeClass) {
        this.coffeeClass = coffeeClass;
    }

};