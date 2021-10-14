public class cigarParty {
    public static void main (String [] args) {
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
