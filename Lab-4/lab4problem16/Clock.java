package lab4problem16;

public class Clock {
    private int hours, minutes, seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Clock(int seconds) {
        hours = seconds/3600;
        minutes = seconds/60;
        seconds = seconds%3600;
        this.seconds = seconds%60;
    }
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void setClock(int seconds) {
        hours = seconds/3600;
        minutes = seconds/60;
        seconds = seconds%3600;
        this.seconds = seconds%60;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void tick() {
        int seconds = this.seconds + this.minutes * 60 + this.hours * 3600 + 1;
        if (seconds > 86400) {
            seconds = seconds - 86400;
            setClock(seconds);
        }
    }
    void tickDown() {
        int seconds = this.seconds + this.minutes * 60 + this.hours * 3600 - 1;
        if (seconds <= 0) {
            seconds = 86400 - seconds;
            setClock(seconds);
        }
    }

    static Clock addClock(Clock one, Clock two) {
        int totalSecond = one.seconds + one.hours * 3600 + one.minutes * 60 + two.seconds + two.hours * 3600 + two.minutes * 60;
        return new Clock(totalSecond);
    }

    static Clock subtractClock(Clock one, Clock two) {
        int totalSecond = one.getSeconds() + one.getHours() * 3600 + one.getSeconds() * 60 - two.getSeconds() - two.getHours() * 3600 - two.getMinutes() * 60;
        return new Clock(totalSecond);
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }


}
