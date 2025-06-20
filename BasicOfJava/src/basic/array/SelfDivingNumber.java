package basic.array;

import java.util.ArrayList;
import java.util.List;

public class SelfDivingNumber {
    public static  List<Integer> selfDividingNumbers(int left,int right) {
        List<Integer> list = new ArrayList<>();
        for (int i =left;i<=right;i++){
            int tempNumber = i;
            boolean isSelfDiving = true;
            while (tempNumber>0){
                int digit = tempNumber%10;
                if (digit==0 || i%digit!=0) {
                    isSelfDiving = false;
                    break;
                }
                tempNumber/=10;
            }
            if(isSelfDiving){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        for (int i :selfDividingNumbers(47,85)){
            System.out.println(i);
        }
    }
}
