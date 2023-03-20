package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character=='A'||character=='a'||character=='E'||character=='e'||character=='i'||character=='I' ||character=='O'||character=='o'||character=='U'||character=='u')
            System.out.println("Vowel");
        else if (character>='A'&&character<='Z'||character>='a'&&character<='z') System.out.println("Consonant"); else
            System.out.println("wrong alphabet!");

    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        vowelDeterminer(a);
    }
}
