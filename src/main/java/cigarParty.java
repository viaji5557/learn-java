public class cigarParty {
    public static void main (String [] args) {
        cigarParty obj = new cigarParty();
        System.out.println(obj.cigarParty(30,false));
        System.out.println(obj.cigarParty(50,false));
        System.out.println(obj.cigarParty(70,false));

    }

    public boolean cigarParty(int cigars,boolean isWeekend){
            if (isWeekend == true && cigars >= 40) {
                return true;
            }
            if (!(isWeekend) && cigars >= 40 && cigars <= 60) {
                return true;

            }
            else {
                return false;
            }




    }
}
