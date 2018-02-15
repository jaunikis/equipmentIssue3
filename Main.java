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

        bh.addEmployeeIssue(0,"7in trimming knife");
        bh.getEmployeeIssues(0);


    }
}
