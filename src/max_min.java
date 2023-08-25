public class max_min {
    public static int getMax(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;

    } public static int getMin(int num[]){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(small>num[i]){
                small=num[i];
            }
        }
        return small;

    }
    public static void main(String[] args) {
        int num[] = {4,5,8,6,3,9,7};
        System.out.println("Largest Value : "+ getMax(num));
        System.out.println("Smallest Value : "+getMin(num));

    }
}
