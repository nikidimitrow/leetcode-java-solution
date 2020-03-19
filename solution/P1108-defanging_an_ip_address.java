/*Link to the problem: https://leetcode.com/problems/defanging-an-ip-address */

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') str.append("[.]");
            else str.append(ch);
        }

        return str.toString();
    }
}
