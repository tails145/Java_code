import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class MyDate implements Comparable<MyDate> {
    int year, month, day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int compareTo(MyDate d) {
        if((this.year == d.year) && (this.month == d.month) && (this.day == d.day)) {
            return 0;
        }
        return (this.year > d.year || this.year == d.year && this.month > d.month || this.year == d.year &&
                this.month == d.month && this.day > d.day) ? 1 : -1;
    }
}

public class CalendarTest {
    public static void main(String[] args) {
        Calendar g = Calendar.getInstance();
        MyDate md = new MyDate(g.get(Calendar.YEAR),g.get(Calendar.MONTH) + 1,g.get(Calendar.DATE));
        System.out.println(md.year + "年" + md.month + "月" + md.day + "日");
        System.out.println(g.get(Calendar.HOUR) + ":" + g.get(Calendar.MINUTE) + ":" + g.get(Calendar.SECOND));
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日E a hh时mm分ss秒");
        String formatDate = sdf.format(d);
        System.out.println(formatDate);
        String s = formatDate.substring(0,4);
        int year = Integer.parseInt(s);
        System.out.println
                (year + (((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0)) ? "是" : "不是") + "闰年");
        MyDate d1 = new MyDate(2017,9,2);
        MyDate d2 = new MyDate(2017,6,2);
        if(d1.compareTo(d2) == 1) {
            System.out.println("d1>d2");
        }
        else if(d1.compareTo(d2) == -1) {
            System.out.println("d1<d2");
        }
        else {
            System.out.println("d1=d2");
        }
        System.out.println("d1= " + String.valueOf(d1.year).substring(2) + "年" + d1.month + "月" + d1.day + "日");
        System.out.println("d2= " + Integer.toString(d2.year).substring(2) + "年" + d2.month + "月" + d2.day + "日");
    }
}
