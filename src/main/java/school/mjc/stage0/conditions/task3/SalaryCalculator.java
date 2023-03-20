package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<0) System.out.println("wrong input!");
        else if (salary<10001) System.out.println((salary*0.85));
        else if (salary< 20001) System.out.println(salary*0.82);
        else System.out.println( salary*0.8);

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        calculateSalary(x);

    }
}
