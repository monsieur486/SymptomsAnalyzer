package com.hemebiotech.analytics.services;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * print log messages
 */
public class Log {
    /**
     * The constant date.
     */
    public static Date date = new Date();
    /**
     * The constant formatter.
     */
    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * print log message
     *
     * @param color   color used
     * @param logType log type
     * @param message message to display
     */
    private static void PrintLogLine(String color, String logType, String message) {
        String logLine = formatter.format(date) + color + " [" + logType + "]" + ConsoleColors.RESET + " " + message ;
        System.out.println(logLine);
    }

    /**
     * log type info
     *
     * @param message the message
     */
    public static void info(String message) {
        PrintLogLine(ConsoleColors.BLUE, "info", message);
    }

    /**
     * log type error
     *
     * @param message the message
     */
    public static void error(String message) {
        PrintLogLine(ConsoleColors.RED, "error", message);
    }

    /**
     * log type succes
     *
     * @param message the message
     */
    public static void succes(String message) {
        PrintLogLine(ConsoleColors.GREEN, "succes", message);
    }
}
