public class in1To10 {
    public static void main  (String [] args ){

    }
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode)
            return n >= 1 && n <= 10;
        else
            return n <= 1 || n >= 10;
    }
}
