package chapters.chapter10.exercises.Exercise10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long milliSeconds) {
        this((((int) (milliSeconds / 1000)) / 3600) % 24,(((int) (milliSeconds / 1000)) / 60) % 60,
                ((int) (milliSeconds / 1000)) % 60);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        this.second = ((int) (elapseTime / 1000)) % 60;
        this.minute = (((int) (elapseTime / 1000)) / 60) % 60;
        this.hour = (((int) (elapseTime / 1000)) / 3600) % 24;
    }
}
