package com.sparta.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cat
{
    public String meow(String name) throws CatException
    {
        try {
            name = name.toUpperCase();
        }catch(NullPointerException e)
        {  //NullPointerException is a subclass of Runtime exception--> no need to provide exception handling code
            throw new CatException("Cat exception occured!", e);
            //throw e;  //--> to report the exception error--> and this will exit the program after that and won't continue.
        }finally
        {
            if (name == null)
                name = "Dummy value";
        }
        return name + " Meow";
    }

    public Date convertToDate(String s)
    { //--> option 2, add throws ParseException on the main and the actual method
    Date result = null;

        try {                               //--> option 1
            result = new SimpleDateFormat().parse(s);

        } catch( NullPointerException| ParseException e)
        {
            e.printStackTrace();
            //return null;                    //we cannot ignore it in this case
        }
        finally { // finally is always executed regardless what happens in the try catch
            System.out.println("This is always executed");
        }
        return result;
    }
}
