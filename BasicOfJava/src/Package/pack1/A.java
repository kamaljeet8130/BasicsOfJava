package Package.pack1;

class A{
    public static void main(String[] args) {
        int i = 0;
        int binaryNumber = 0;
        int number = 20;  /// 0000000......0010100 & 1
        while(number!=0){
            int bit = number & 1;
            binaryNumber = (bit * (int)Math.pow(10,i)  + binaryNumber);
            number>>=1;
            i++;
        }

        System.out.println(binaryNumber);
    }

}