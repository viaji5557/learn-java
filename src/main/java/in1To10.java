public class in1To10 {
    public static void main  (String [] args ){
        in1To10 obj =new in1To10();
        System.out.println(obj.in1To10(5,false));
        System.out.println(obj.in1To10(11,false));
        System.out.println(obj.in1To10(11,true));

    }
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode)
            return n >= 1 && n <= 10;
        else
            return n <= 1 || n >= 10;
    }
}
