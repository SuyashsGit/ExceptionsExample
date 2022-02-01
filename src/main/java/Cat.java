import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cat {
    public String meow(String name){
        try {
            name = name.toUpperCase();
        }catch(NullPointerException e) {  //NullPointerException is a subclass of Runtime exception--> no need to provide exception handling code
            e.printStackTrace();
            //throw e;  --> to report the exception error--> and this will exit the program after that and won't continue.
            name = "You're an idiot"; //optional if you want to print this in name variable
        }


        return name + " Meow";
    }

    public Date convertToDate(String s) throws ParseException{ //--> option 2, add throws ParseException on the main and the actual method


//        try { //--> option 1
//            return new SimpleDateFormat().parse(s);
//        }catch (ParseException pe){
//            pe.printStackTrace();
//            return null; //we cannot ignore it in this case
//        }
        return new SimpleDateFormat().parse(s);
    }
}
