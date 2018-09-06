package kuy4;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return new String("now");
        }
        int days = seconds / 86400;
        int hour = (seconds - days * 86400) / 3600;
        int min = (seconds - days * 86400) / 60;
        int sec = seconds - days * 86400 - min * 60;
        return new String(days + " " + hour + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(0));
    }
}
