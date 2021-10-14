public class squirrelPlay {
    public static void main (String [] args){
        squirrelPlay obj = new squirrelPlay();
        System.out.println(obj.squirrelPlay(70,false));
        System.out.println(obj.squirrelPlay(95,false));
        System.out.println(obj.squirrelPlay(95,true));
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
