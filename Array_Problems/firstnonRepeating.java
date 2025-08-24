import java.util.HashMap;

public class firstnonRepeating {
    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (countMap.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "abcdde";
        char result = firstNonRepeating(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

