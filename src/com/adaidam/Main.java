package com.adaidam;

public class Main {

    public static void main(String[] args) {
	/* to use Cat and Dog class, we need to create
        instance(objects of the class)
         */
        //instance of Dog class
        Dog myDog = new Dog();

        //instance of Cat class
        Cat myCat = new Cat();

        //instance of hedgehog
        Hedgehog myHedgehog = new Hedgehog();

        myCat.sound = "meow";
        myDog.sound = "woof";
        myHedgehog.sound = "snuffle";
        myCat.typeOfCoat();
        myDog.typeOfCoat();
        myHedgehog.typeOfCoat();


        System.out.println("The cat goes " + myCat.sound + ", the dog goes " + myDog.sound + ", and the hedgehog goes " + myHedgehog.sound + "!");

    }
}
