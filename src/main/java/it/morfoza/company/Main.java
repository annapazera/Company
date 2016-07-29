package it.morfoza.company;

/**
 * Created by Anna Kacprzak on 2016-07-29.
 */
public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Company company2 = new Company();

        System.out.println(company);
        System.out.println(company2);


        System.out.println("company total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company.calculateTotalSalaries());

        company.giveRise(10);
        System.out.println("----------------------RISE---------------------------------");

        System.out.println("company total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company2.calculateTotalSalaries());

        System.out.println(company.toString());
        System.out.println(company2.toString());
    }
}