package com.liudao.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/6 - 21:03
 */
public class DateUtiles {
    //日期转成字符串
    public static  String  dateStr(Date date,String patt){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        String format = simpleDateFormat.format(date);
        return format;

    }
    //字符串转成日期
    public static Date strDate(String str , String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = null;
        try {
            parse = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
