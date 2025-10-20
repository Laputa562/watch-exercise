public class watch {
    private int hour;
    private int minute;
    private int seconds;

    public watch(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public watch(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = 0;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void display() {
        System.out.println(getHour() + ":" + getMinute() + ":" + getSeconds());

    }
}
