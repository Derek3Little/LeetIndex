package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/replace-all-digits-with-characters/

    // SUBMISSION DATE: 2023.02.10

    public static String replaceDigits(String s) {

        // stringbuilder for building return string
        StringBuilder stringBuilder = new StringBuilder();

        // for intifying characters
        int intChar = 0;

        // single pass through full string
        for (int i = 0; i < s.length(); i++) {

            // switch character at string, append accordingly
            switch (s.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    // intifying character at i
                    intChar = Integer.parseInt(String.valueOf(s.charAt(i)));
                    char newChar = s.charAt(i - 1);

                    // incrementing character
                    newChar += intChar;

                    // append character to stringbuilder
                    stringBuilder.append(newChar);
                    break;
                default:
                    stringBuilder.append(s.charAt(i));
                    break;
            }
        }
        return stringBuilder.toString();
    }

}
