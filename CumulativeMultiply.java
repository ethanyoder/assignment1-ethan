/**
 * Created by Ethan on 1/18/2018.
 * This program takes an array of numbers and returns an array that multiplies each one by the next, with an addition of 3 on each.
 * Example: for {1,2,3} it would return {1,5,18}
 * Think of it as a factorial for any ordering of numbers (with an addition of 3 on the end of each operation)
 * The goal here is to look at the 5 commented violations and correct them.  Good luck!
 */

import java.util.ArrayList;

public class CumulativeMultiply {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(5);
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        ArrayList<Double> newList = multiplyArray(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    private static ArrayList<Double> multiplyArray(ArrayList l) {   //Violation #1: Using raw types - https://wiki.sei.cmu.edu/confluence/display/java/DCL61-J.+Do+not+use+raw+types?src=contextnavpagetreemode
        int i = 0;  //Violation #2: Did not minimize scope of variables - https://wiki.sei.cmu.edu/confluence/display/java/DCL53-J.+Minimize+the+scope+of+variables?src=contextnavpagetreemode
        for (i = 0; i < l.size() - 1; i++) {
            if (l.get(i) = 0)  //Violation #3: Performed assignment inside conditional expression - https://wiki.sei.cmu.edu/confluence/display/java/EXP51-J.+Do+not+perform+assignments+in+conditional+expressions
                l.set(i + 1, 0.0); //Violation #4: Did not use braces for the body of an if statement - https://wiki.sei.cmu.edu/confluence/display/java/EXP52-J.+Use+braces+for+the+body+of+an+if%2C+for%2C+or+while+statement?src=contextnavpagetreemode
            else
                l.set(i + 1, 3 + l.get(i) * l.get(i+1)); //Violation #5: Did not use parenthesis for order of operation - https://wiki.sei.cmu.edu/confluence/display/java/EXP53-J.+Use+parentheses+for+precedence+of+operation

        }
        return l;
    }

}
