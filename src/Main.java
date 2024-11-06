import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testing methods from input helper
        Scanner scan = new Scanner(System.in);

        //testing get int
        int x = InputHelper.getInt(scan, "Please input a number");
        int c = InputHelper.getRangedInt(scan, "Please input a number between 1-5", 1, 5);
        int v = InputHelper.getPositiveNonZeroInt(scan, "please input a positive integer");
        double b = InputHelper.getDouble(scan, "Please input a double");
        double n = InputHelper.getRangedDouble(scan, "Please input a number between 1-5", 1, 5);
        boolean m = InputHelper.getYNConfirm(scan, "enter y or n");
        String h = InputHelper.getNonZeroLenString(scan, "Please enter a word");
        String a = InputHelper.getRedExString(scan, "please enter a number in this format xxx-xxx-xxxx", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);
        System.out.println(b);
        System.out.println(n);
        System.out.println(m);
        System.out.println(h);
        System.out.println(a);


    }
}
