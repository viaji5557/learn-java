public class alarmClock {
    public static void main (String [] args ){
        alarmClock obj = new alarmClock();
        System.out.println(obj.alarmClock(1,false));
        System.out.println(obj.alarmClock(5,false));
        System.out.println(obj.alarmClock(0,false));
    }
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if(day > 0 && day != 6)
                return "10:00";
            else
                return "off";
        }
        else if (day > 0 && day != 6)
            return "7:00";
        else
            return "10:00";

    }

}
