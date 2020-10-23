package com.jjd.data.structures.statck;

import java.util.Stack;

/**
 * @author jjd
 * @date 2020-10-20
 */
public class Evaluate {

    public static void main(String[] args) {
        Stack<Character> ops = new Stack<>();
        Stack<Double> values = new Stack<>();

        String val = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        char[] chars = val.toCharArray();
        for (char aChar : chars) {
            if ('(' == aChar || ' ' == aChar ) {

            } else if ('+' == aChar) {
                ops.push(aChar);
            } else if ('*' == aChar) {
                ops.push(aChar);
            } else if ('-' == aChar) {
                ops.push(aChar);
            } else if (')' == aChar) {
                /*Double pop0 = values.pop();
                Double pop1 = values.pop();
                Character pop = ops.pop();
                if (pop == '+') {
                    double v = pop0 + pop1;
                    values.push(v);
                } else if (pop == '-') {
                    double v = pop0 - pop1;
                    values.push(v);
                } else if (pop == '*') {
                    double v = pop0 * pop1;
                    values.push(v);
                }*/
                Character pop = ops.pop();
                Double v = values.pop();
                if ('+' == pop) {
                    v = values.pop() + v;
                }//...
                values.push(v);
            } else {
                values.push(Double.parseDouble(String.valueOf(aChar)));
            }
        }
        System.out.println(values.peek());
    }
}
