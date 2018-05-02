package jmm;

import java.math.BigInteger;


public class StackOverflowExc {
    public static void main(String[] args) {
        StackOverflowExc soe=new StackOverflowExc();
        soe.recursion();
    }
    private void recursion(){
        Object obj= new Object();
        recursion();
    }
}
