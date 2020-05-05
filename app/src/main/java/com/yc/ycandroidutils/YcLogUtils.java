package com.yc.ycandroidutils;

import com.orhanobut.logger.Logger;

public final class YcLogUtils {

    public static void d( String message,  Object... args) {
        Logger.d(message, args);
    }

    public static void d( Object object) {
        Logger.d(object);
    }

    public static void e( String message,  Object... args) {
        Logger.e(null, message, args);
    }

    public static void e( Throwable throwable,  String message,  Object... args) {
        Logger.e(throwable, message, args);
    }

    public static void wtf( String message,  Object... args) {
        Logger.wtf(message, args);
    }

    public static void json( String json) {
        Logger.json(json);
    }

    public static void xml( String xml) {
        Logger.xml(xml);
    }
}
