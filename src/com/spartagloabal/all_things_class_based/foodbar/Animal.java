package com.spartagloabal.all_things_class_based.foodbar;
// polymorphism is a class that can take many form: like animal can be cat and take on new behaviours
// inheritance animals has behaviours and can be extends them to other class such as Mammals and Bipeds
// encapsulating are getter/setter, public/private
public class Animal {

    private int numOfLegs;
    private String mouth;
    private int numOfEyes;

    public Animal(int numOfLegs, String mouth, int numOfEyes){
        this.mouth = mouth;
        this.numOfEyes = numOfEyes;
        this.numOfLegs = numOfLegs;
    }

    public void breathe(){
        System.out.println("in and out");
    }

    public void eat(){
        System.out.println("goes in and goes out");
    }

    public void sleep(){
        System.out.println("close that eyes bra");
    }

    public void evacuate(){
        System.out.println("Braaaceeeee your selff");
    }

    public void proCreate(){
        System.out.println("wocka wocka");
    }
}
