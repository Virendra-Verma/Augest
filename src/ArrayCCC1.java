public class ArrayCCC1 {
    public static void MaxNumber(int num[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for (int j=i; j<num.length; j++){
                currSum=0;
                for (int k=i; k<=j; k++){
                    currSum+=num[k];
                }
                System.out.println("Sum : "+currSum);
                if(max<currSum){
                    max=currSum;
                }
            }

        }
        System.out.println("Max Sum : "+ max);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        MaxNumber(num);

    }
}
