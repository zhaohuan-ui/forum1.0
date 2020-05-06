package com.commons.utils.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    //获取系统当前时间戳: 0获取秒  其余为毫秒
    public static long getCurrentTimestamp(int id){
        if(id == 0){
            return Instant.now().getEpochSecond();
        }
        return Instant.now().toEpochMilli();
    }

    //获得当前日期 yyyy-MM-dd
    public static String getCurrentDate(){
        LocalDate localDate = LocalDate.now();
        return getFormat("yyyy-MM-dd").format(localDate);
    }

    //格式化 时间格式
    public static DateTimeFormatter getFormat(String format){
        return DateTimeFormatter.ofPattern(format);
    }
}
