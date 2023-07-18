package Function;

import java.util.HashMap;
import java.util.Map;

public class CntLetter {
    public static int cntVNLetter(String input) {
        int cnt = 0;
        int i = 0;
        Map<String, String> VNLetter = new HashMap<>();
        VNLetter.put("aw", "ă");
        VNLetter.put("aa", "â");
        VNLetter.put("dd", "đ");
        VNLetter.put("ee", "ê");
        VNLetter.put("oo", "ô");
        VNLetter.put("ow", "ơ");
        VNLetter.put("w", "ư");

        String[] inputChar = input.split("");
        while (i < inputChar.length) {
            if (VNLetter.containsKey(inputChar[i])){
                cnt++;
                i++;
            } else if ((i < inputChar.length - 1) && VNLetter.containsKey(inputChar[i]+inputChar[i+1])) {
                cnt++;
                i += 2;
            } else {
                i++;
            }

        }
        return cnt;
    }
}
