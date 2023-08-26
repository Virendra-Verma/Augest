public class ArrayCCC {
    public static void printPair(int num[]){
        int total = 0;
        for(int i=0; i<num.length; i++){
            int curr = num[i];
            for(int j =i+1; j< num.length; j++){
                System.out.print("("+curr+","+num[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total no of pair : "+ total);
    }
    public static void main(String[] args) {
        int num[] = {4,5,6,7,8,9};
        printPair(num);
    }
}
