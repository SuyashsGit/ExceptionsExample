package com.sparta.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //using the parameterised version of the arraylist (using generics)
        ArrayList<String> l = new ArrayList<>(List.of("Suyash", "SDCKJJK", "HDGDJHBD"));

        l.add("new Cat()");

        //Cat c = (Cat)l.get(3); //forcing the object retrieved from the list to be a cat -->typecast

        System.out.println(l);
        System.out.println(l.get(0));
    }
}
