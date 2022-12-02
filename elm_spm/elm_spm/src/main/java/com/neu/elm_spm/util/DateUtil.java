package com.neu.elm_spm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //获取当前的日期，转换为字符串格式
    public static String getCurrentTime(){
        Date date=new Date();
        return f.format(date);
    }
}
