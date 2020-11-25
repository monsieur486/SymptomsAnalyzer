package com.hemebiotech.analytics.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static Date date = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void i(String message) {
        System.out.println(formatter.format(date) + ConsoleColors.BLUE + " [info]" + ConsoleColors.RESET + ": " + message);
    }

    public static void e(String message) {
        System.out.println(formatter.format(date) + ConsoleColors.RED + " [error]" + ConsoleColors.RESET + ": " + message);
    }

    public static void s(String message) {
        System.out.println(formatter.format(date) + ConsoleColors.GREEN + " [succes]" + ConsoleColors.RESET + ": " + message);
    }

    public static void w(String message) {
        System.out.println(formatter.format(date) + ConsoleColors.YELLOW + " [waring]" + ConsoleColors.RESET + ": " + message);
    }
}
