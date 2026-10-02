import java.util.*;

class Solution {
    private void com(int op, int n, int cl, List<String> all, StringBuilder out) {
        if (cl == n) {
            all.add(out.toString());
            return;
        }

        if (cl < op) {
            out.append(')');
            com(op, n, cl + 1, all, out);
            out.deleteCharAt(out.length() - 1);
        }

        if (op < n) {
            out.append('(');
            com(op + 1, n, cl, all, out);
            out.deleteCharAt(out.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        com(0, n, 0, res, out);
        return res;
    }
}