import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.ParseException;

public class CatDriver {
    public static void main(String[] args) throws ParseException {
        Cat angel = new Cat();
        System.out.println(angel.meow(null));
        System.out.println("Finished");

        System.out.println(angel.convertToDate("2022-02-01"));
    }
}
