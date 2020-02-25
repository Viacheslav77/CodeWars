package javaExample.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExPersonStreamCollectReduse {

    public static void main(String[] args) {
        
        List < Person > people = Arrays.asList(
            null, new Person ("Pasha", 20), new Person ("Pety", 21),  new Person ("Gena", 21), new Person ("Masha", 21), new Person ("Jon", 12));
        
        System.out.println("Reduce1");
        printReduce( people) ;
        printReduce( null );

        System.out.println("Reduce2");
        printReduce1( people );
        printReduce1( null );

        System.out.println("Reduce3");
        printReduce2( people );
        printReduce2( null );
        

        System.out.println("Starts With P");
        printPersonStartsWithP(people);
        printPersonStartsWithP(null);

        System.out.println("Grouping By Age");
        printPersonGroupingByAge(people);
        printPersonGroupingByAge(null);

        System.out.println("Print Averaging Doublee");
        printAveragingDouble(people);
        printPersonGroupingByAge(null);

        System.out.println("Print Summarizing In");
        printSummarizingIn(people);
        printSummarizingIn(null);

        System.out.println("Print Average ");
        printAverage(people);
        printAverage(null);

        System.out.println("Print Joinign");
        printJoinig(people);
        printJoinig(null);

        System.out.println("To Map");
        printToMap(people);
        printToMap(null);
    }

    public static void printReduce( List<Person> people ) {
        if ( people != null) 
            people.stream()
                .filter(f -> f != null)     
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)           
                .ifPresent(System.out::println);
                
    }

    public static void printReduce1( List<Person> people ) {
        if ( people != null) 
            System.out.println( "The new Person is " + 
                people.stream()
                    .filter(f -> f != null)  
                    .reduce( new Person ("", 0), (p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                    .getName()         
                    
             );          
    }

    public static void printReduce2( List<Person> people ) {
        if ( people != null) 
            System.out.println( "The sum of all ages is " + 
                people.stream()
                    .filter( f -> f != null )
                    .map( f-> f.getAge())
                    .reduce( 15 , (p1, p2) -> p1 + p2 )     
             );          
    }

    public static void printPersonStartsWithP(List<Person> people) {
        if (people != null)
            people.stream()
                    .filter(p -> p != null ? p.getName().startsWith("P") : false)
                    .collect(Collectors.toList())
                    .forEach(System.out::print);
    }

    public static void printPersonGroupingByAge(List<Person> people) {
        if (people != null)
            people.stream()
                    .filter(p -> p != null)
                    .collect(Collectors.groupingBy(p -> p.getAge()))
                    .forEach((k, p) -> System.out.println(k + " " + p));
    }

    public static void printAveragingDouble(List<Person> people) {
        System.out.println(people == null ? "": 
        people.stream()
                .filter(p -> p != null)
                .collect(Collectors.averagingDouble(p -> p.getAge())));

    }

    public static void printSummarizingIn( List<Person> people ) {
        System.out.println( "Summarizing In = " + (people == null ? " Null" : 
            people.stream()
                    .filter(p -> p != null)
                    .collect(Collectors.summarizingInt( p -> p.getAge() ))
        ));
    }

    public static void printAverage( List<Person> people ) {
        System.out.println( "Average = " + (people == null ? "" : 
            people.stream()
                    .filter(p -> p != null)
                    .collect(Collectors.summarizingInt( p -> p.getAge()))
                    .getAverage()
        ));
    }

    public static void printJoinig(List<Person> people) {
        System.out.println( "Joinig = " + (people == null ? " People = null" : 
            people.stream()
                .filter( p -> ( p != null && p.getAge() > 18  ))
                .map ( p -> p.getName())
                .collect(Collectors.joining(" and  ", "Add ", " to groupe"))
        
        ));
    }

    public static void printToMap(List<Person> people) {
        System.out.println( "printToMap = " + ( people == null ? " People = null" : 
            people.stream()
                .filter( p -> p != null )
                .collect(Collectors.toMap(
                    p -> p.getAge(),
                    p -> p.getName(),
                    (n1 , n2) -> n1 + ";" + n2 ))
        
        ));
    }

    public static void printMyColletor(List<Person> people) {
        System.out.println( "my Collect = " + ( people == null ? " People = null" : 
            people.stream()
                .filter( p -> p != null )
                .collect(
                    Collectors.toMap(
                    p -> p.getAge(),
                    p -> p.getName(),
                    (n1 , n2) -> n1 + ";" + n2 ))
        
        ));
    }

}

class Person {
    private int age;
    private String name;

    public Person( String name, int age) {
		this.age = age;
		this.name = name;
	}
    

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "[" + name + "]";
    }

}
