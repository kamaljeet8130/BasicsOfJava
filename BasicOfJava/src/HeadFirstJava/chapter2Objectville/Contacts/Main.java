package HeadFirstJava.chapter2Objectville.Contacts;

public class Main {
    public static void main(String[] args) {
        Contact abcContact = new Contact("abc",123456788,"abc@gmail.com");
        abcContact.print();
        System.out.println(abcContact.getName());

    }
}
