public class StringQ2 {
    public static float getShortestPath(String path){
        int x=0; int y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
                if(dir =='N'){
                    y++;
                } else if(dir =='S'){
                    y--;
                }else if(dir =='W'){
                    x--;
                } else {
                    x++;
                }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
//        String path = "WNEENESENNN";
//        System.out.println(getShortestPath(path));
        String s1 = "Virendra";
        String s2 = "Virendra";
        String s3 = new String("Virendra");
        if(s1==s2){
            System.out.println("The String is equal.");
        }else {
            System.out.println("The string is not equal.");
        }
        if(s1.equals(s3)){
            System.out.println("The String is equal.");
        }
        else {
            System.out.println("The string is not equal.");
        }


    }

}
