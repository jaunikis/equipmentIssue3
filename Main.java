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
        bh.addEmployee("vardas pavarde");
        bh.addEmployee("vardas2 pavarde2");
        bh.getEmployeesList();

        bh.addEmployeeIssue(0,"10/02/2018","helmet");
        bh.addEmployeeIssue(0,"13/02/2018","5in boning knife");
        bh.addEmployeeIssue(0,"15/02/2018","7in trimming knife");

        bh.addEmployeeIssue(1,"09/02/2018","5in boning knife");

        bh.getEmployeeIssues(0);
        bh.getEmployeeIssues(1);


    }
}
