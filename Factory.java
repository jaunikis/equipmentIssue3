package com.company;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Departament> departaments;

    public Factory(String name) {
        this.name = name;
        this.departaments=new ArrayList<Departament>();
    }

    public void addEmployee(String departament,int fobNumber,String name){


        //if not in the list then create departament.
        if(checkNumberInArray(departament)<0){
            System.out.println("adding new departament.");
            departaments.add(new Departament(departament));
        }
        departaments.get(checkNumberInArray(departament)).addEmployee(fobNumber,name);
    }

    private int checkNumberInArray (String departament){
        //checking for same departament name in arraylist.
        int xx=-1;
        for(int i=0;i<departaments.size();i++){
            if(departament.equals(departaments.get(i).getName())){xx=i;}
        }
        return xx;
    }

    public void getDepartamentsList(){
        System.out.println("The list of departaments:");
        for(int i=0;i<departaments.size();i++){
            System.out.println(i+". "+departaments.get(i).getName());
        }
    }

    public void getEmployeesList(String departament){
        departaments.get(checkNumberInArray(departament)).getEmployeesList(departament);
    }
}
