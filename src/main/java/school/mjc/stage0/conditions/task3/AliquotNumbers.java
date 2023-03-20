package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
    if (first%second==0) System.out.println("Aliquot");else System.out.println("Not aliquot");
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x;
        int y;
        x=sc.nextInt();
        y=sc.nextInt();
        isFirstAliquot(x,y);
    }
}
