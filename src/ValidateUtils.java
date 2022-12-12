public class ValidateUtils {

    public static String validateString(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }
    public static Boolean validateString(String value) {
        return !(value == null || value.isBlank() || value.isEmpty());
    }
    public static Boolean validateBoolean(Boolean value) {
        return value != null && value;
    }
    public static Integer validateInteger(Integer value, int i){
        Integer substitution = null;
        return (value == null || value <= 0 ) ? substitution : value;
    }
    @Override
    public String toString() {
        return "ValidateUtils{}";
    }
}

