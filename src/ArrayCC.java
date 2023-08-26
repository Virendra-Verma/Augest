public class ArrayCC {
    public static int BinarySearch(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while ((start <= end)) {
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                return mid+1;
            }else{
                end =  mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={4,5,9,6,7,3,1};
        int key = 16;
        System.out.println(BinarySearch(num,key));
    }
}
