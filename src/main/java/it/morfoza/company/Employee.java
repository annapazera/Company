package it.morfoza.company;

/**
 * Created by Anna Kacprzak on 2016-07-29.
 */
public class Employee {



   private String firstName;
   private String surname;
   private double salary;
   private boolean hardworking;
   private String position;


    public Employee(double v){
       Employee Employee= new Employee (1000.0);

    }
    public double getSalary() {
        return salary;
    }

    public void giveRise(int percent) {
        this.salary = (this.salary/100 * percent);
    }
}
