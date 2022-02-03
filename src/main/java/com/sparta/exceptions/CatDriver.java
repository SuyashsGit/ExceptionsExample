package com.sparta.exceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.ParseException;

public class CatDriver
{
    public static Logger logger = LogManager.getLogger("Cat Logger");

    public static void main(String[] args)
    {
        Cat angel = new Cat();

        logger.info("Just created a cat object");

        try{
        System.out.println(angel.meow("Angel"));
    } catch(CatException e)
        {
        e.printStackTrace();
    }
        System.out.println("Finished");
        System.out.println(angel.convertToDate("2022-02-02"));
    }
}
