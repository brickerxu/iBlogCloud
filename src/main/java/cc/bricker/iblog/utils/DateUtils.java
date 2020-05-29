package cc.bricker.iblog.utils;

import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bricker
 * @date 2020/5/29
 */
public class DateUtils {
    private static final String DEFAULT_DATE_STR = "1970/01/01";

    public static final String DATE_FORMAT = "yyyy/MM/dd";

    public static final String TIME_FORMAT = "HH:mm:ss";

    public static final String DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    /**
     * 将年月日转化为Date类型
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Date getDate(int year, int month, int day) {
        String dateStr = String.format("%s/%s/%s", year, month, day);
        DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");//定义一个时间转换格式“年-月-日”
        Date date = null;
        try {
            date = fmt.parse(dateStr);
        } catch (ParseException e) {
            date = new Date(year - 1900, month - 1, day);
        }
        return date;
    }

    /**
     * 日期转为字符串
     * @param date
     * @return
     */
    public static String date2String(Date date) {
        return format(date, DATE_FORMAT);
    }

    /**
     * 时间转为字符串
     * @param date
     * @return
     */
    public static String time2String(Date date) {
        return format(date, TIME_FORMAT);
    }

    /**
     * 日期加时间转为字符串
     * @param date
     * @return
     */
    public static String dateTime2String(Date date) {
        return format(date, DATE_TIME_FORMAT);
    }

    /**
     * 统一的日期处理
     * @param date
     * @param format
     * @return
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return DEFAULT_DATE_STR;
        }
        if (StringUtils.isEmpty(format)) {
            format = DATE_TIME_FORMAT;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
}
