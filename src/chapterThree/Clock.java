package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        validateTime();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        validateTime();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        validateTime();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        validateTime();
    }

    private void validateTime(){
        if(hour>23||minute>59||second>59){
            hour =0;
            minute =0;
            second =0;
        }
    }

    public String displayTime() {
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
}
