public class BasicFactorial {
    public static int factorial(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int BinomialCoefficient(int n,int r){
        int fact_n=factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int fact = fact_n/(fact_r*fact_nmr);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Factorial : "+factorial(7));

        System.out.println("Binomial Coefficient : "+BinomialCoefficient(5,2));
    }
}
