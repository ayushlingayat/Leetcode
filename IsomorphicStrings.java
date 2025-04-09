import java.util.HashMap;
class IsomorphicStrings {

    public static void printString(boolean result){
        System.out.println(result ? "Isomorphic" : "Not Isomorphic");
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If c1 is already mapped
            if(mapST.containsKey(c1)) {
                if(mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                mapST.put(c1, c2);
            }

            // Also check reverse mapping from t to s
            if(mapTS.containsKey(c2)) {
                if(mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String s = "egg";
        String t = "add";

        boolean result = isIsomorphic(s, t);
        printString(result);
    }
}
