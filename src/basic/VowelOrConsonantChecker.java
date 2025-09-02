package basic;

import java.util.Scanner;

public class VowelOrConsonantChecker {
    public static boolean isVowel(char alphabet){
        return alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        if (isVowel(alphabet))
            System.out.println("alphabet is vowel");
        else
            System.out.println("alphabet is consonant");
    }
}
