package com.sparta.exceptions;

import java.text.ParseException;

public class CatDriver
{
    public static void main(String[] args) throws ParseException, CatException
    {
        Cat angel = new Cat();
        try{
        System.out.println(angel.meow(null));
    } catch(CatException e)
        {
        e.printStackTrace();
    }
        System.out.println("Finished");
        System.out.println(angel.convertToDate("2022-02-02"));
    }
}
