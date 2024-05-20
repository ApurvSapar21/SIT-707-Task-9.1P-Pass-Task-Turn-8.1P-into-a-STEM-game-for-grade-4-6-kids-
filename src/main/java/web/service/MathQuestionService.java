package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result.
     * @param number1
     * @param number2
     * @return
     */
    public static Double q1Addition(String number1, String number2) {
        try {
            double result = Double.parseDouble(number1) + Double.parseDouble(number2);
            return result;
        } catch (NumberFormatException e) {
            return null; // Return null for invalid inputs
        }
    }
    
    /**
     * Calculate Q2 result.
     * @param number1
     * @param number2
     * @return
     */
    public static Double q2Subtraction(String number1, String number2) {
        try {
            double result = Double.parseDouble(number1) - Double.parseDouble(number2);
            return result;
        } catch (NumberFormatException e) {
            return null; // Return null for invalid inputs
        }
    }
    
    /**
     * Calculate Q3 result.
     * @param number1
     * @param number2
     * @return
     */
    public static Double q3Multiplication(String number1, String number2) {
        try {
            double result = Double.parseDouble(number1) * Double.parseDouble(number2);
            return result;
        } catch (NumberFormatException e) {
            return null; // Return null for invalid inputs
        }
    }
}
