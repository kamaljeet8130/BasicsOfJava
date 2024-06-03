package exceptionHandling;

import java.util.Scanner;

public class InvalidWithdrawMoneyException  {
    public static void main(String[] args) {
        int balance = 500;
        Scanner sc = new Scanner(System.in);
        int withdrawMoney = sc.nextInt();
        try{
            if (withdrawMoney>balance){
                throw new InvalidTransaction();
            }
            else {
                System.out.println("Transaction Successful");
            }
        }catch (InvalidTransaction ex){
            System.err.println(ex);
        }

    }


}


class InvalidTransaction extends ArithmeticException{
    @Override
    public String toString(){
        return "you don't have that much money in your account";
    }
}