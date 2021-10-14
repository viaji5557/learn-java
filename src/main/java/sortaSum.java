public class sortaSum {
    public static void main (String [] args ){
        sortaSum obj = new  sortaSum();
        System.out.println(obj.sortaSum(3,4));
        System.out.println(obj.sortaSum(9,4));
        System.out.println(obj.sortaSum(10,11));
    }
    public int sortaSum(int a, int b) {
        int sum = a+b;
        if(sum >= 10 && sum <= 19)
            return 20;
        else
            return sum;
    }

}
