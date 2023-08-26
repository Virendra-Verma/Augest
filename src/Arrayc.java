public class Arrayc {
    public static void reverse(int num[]){
        int first = 0;
        int last = num.length-1;
        while (first<last){
            int temp = num[last];
           num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={4,5,9,6,7,3,1};

        reverse(num);
        for(int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");

        }
        System.out.println();
    }
}
