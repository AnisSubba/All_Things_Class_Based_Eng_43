package com.spartagloabal.all_things_class_based.foodbar;

public class Mammal extends Animal{

//    animal is the class its extending from, that why it needs super
    public Mammal(int numOfLegs, String mouth, int numOfEyes) {
        super(numOfLegs, mouth, numOfEyes);
    }

    public void selfHeating(){
        System.out.println("going to run to warm up");
    }

    public void generateMilk(){
        System.out.println("no need to go to the shops");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("pass the knife and fork" );
    }
    @Override
    public void evacuate(){
        System.out.println("Hey how you doing... baaammmmmm");
    }

    public void makeNoise(String noise){
        System.out.println(noise);
    }

    public void makeNoise(String noise, String louder){
        System.out.println(noise + " " + louder);
    }

}
