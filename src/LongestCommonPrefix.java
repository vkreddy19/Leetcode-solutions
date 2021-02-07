public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        for (; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                try {
                    if (strs[j].charAt(i) != strs[0].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                } catch (StringIndexOutOfBoundsException error) {
                    return strs[0].substring(0, i);
                }

            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String args[]) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));
    }

}
