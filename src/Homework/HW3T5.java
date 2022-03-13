package Homework;

import javax.xml.bind.SchemaOutputResolver;

public class HW3T5 {


    public static void main(String[] args) {


        double $inSom=85.50;
        // 1$=84.80;
        //1som=0.012$;
        double som1=3500;
        double dollar=som1/$inSom;
        System.out.println(som1 + "som =" +dollar +"$");
        double dollar1=40;
        double som=dollar1*$inSom;
        System.out.println(dollar1 +"$ ="+som +"som");


    }
}
