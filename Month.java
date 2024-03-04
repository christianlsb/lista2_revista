public class Month {
    private int month;

    public Month(int month) {
        this.month = month;
    }

    public static final Month JANUARY = new Month(1);
    public static final Month FEBRUARY = new Month(2);
    public static final Month MARCH = new Month(3);
    public static final Month APRIL = new Month(4);
    public static final Month MAY = new Month(5);
    public static final Month JUNE = new Month(6);
    public static final Month JULY = new Month(7);
    public static final Month AUGUST = new Month(8);
    public static final Month SEPTEMBER = new Month(9);
    public static final Month OCTOBER = new Month(10);
    public static final Month NOVEMBER = new Month(11);
    public static final Month DECEMBER = new Month(12);

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    
    //toString

    public String toString() {
        return "Month: " + month;
    }
}

