package HeadFirstJava.chapter1BreakingTheSurface;

public class PhraseOMatic {
    public static void main(String[] args) {
        int i = 5;
        while(i>0){
            String[] wordListOne = {"agnostic","opinionated","voice activated","haptically drive","extensible","reactive","agent based","functional","AI enabled","strongly typed"};
            String[] wordListTwo= {"loosely coupled","six sigma","asynchronous","event driven","pub-sub","IOT","cloud","native","service oriented","containerized","serverless","microservices","disturbed ledger"};
            String[] wordListThree = {"framework","library","DSL","REST API","repository","pipeline","services","mesh","architecture","perspective","design","orientation"};

            int lengthOne = wordListOne.length;
            int lengthTwo = wordListTwo.length;
            int lengthThree = wordListThree.length;

            java.util.Random randomGenerator = new java.util.Random();
            int random1 = randomGenerator.nextInt(lengthOne);
            int random2 = randomGenerator.nextInt(lengthTwo);
            int random3 = randomGenerator.nextInt(lengthThree);

            String phrase = wordListOne[random1]+ " " + wordListTwo[random2] + " " + wordListThree[random3];

            System.out.println("what we need is : " + phrase);
            i--;
        }




    }
}
