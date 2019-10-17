package com.spartagloabal.all_things_class_based;

import com.spartagloabal.all_things_class_based.foodbar.Animal;
import com.spartagloabal.all_things_class_based.foodbar.Mammal;

public class Main {

    public static void main(String[] args) {
	// instantiate
//        Example_Class exampleClass = new Example_Class(6);
//        System.out.println(exampleClass.getCount());
//        exampleClass.setCount(10);
//        exampleClass.doubleCount();
//        System.out.println(exampleClass.getCount());

        Animal bob = new Animal(2, "beak", 2);
//        bob.eat();
        Mammal genie = new Mammal(2,"Big Mouth",5);
        genie.eat();
        genie.selfHeating();
        genie.evacuate();
        genie.makeNoise("hey");
        genie.makeNoise("heyy", "HEEEEEYYYYYYYYYY!!!!!");
    }
}
