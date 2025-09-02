package basic.maths;

public class FractionUse {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(10,20);
        fraction.print();
        Fraction fraction1 = new Fraction(10,20);
        fraction1.add(fraction);
        fraction1.print();
    }
}


class Fraction{
    private int numerator;
    private int denominator;
    Fraction(int numerator,int denominator){
        if(denominator ==0){
            throw new ArithmeticException("/ by zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }
    private void simplify(){
        int gcd =1;
        int smaller = Math.min(numerator,denominator);
            for (int i = 2;i<=smaller;i++){
                if(numerator%i==0 && denominator%i==0){
                    gcd = i;
                }
            }
            numerator = numerator/gcd;
            denominator = denominator/gcd;
        }
    public void print(){
        if(denominator==1)
            System.out.println(numerator);
        else
            System.out.println(numerator + " / "+ denominator);
    }
    public void add(Fraction fraction){
        this.numerator = this.numerator*fraction.denominator + this.denominator*fraction.numerator;
        this.denominator = this.denominator*fraction.denominator;
        simplify();
    }

}
