import java.util.Date;
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        int t=10000;
        for(int i=4;i<=11;i++) {
            date.setTime(date.getTime() + t);
            System.out.println(date.toString());
            t *= 10;
        }
    }
}
