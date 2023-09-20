import java.util.Scanner;

public class string {
    public static void PrintLatter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       char arr[] = {'a','b','c','d'};
       String str1 = "abcd";
       String str2 = new String("xyz");
        System.out.print("Enter a String : ");
       Scanner sc = new Scanner(System.in);
       String name;
       name = sc.nextLine();
        System.out.println(name);
        String fullName = "Virendra";
        System.out.println("The length of the String : "+ fullName.length());

        //Concatenation
        System.out.println("//Concatenation.............");
        String fastName = "Virendra";
        String LastName = "Verma";
        String FullName = fastName+" "+LastName;
        System.out.println(FullName);
        System.out.print("Print all latter of the String : ");
        PrintLatter(FullName);

    }
}
