public class more20 {
    public static void main (String [] args ){
        more20 obj = new more20();
        System.out.println(obj.more20(20));
        System.out.println(obj.more20(21));
        System.out.println(obj.more20(22));


    }
    public boolean more20(int n) {
        int a=n%20;
        return a<3&&a!=0;
    }

}
