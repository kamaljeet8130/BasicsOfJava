package basic;

import java.util.Scanner;

public class CheckForAlphabetCharacter {
    public static boolean isCharacterAlphabet(char character){
        return (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        if (isCharacterAlphabet(character))
            System.out.println("character is alphabet");
        else
            System.out.println("character is not alphabet");
    }
}
