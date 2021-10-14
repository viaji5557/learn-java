public class squirrelPlay {
    public static void main (String [] args){
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && temp <= 100 && temp >= 60)
            return true;
        if (!(isSummer) && temp <= 90 && temp >=60)
            return true;
        else
            return false;
    }

}
