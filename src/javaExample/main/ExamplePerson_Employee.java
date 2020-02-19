package javaExample.main;

class Person { void print() { System.out.println("message 1"); }
}
class Employee extends Person { void print() { System.out.println("message 2"); }
}
class SpecialEmployee extends Employee { void print() { System.out.println("message 3"); }
}
public class ExamplePerson_Employee {
    public static void main(String[] args) {
        Person c = new Employee();
        ((SpecialEmployee) c).print();
    }
}
