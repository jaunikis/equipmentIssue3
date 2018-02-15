package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//       Employee darb=new Employee("vardas");
//       darb.addEmployeeIssue("5in knife");
//       darb.addEmployeeIssue("Helmet");
//       darb.getEmployeeIssues();
//
//        System.out.println();

        Departament bh = new Departament("BH");
        bh.addEmployee(4144,"vardas pavarde");
        bh.addEmployee("vardas2 pavarde2");
        bh.getEmployeesList("Boning Hall");

        bh.addEmployeeIssue(0,"10/02/2018","helmet");
        bh.addEmployeeIssue(0,"13/02/2018","5in boning knife");
        bh.addEmployeeIssue(0,"15/02/2018","7in trimming knife");

        bh.addEmployeeIssue(1,"09/02/2018","5in boning knife");

        bh.getEmployeeIssues(0);
        bh.getEmployeeIssues(1);

        Factory abpClones=new Factory("ABP Clones");
        abpClones.addEmployee("BH",333,"name");
        abpClones.addEmployee("BH",444,"name222");

        abpClones.addEmployee("AB",160,"Romualdas Debesiunas");

        abpClones.getDepartamentsList();

        abpClones.getEmployeesList("BH");
        abpClones.getEmployeesList("AB");

    }
}
