package chapterEight;

public class Time1 {
    private  int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >=60
                || second <0 || second>=60) {
            throw new IllegalArgumentException
                    ("Hour, minute and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%2d:%02d %s",
                ((hour == 0 || hour==12) ? hour : hour%12), minute, second,
                (hour <12 ? "AM" : "PM"));
    }
}
