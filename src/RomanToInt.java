import java.util.HashMap;

public class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>() {{
            put("M", 1000);
            put("D", 500);
            put("C", 100);
            put("L", 50);
            put("X", 10);
            put("V", 5);
            put("I", 1);
        }};
        int value = 0;
        int prev = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentSymbolValue = map.get(String.valueOf(s.charAt(i)));
            if (currentSymbolValue > prev || prev == -1 || currentSymbolValue == prev) {
                value += currentSymbolValue;
                prev = currentSymbolValue;
            } else {
                value -= currentSymbolValue;
            }
        }

        return value;
    }

    public static void main(String args[]) {
        System.out.println(romanToInt("LVIII"));
    }
}
