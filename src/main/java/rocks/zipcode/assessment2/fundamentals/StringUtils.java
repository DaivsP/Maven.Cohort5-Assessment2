package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = new String(new char[numberOfTimeToRepeat]).replace("\0", stringToBeRepeated);
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
//        Boolean answer = false;
//        char[] charArray = string.toCharArray();
//        for (char character : charArray) {
//            if (Character.isAlphabetic(character)){
//                answer = true;
//            }
//        }
//        return answer;
        return string.matches("[a-zA-z ]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
//        Boolean answer = false;
//        char[] charArray = string.toCharArray();
//        for (char character : charArray) {
//            if (Character.isDigit(character)){
//                answer = true;
//            }
//        }
//        return answer;
        return string.matches("[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
//        Boolean answer = true;
//        char[] charArray = string.toCharArray();
//        for (char character : charArray) {
//            if (!Character.isLetterOrDigit(character)){
//                answer = false;
//            }
//        }
//        return answer;
        return string.matches(".*[&*{}()]+.*");
    }
}
