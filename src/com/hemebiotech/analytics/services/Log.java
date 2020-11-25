package com.hemebiotech.analytics.services;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * print log messages
 */
public class Log {
    public static Date date = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * print log message
     * @param color
     * @param logType
     * @param message
     */
    private static void PrintLogLine (String color, String logType, String message){
        String logLine = formatter.format(date) + color + " [" + logType + "]" + ConsoleColors.RESET + " " + message;
        System.out.println(logLine);
    }

    /**
     * log type info
     * @param message
     */
    public static void info(String message) {
        PrintLogLine(ConsoleColors.BLUE, "info", message);
    }

    /**
     * log type error
     * @param message
     */
    public static void error(String message) {
        PrintLogLine(ConsoleColors.RED, "error", message);
    }

    /**
     * log type succes
     * @param message
     */
    public static void succes(String message) {
        PrintLogLine(ConsoleColors.GREEN, "succes", message);
    }
}
