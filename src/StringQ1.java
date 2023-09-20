import java.util.Scanner;

public class StringQ1 {
    public static boolean InPleandrom(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(InPleandrom(str));

    }
}
