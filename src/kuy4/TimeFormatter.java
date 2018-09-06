package kuy4;

import java.util.ArrayList;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        ArrayList<String> list = new ArrayList<>();

        if (seconds == 0) {
            return new String("now");
        }

        int days = seconds / 86400;
        if (days > 0)
            if (days > 1) {
                list.add(String.valueOf(days) + " days");
            } else list.add(String.valueOf(days) + " day");
        int hour = (seconds - days * 86400) / 3600;
        if (hour > 0)
            if (hour > 1) {
                list.add(String.valueOf(hour) + " hours");
            } else list.add(String.valueOf(hour) + " hour");
        int min = (seconds - days * 86400) / 60;
        if (min > 0)
            if (min > 1) {
                list.add(String.valueOf(min) + " minutes");
            } else list.add(String.valueOf(hour) + " minute");
        int sec = seconds - days * 86400 - min * 60;
        if (sec > 0)
            if (sec > 1) {
                list.add(String.valueOf(sec) + " seconds");
            } else list.add(String.valueOf(hour) + " second");
        for (String str : list) {
            System.out.println(str);
        }
        return new String(list.toString());
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(87062));
    }
}
