public class SubString {
    public static String Substring(String str, int s1, int e1){
        String Substr = "";
        for(int i=s1; i<e1; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb.length());
        System.out.println(sb);

    }
}
