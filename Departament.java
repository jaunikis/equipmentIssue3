package com.company;

import java.util.ArrayList;

public class Departament {
    private String name;
    private ArrayList<Employee> employees;


    public Departament(String name) {
        this.name = name;
        this.employees=new ArrayList<Employee>();
    }

    public void addEmployee(String name){
        employees.add(new Employee(name));
    }
    public void addEmployee(int fobNumber,String name){
        employees.add(new Employee(fobNumber,name));
    }


    public void getEmployeesList(String departament){
        System.out.println("List of "+departament+" employees: ");
        for(int i=0;i<employees.size();i++){
            System.out.println(i+". "+employees.get(i).getFobNumber()+" "+employees.get(i).getName());
        }
    }

    public void getEmployeeIssues(int empIndex){
        employees.get(empIndex).getEmployeeIssues();
    }

    public void addEmployeeIssue(int empIndex,String date,String item){
        employees.get(empIndex).addEmployeeIssue(date,item);
    }

    public String getName() {
        return name;
    }
}
