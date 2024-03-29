package ma.zs.generatedProject.commun.util;
 
 
 
public class NumberUtil {

    private static final String CHAINE_VIDE = "";

    public static double toDecimal(String value) {
        if (value == null || value.isEmpty()) {
            return 0D;
        } else {
            return Double.parseDouble(value);
        }
    }

    public static int toInt(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }

    public static String toString(Double value) {
        if (value == null) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }

    public static String toString(Integer value) {
        if (value == null) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }

    public static String toString(Long value) {
        if (value == null) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }

    public static Long toLong(String value) {
        if (value == null || value.isEmpty()) {
            return 0L;
        } else {
            return Long.parseLong(value);
        }
    }

}
