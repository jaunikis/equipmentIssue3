package com.company;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<String> issuesToEmployee;

    public Employee(String name) {
        this.name = name;
        this.issuesToEmployee = new ArrayList<String>();
    }

    public void addEmployeeIssue(String issue){
        issuesToEmployee.add(issue);
    }

    public void getEmployeeIssues(){
        System.out.println("List of Employee issues:");
        for(int i=0; i<issuesToEmployee.size();i++){
            System.out.println(i+". "+issuesToEmployee.get(i));
        }
    }

    public String getName() {
        return name;
    }
}
