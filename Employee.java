package com.company;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int fobNumber;
    private ArrayList<Issues> issuesToEmployee;

    public Employee(String name) {
        this.name = name;
        this.fobNumber=0;
        this.issuesToEmployee = new ArrayList<Issues>();
    }

    public Employee(int fobNumber,String name) {
        this.name = name;
        this.fobNumber = fobNumber;
        this.issuesToEmployee = new ArrayList<Issues>();
    }

    public void addEmployeeIssue(String date, String item){
        issuesToEmployee.add(new Issues(date,item));
    }

    public void getEmployeeIssues(){
        System.out.println("List of Employee "+this.getName()+" issues:");
        for(int i=0; i<issuesToEmployee.size();i++){
            System.out.println(i+". "+issuesToEmployee.get(i).getDate()+" | "+issuesToEmployee.get(i).getItem());
        }
    }

    public String getName() {
        return name;
    }

    public int getFobNumber(){
        return fobNumber;
    }
}
