package library.util;
public class inputvalidator {
    public static boolean validateresourceid(int resourceid) {
        return resourceid > 0;
    }
    public static boolean validatefinedays(int overduedays) {
        return overduedays >= 0;
    }
}