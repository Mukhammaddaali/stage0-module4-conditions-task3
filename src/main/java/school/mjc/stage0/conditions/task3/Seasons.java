package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month>=3 && month<6) System.out.println("Spring");
        else if (month>=6&&month<9) System.out.println("Summer");
        else if (month>=9&&month<12) System.out.println("Autumn");
        else if (month==12 || month>0&& month<3) System.out.println("Winter");
                else System.out.println("wrong number!");
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x;
        x= sc.nextInt();
        tellTheSeasonByMonthNumber(x);
    }
}
