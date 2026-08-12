class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip special characters from left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Skip special characters from right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // Compare characters
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}