public class dateFashion {
    public static void main(String [] args) {
        dateFashion obj = new dateFashion();
        System.out.println(obj.dateFashion(5,10));
        System.out.println(obj.dateFashion(5,2));
        System.out.println(obj.dateFashion(5,5));
    }
        public int dateFashion ( int you, int date){
            if (you <= 2 || date <= 2) {
                return 0;
            }
            else if (you <= 8 || date <= 8) {
                return 2;
            }
            else
                return 1;
        }
    }


