package ru.zerobone.jlogger;

public class Logger {

    public static void log(String text) {

        System.out.println("[S]: " + text);

    }

    public static void log(int num) {

        System.out.println("[S]: " + num);

    }

    public static void log(long num) {

        System.out.println("[S]: " + num);

    }

    public static void log(StringBuilder sb) {

        System.out.println("[S]: " + sb);

    }

    public static void error(String text) {

        System.err.println("[!]: " + text);

    }

    public static void error(StringBuilder sb) {

        System.err.println("[!]: " + sb);

    }

    public static void error(Throwable err) {

        System.err.println("[!]: Error!");

        err.printStackTrace();

    }

    public static void warn(String text) {

        System.err.println("[W]: " + text);

    }

    public static String proxy(String something) {

        System.out.println("[P]: " + something);

        return something;

    }

    public static int proxy(int num) {

        System.out.println("[P]: " + num);

        return num;

    }

    public static long proxy(long num) {

        System.out.println("[P]: " + num);

        return num;

    }

}
