public class KeyPad {

    static void keypadCombinations(String dig, String kp[], String res){
        if(dig.length() == 0){
            System.out.print(res + " ");
            return;
        }

        int curNum = dig.charAt(0) - '0'; // 2
        String curChoices = kp[curNum];        // "abc"

        for(int i=0; i<curChoices.length(); i++){
            keypadCombinations(dig.substring(1), kp, res + curChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "23";

        //mapping
        String kp[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // indexes      0   1    2      3       4      5     6      7       8       9

        keypadCombinations(dig, kp, "");
    }
}
