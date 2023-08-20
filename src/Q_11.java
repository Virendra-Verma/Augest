
public class Q_11 {
    public static void hollow(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || j==1||i==a||j==b){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid(int a,int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid_no(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyd(int a ){
        int n = 1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    public static void triangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Question :- 1.....................");
        hollow( 5,6);
        System.out.println("Question :- 2......................");
        Half_Pyramid(10,8);
        System.out.println("Question :- 3......................");
        Half_Pyramid_no(6);
        System.out.println("Question :- 4......................");
        floyd(6);
        System.out.println("Question :- 5......................");
        triangle(6);

    }
}
