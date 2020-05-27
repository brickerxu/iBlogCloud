package cc.bricker.iblog.log;

import org.slf4j.LoggerFactory;

/**
 * 日志封装类
 * 需要输出日志时,直接调用此类
 * @author bricker
 * @date 2020/05/27
 */
public class Logger {

    /**
     * 使用slf4j
     */
    private static org.slf4j.Logger log = LoggerFactory.getLogger(cc.bricker.iblog.log.Logger.class);

    public static void trace(String s) {
        log.trace(fomart(s));
    }

    public static void trace(String s, Object o) {
        log.trace(fomart(s), o);
    }

    public static void trace(String s, Object o, Object o1) {
        log.trace(fomart(s), o, o1);
    }

    public static void trace(String s, Object... objects) {
        log.trace(fomart(s), objects);
    }

    public static void trace(String s, Throwable throwable) {
        log.trace(fomart(s), throwable);
    }

    public static void debug(String s) {
        log.debug(fomart(s));
    }

    public static void debug(String s, Object o) {
        log.debug(fomart(s), o);
    }

    public static void debug(String s, Object o, Object o1) {
        log.debug(fomart(s), o, o1);
    }

    public static void debug(String s, Object... objects) {
        log.debug(fomart(s), objects);
    }

    public static void info(String s) {
        log.info(fomart(s));
    }

    public static void info(String s, Object o) {
        log.info(fomart(s), o);
    }

    public static void info(String s, Object o, Object o1) {
        log.info(fomart(s), o, o1);
    }

    public static void info(String s, Object... objects) {
        log.info(fomart(s), objects);
    }

    public static void info(String s, Throwable throwable) {
        log.info(fomart(s), throwable);
    }

    public static void warn(String s) {
        log.warn(fomart(s));
    }

    public static void warn(String s, Object o) {
        log.warn(fomart(s), o);
    }

    public static void warn(String s, Object... objects) {
        log.warn(fomart(s), objects);
    }

    public static void warn(String s, Object o, Object o1) {
        log.warn(fomart(s), o, o1);
    }

    public static void warn(String s, Throwable throwable) {
        log.warn(fomart(s), throwable);
    }

    public static void error(String s) {
        log.error(fomart(s));
    }

    public static void error(String s, Object o) {
        log.error(fomart(s), o);
    }

    public static void error(String s, Object o, Object o1) {
        log.error(fomart(s), o, o1);
    }

    public static void error(String s, Object... objects) {
        log.error(fomart(s), objects);
    }

    public static void error(String s, Throwable throwable) {
        log.error(fomart(s), throwable);
    }

    /**
     * 对日志进行格式化处理
     * 添加堆栈信息
     * @param log
     * @return
     */
    private static String fomart(String log) {
        StackTraceElement[] stacks = new Throwable().getStackTrace();
        /**
         * 因为获取slf4j的Logger使用的是本类Class
         * 所以堆栈信息使用第三个,以此显示日志输出堆栈信息
         */
        StackTraceElement stack = stacks[2];
        StringBuffer sb = new StringBuffer();
        sb.append("[").append(stack.getClassName());
        sb.append("#");
        sb.append(stack.getMethodName()).append(":").append(stack.getLineNumber()).append("]");
        sb.append(" - ").append(log);
        return sb.toString();
    }

    private static String getSimpleClassName(String className) {
        String simpleClassName = className;
        String[] strs = className.split("\\.");
        if (strs.length > 0) {
            simpleClassName = strs[strs.length - 1];
        }
        return simpleClassName;

    }
}
