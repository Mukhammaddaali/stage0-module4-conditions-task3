package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((int) symbol>65&& (int) symbol<90 ||(int) symbol>97&& (int) symbol<122 )
            System.out.println("English"); else System.out.println("Non English");
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        char x = sc.next().charAt(0);
        isEnglishSymbol(x);
    }
}
