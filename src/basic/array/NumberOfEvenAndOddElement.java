package basic.array;

public class NumberOfEvenAndOddElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        CountResult result = OddEvenCount.oddEvenCount(arr,arr.length);
        System.out.println(result.evenCount + "even count");
        System.out.println(result.oddCount+"odd Count");
    }

}

class CountResult{
    public int evenCount;
    public int oddCount;
    public CountResult(int evenCount,int oddCount){
        this.evenCount = evenCount;
        this.oddCount = oddCount;
    }
}

class OddEvenCount{
    public static CountResult oddEvenCount(int[] arr,int n){
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0;i<n;i++){
            if (arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        return new CountResult(evenCount,oddCount);
    }
}
