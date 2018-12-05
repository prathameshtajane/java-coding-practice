package vestmark;


public class FormatPhoneNumber {

    static String solution(String input) {
        String processed_input = input.replaceAll("[^\\d.]", "");
//        System.out.println(processed_input);
//        System.out.println(processed_input.length());
//        System.out.println(input);
        StringBuilder outputString = new StringBuilder();
        int dashIndexCounter = 0;

        if(processed_input.length() <= 2){
            return processed_input;
        }

        int isLast4D = processed_input.length() % 3;
        if (isLast4D == 1) {
            for (int i = 0; i <= processed_input.length() - 5; i++) {
                if (dashIndexCounter >= 3) {
                    outputString.append("-");
                    dashIndexCounter = 0;
                }
                outputString.append(processed_input.charAt(i));
                dashIndexCounter++;
            }

            int twoDashCounter = 0;
            outputString.append("-");
            for (int j = processed_input.length() - 4; j < processed_input.length(); j++) {
                if (twoDashCounter >= 2) {
                    outputString.append("-");
                    twoDashCounter = 0;
                }
                outputString.append(processed_input.charAt(j));
                twoDashCounter++;

            }
        } else {
            for (int i = 0; i < processed_input.length(); i++) {
                if (dashIndexCounter >= 3) {
                    outputString.append("-");
                    dashIndexCounter = 0;
                }
                outputString.append(processed_input.charAt(i));
                dashIndexCounter++;

            }
        }
        return String.valueOf(outputString);
    }

    public static String solution2(String s) {
        String striped = s.replaceAll("[^0-9]", "");
        StringBuilder sb = new StringBuilder();
        int mod = 3;
        int dif = striped.length() -4;
        for(int i = 0 ; i < striped.length() ; i++ ) {

            if(i > 0 && i%mod == 0) {
                sb.append("-");
                if(i == dif) {
                    sb.append(striped.substring(i, i+2)).append('-').append(striped.substring(i+2, striped.length()));
                    return String.valueOf(sb);
                }

            }
            sb.append(striped.charAt(i));
        }
        return String.valueOf(sb);
    }


    public static void main(String args[]) {
//        String input1 = "00-44  48 5555- 836";
//        System.out.println(FormatPhoneNumber.solution(input1));
        String[] test = {"",
                "04...",
                "04---",
                "00-44 48   5555 8361111",
                "00-44 48   5555 83611112",
                "00-1",
                "-1",
                "112-123.~",
                "1234-1",
                "12323     1",
                "  2-",
                "004-448-555-583-611-1123",
                "12323",
                "4482765804604844353269386672672907532942979457269293310890061818288368799495408193468882721155297134",
                "448276580460484435326938667267290753294297945726929331089006181828836879949540819346888272115529713",
                "444491363517514950403771823179889974181493651761773726633406561707237683714158792224902201';';#$*14"
        };
        for(String each : test){
            System.out.println(each + " -> " + FormatPhoneNumber.solution(each)+" -> "+FormatPhoneNumber.solution(each).equals(FormatPhoneNumber.solution2(each)));
            System.out.println();
        }
    }
}


// "00-44  48 5555 8361"