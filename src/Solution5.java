import java.util.Stack;

//394. Decode String
public class Solution5 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String res = "";
        int index = 0;

        while(index < s.length()) {

            if(Character.isDigit(s.charAt(index))) {

                int count = 0;
                while(Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);

            } else if(s.charAt(index) == '[') {

                stringStack.push(res);
                res = "";
                index++;

            } else if(s.charAt(index) == ']') {

                StringBuilder sb = new StringBuilder(stringStack.pop());
                int count = countStack.pop();

                for(int i = 0; i<count; i++) {
                    sb.append(res);
                }

                res = sb.toString();
                index++;

            } else {
                res += s.charAt(index);
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";

        String res = decodeString(s);
        System.out.println(res);
    }
}
