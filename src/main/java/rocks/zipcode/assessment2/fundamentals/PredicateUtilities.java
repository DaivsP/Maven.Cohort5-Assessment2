package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        Boolean answer = false;
        if (value % 2 == 0){
            answer = true;
        }
        return answer;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        Boolean answer = false;
        if (value % 2 != 0){
            answer = true;
        }
        return answer;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        Boolean answer = false;
        if (value % 3 == 0){
            answer = true;
        }
        return answer;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        Boolean answer = false;
        if (value % multiple == 0){
            answer = true;
        }
        return answer;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        Boolean answer = false;
        if (string.substring(0,1).equals(string.substring(0,1).toUpperCase())){
            answer = true;
        }
        return answer;
    }
}
