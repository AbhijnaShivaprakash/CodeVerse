public class Roman{
    public int romanToInt(String s) {
        int[] romanMap = new int[256];
        romanMap['I'] = 1;
        romanMap['V'] = 5;
        romanMap['X'] = 10;
        romanMap['L'] = 50;
        romanMap['C'] = 100;
        romanMap['D'] = 500;
        romanMap['M'] = 1000;

        int length = s.length();
        int result = 0;

        for (int i = 0; i < length; i++) {

            if (i + 1 < length && romanMap[s.charAt(i)] < romanMap[s.charAt(i + 1)]) {
                result -= romanMap[s.charAt(i)];
            } else {
                result += romanMap[s.charAt(i)];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Roman r = new Roman();

        // Test cases
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println("Roman numeral " + s1 + " = " + r.romanToInt(s1));
        System.out.println("Roman numeral " + s2 + " = " + r.romanToInt(s2));
        System.out.println("Roman numeral " + s3 + " = " + r.romanToInt(s3));
    }
}

