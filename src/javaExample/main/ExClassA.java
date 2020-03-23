
package javaExample.main;




public class ExClassA {
    public static void main(String[] args) {
        A objF = new A(1, "First");
        A objS = new A(2, "Second");
        objS = objF;
        objF.setName("Third");
        System.out.println(objS.getName());
        int myList [] = {4, 3, 7};
        
    }
}

class A {
    private int id;
    private String name;
    public A(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName( String name)
    {
        this.name = name;
    }
}
