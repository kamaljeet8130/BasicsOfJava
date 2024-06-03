package basic;

public class UserDefineException {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>60){
            throw new TooOldException("too old to get marry");
        }
        else if(age<18){
            throw new TooYoungException("too young to get marry");
        }
        else
            System.out.println("perfect to get marry");
    }
}

class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
