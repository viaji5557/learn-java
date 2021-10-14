public class specialEleven {
    public static void main (String [] args){
        specialEleven obj = new specialEleven();
        System.out.println(obj.specialEleven(22));
        System.out.println(obj.specialEleven(23));
        System.out.println(obj.specialEleven(24));
    }
    public boolean specialEleven(int n) {
        return n%11==0 || n%11==1;
    }

}
