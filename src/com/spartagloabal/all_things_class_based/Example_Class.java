package com.spartagloabal.all_things_class_based;

public class Example_Class {
//    Member Variable
//    encapsulation is hiding from the user and other class to see or use it
    private int count;
    private int newNum = count;

/*    constructor doesn't have 'type'. it doesn't need as it. also no logging
it will force an input!!! when it has object inside.
it starts on the initialization
  */

    public Example_Class(int countNum){
        this.count = countNum;
    }
// getter and setter
    public int getCount(){
        return count;
    }
//    abstraction = telling people what you need to put in, you need to put in a number
    public void setCount(int countNum){
        this.count = countNum;
    }

//    Methods
    public void doubleCount(){
        count = count * 2;
    }

//    public void newCount(int countNum){
//        int newNum = countNum;
//    }

}
