package exceptionHandling;

public class ExceptionHandlingConcept8 {
    public static void main(String[] args) {
        String[] s = {"abc","123",null,"xyz"};
        for (int i =0;i<s.length;i++){
            try{
                int a = s[i].length()+ Integer.parseInt(s[i]);
                System.out.println(a);
            }catch (java.lang.NumberFormatException e){
                System.out.println("Number formate Exception will be caught for i " + s[i] + " at position " + i);
            }
            catch (java.lang.NullPointerException e){
                System.out.println("Null pointer execption caught for " + s[i] + " at position " + i);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundException caught " + s[i] + " at position " + i);
            }

        }
    }
}
