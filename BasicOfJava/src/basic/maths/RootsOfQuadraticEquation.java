package basic.maths;

public class RootsOfQuadraticEquation {
    public static void quadraticEquationRoots(int a ,int b ,int c){
        int discrement = ((b*b) - (4 * a * c));
        if (discrement<0){
            return;
        }
        int firstRoot =(int) ((-b) + (Math.sqrt(discrement)))/(2*a);
        int secondRoot = (int) ((-b) - (Math.sqrt(discrement)))/(2*a);
        System.out.println(firstRoot);
        System.out.println(secondRoot);
    }

    public static void main(String[] args) {
        quadraticEquationRoots(1,1,1);
    }
}
