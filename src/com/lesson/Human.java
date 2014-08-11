package com.lesson;


public class Human {

    private static final int MIN_AGE = 0 , MAX_AGE = 120 , MIN_NAME_LENGHT = 3;
    private String name;
    private int age;

    public void setAge(int newAge){

        if (newAge > MIN_AGE && newAge < MAX_AGE) {
            age = newAge;
        } else {
            System.out.println("ERRRORRR!!!!");
        }

    }

    public int getAge(){

        return age;

    }


    public String getName(){

        return name;


    }
    public void setName(String newName){
        if(newName != null && newName.length() >= MIN_NAME_LENGHT) {
            name = newName;
        }

    }


}
