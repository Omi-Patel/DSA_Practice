import java.util.ArrayList;

public class SubSequences {

    static void printSSQ(String s, String curr){
        if(s.length() == 0){
            System.out.println(curr);
            return;
        }

        char currCh = s.charAt(0);

        String rem = s.substring(1);

        printSSQ(rem, curr+currCh);
        printSSQ(rem, curr);
    }

    static ArrayList<String> getSSQ(String s){
        
        ArrayList<String> ans = new ArrayList<>();

        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);

        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;

    }
    public static void main(String[] args) {
        String s = "abc";

        // ArrayList<String> ans = getSSQ(s);
        // System.out.println(ans);


        //Optimal Approach
        printSSQ(s, "");
    }
}
