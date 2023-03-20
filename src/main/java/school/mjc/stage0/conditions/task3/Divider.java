package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number==0) System.out.println("cannot divide by zero"); else
            if (number%5==0 || number%11==0) System.out.println("Dividable"); else System.out.println( "Non-dividable" );
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a;
        a= sc.nextInt();
        isDividableBy5And11(a);
    }
}
