package javaExample.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExEmploeese {

    public static void main(String[] args) {

        List<Employee> employees = Stream
                .of(null, new EmployeeHourlyWage("AVasia", 15, 10), new EmployeeFixedPayment("APitia", 21, 1000),
                        new EmployeeHourlyWage("BVasia1", 15, 13), new EmployeeFixedPayment("BPitia1", 21, 4000),
                        new EmployeeHourlyWage("CVasia2", 25, 10), new EmployeeFixedPayment("CPitia2", 41, 2000), null,
                        new EmployeeHourlyWage("DVasia3", 35, 20), new EmployeeFixedPayment("DPitia3", 41, 1000),
                        new EmployeeHourlyWage("FVasia4", 15, 10), new EmployeeFixedPayment("EPitia5", 21, 5000),
                        new EmployeeHourlyWage("GVasia6", 15, 10), new EmployeeFixedPayment("GPitia7", 21, 4000))
                .filter(f -> f != null).collect(Collectors.toList());

        // employees.stream()
        // .sorted( (e1,e2) -> e1.getCalculateSalary() == e2.getCalculateSalary()
        // ? 0
        // : e1.getCalculateSalary() > e2.getCalculateSalary()
        // ? 1
        // : -1)
        // .forEach( (e) -> System.out.println(e));

        getAllSalagyEmployees1(employees).forEach((k, e) -> System.out.println(k + "\n" + e));

        getAllSalagyEmployees1(null).forEach((k, e) -> System.out.println(k + "\n" + e));

    }

    public static Map<Double, List<Employee>> getAllSalagyEmployees1( List<Employee> employees ) {

        Map<Double, List<Employee>> result = new HashMap<>();
        if (employees == null)
            return new HashMap<Double, List<Employee>>();
        else
            employees.stream().filter(e -> e != null)
                    .collect(Collectors.groupingBy(Employee::getCalculateSalary))
                    .forEach((k, e) -> {
                        e.sort(Comparator.comparing( Employee::getName));
                        result.put(k, e);
                    });

        return result;   

    }

    public static Map<Double, List<Employee>> getAllSalagyEmployees(List<Employee> employees) {
        Map<Double, List<Employee>> result = new HashMap<>();
        if (employees == null)
            return new HashMap<Double, List<Employee>>();
        else
            employees.stream().filter(e -> e != null).collect(Collectors.groupingBy(e -> e.getCalculateSalary()))
                    .forEach((k, e) -> {
                        e = e.size() > 1 ? e.stream()
                                .sorted((e1, e2) -> e1.getAge() == e2.getAge() ? 0 : e1.getAge() > e2.getAge() ? 1 : -1)
                                .collect(Collectors.toList()) : e;
                        result.put(k, e);
                    });

        return result;

    }

}

class EmployeeHourlyWage extends Employee {

    private int hourlyRate;

    public EmployeeHourlyWage(String name, int age, int hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public Double getCalculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String getMethodForCalculating() {
        return "Hourly wage";
    }

}

class EmployeeFixedPayment extends Employee {

    private int monthlyPayment;

    public EmployeeFixedPayment(String name, int age, int monthlyPayment) {
        super(name, age);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public Double getCalculateSalary() {
        return (double) monthlyPayment;
    }

    @Override
    public String getMethodForCalculating() {
        return "Fixed payment";
    }

}

abstract class Employee extends Person implements CalculateSalary, Comparable<Employee> {

    private static int theSumOfId;
    private int id;

    public Employee(String name, int age) {
        super(name, age);
        setTheSumOfId(getTheSumOfId() + 1);
        setId(getTheSumOfId());

    }

    
    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return " id = " + id + " " + getName() + " age = " + getAge() + " " + getMethodForCalculating() + " salary = "
                + getCalculateSalary() + " ]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTheSumOfId() {
        return theSumOfId;
    }

    public static void setTheSumOfId(int theSumOfId) {
        Employee.theSumOfId = theSumOfId;
    }


}

class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

interface CalculateSalary {
    Double getCalculateSalary();

    String getMethodForCalculating();

}
