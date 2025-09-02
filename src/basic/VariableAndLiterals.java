package basic;

public class VariableAndLiterals {
    public static void main(String[] args) {
        int decimalLiteral = 100;
        int binaryLiteral = 0b1100100;
        int octalLiteral = 0333;
        int hexadecimalLiteral = 0xface;

        System.out.println("decimal literal: " + decimalLiteral);
        System.out.println("binary Literal: " + binaryLiteral);
        System.out.println("octal Literal : " + octalLiteral);
        System.out.println("hexa decimal Literal : " + hexadecimalLiteral);


        // floating point literal :
        float floatLiteral = 1234.534f;
        double doubleLiteral = 3.2343e10;
        System.out.println(floatLiteral + " float literal ");
        System.out.println(doubleLiteral + " double literal");

        // char literal :
        char charLiteral = 'a';
        System.out.println(charLiteral + " char literal");
        char charLiteral2 = 98;
        System.out.println("integral literal : "+ charLiteral2);
        char charLiteral3 = '\uface';
        System.out.println("unicode literal : " + charLiteral3);

        //string literal :
         String stringLiteral = "hello world";
        System.out.println("string literal : " + stringLiteral);


    }
}
