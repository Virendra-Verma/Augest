public class ArrayCCCC {
    public static void printSubArray(int num[]){
        int total = 0;
        int crrSum = 0;
        for(int i=0; i<num.length; i++){
            for (int j=i; j<num.length; j++){
                System.out.print("( ");

                for (int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println(")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+ total);

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printSubArray(num);
    }
}
