public class love6 {
    public static void main (String [] args){
        love6 obj = new love6();
        System.out.println(obj.love6(6,4));
        System.out.println(obj.love6(4,5));
        System.out.println(obj.love6(1,5));
    }
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        int sum = a+b;
        int diff = Math.abs(a-b);
        if (sum == 6 || diff == 6)
            return true;
        else
            return false;

    }
}
