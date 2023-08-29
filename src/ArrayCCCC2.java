public class ArrayCCCC2 {
    public static void MaxSubArray(int num[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0]=num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0; i<num.length; i++){
            for (int j=i; j<num.length; j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max<currSum){
                    max=currSum;
                }
            }
        }
        System.out.println("Max Sum : "+ max);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,-1,-9,8,10};
        MaxSubArray(num);
    }
}
