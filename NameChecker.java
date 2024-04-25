package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        if (input.charAt(0) == '-')
            return false;
        if (input.charAt(0) == '\'')
            return false; 
        if (input.length() < 2 || input.length() > 40)
            return false;
        if (input.contains("--"))
            return false;
        
        char[] chars = input.toCharArray();
        int count = 0;
        for (char c : chars) {
            if(!Character.isLetter(c) && c != '\'' && c != '-') {
                return false;
            }
            if(c == '\'')
                count++;
            if (count > 1)
                return false;

        }
        return true;
    }
}
