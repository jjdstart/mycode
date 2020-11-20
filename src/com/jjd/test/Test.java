package com.jjd.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

/**
 * @author jjd
 * @date 2020-11-03
 */
public class Test {

    public static void main(String[] args) {

        /*ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(5);
        l4.next = l5;
        l5.next = l6;

        Test test = new Test();
        ListNode listNode = test.addTwoNumbers(l1, l4);
        //test.reversal(10000000000L);*/

        Test test = new Test();
        //int abcabcbb = test.lengthOfLongestSubstring("abcabcbb");

       /* int[] nums1 = {1 ,2};
        int[] nums2 = {3 ,4};
        System.out.println(test.findMedianSortedArrays(nums1, nums2));*/

        /*String s = "abcddcba";
        System.out.println(test.longestPalindrome(s));*/

       /* String s = "LEETCODEISHIRING";
        System.out.println(test.convert(s, 3));*/

//        System.out.println(test.reverse(123));

        System.out.println(test.myAtoi(" +-"));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //得数一
        Stack<Integer> s1 = new Stack<>();
        while (l1 != null) {
            int val = l1.val;
            s1.push(val);
            l1 = l1.next;
        }


        StringBuilder nums1 = new StringBuilder();
        /*for (Integer integer : s1) {
            nums1.append(integer);
        }*/
        while (s1.size() > 0) {
            nums1.append(s1.pop());
        }

        int n1 = Integer.parseInt(nums1.toString());
        //的数二
        Stack<Integer> s2 = new Stack<>();
        while (l2 != null) {
            int val = l2.val;
            s2.push(val);
            l2 = l2.next;
        }

        StringBuilder nums2 = new StringBuilder();
        /*for (Integer integer : s2) {
            nums2.append(integer);
        }
*/

        while (s2.size() > 0) {
            nums2.append(s2.pop());
        }
        int n2 = Integer.parseInt(nums2.toString());
        //相加
        int sum = n1 + n2;
        //反转放入链表
        ListNode hard = new ListNode();
        while (sum != 0) {
            int v = sum % 10;


            if (hard.next == null) {
                hard.next = new ListNode(v);
            } else {
                ListNode next = null;
                ListNode temp = hard.next;
                while (temp != null) {
                    if (temp.next == null) {
                        next = temp;
                    }
                    temp = temp.next;
                }
                next.next = new ListNode(v);
            }

            sum = sum / 10;
        }
        return hard.next;
    }

    //1,0,0,0,0,0,0,0,0,0,0
    public ListNode reversal(long sum) {
        ListNode hard = new ListNode();
        while (sum != 0) {
            int v = (int) sum % 10;
            long l = sum % 10;
            int l1 = (int) l;


            if (hard.next == null) {
                hard.next = new ListNode(v);
            } else {
                ListNode next = null;
                ListNode temp = hard.next;
                while (temp != null) {
                    if (temp.next == null) {
                        next = temp;
                    }
                    temp = temp.next;
                }
                next.next = new ListNode(v);
            }

            sum = sum / 10;
        }
        return hard.next;
    }


    public int lengthOfLongestSubstring(String s) {
        /*//时间超时 o(╥﹏╥)o pass
        //char[] chars = new char[s.length()];
        String[] chars = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.substring(i, i + 1);
        }
        if (chars.length == 0) {
            return 0;
        }

        //List<Character> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < chars.length; i++) {
            if (max > chars.length - i) {
                return max;
            }
            for (int j = i; j < chars.length; j++) {
                if (list.contains(chars[j])) {
                    if (max < list.size()) {
                        max = list.size();
                    }
                    list.clear();
                    list.add(chars[j]);
                } else {
                    list.add(chars[j]);
                }
            }

            if (max < list.size()) {
                max = list.size();
            }

            list.clear();
        }
        return max;
*/
        /*int reIndex = -1;
        int max = -1;
        List<Character> list = new ArrayList<>(100);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(reIndex);
            if (list.isEmpty()) {
                reIndex = i;
            }

            char c = s.charAt(i);
            if (list.contains(c)) {
                if (max < list.size()) {
                    max = list.size();;
                }
                list = new ArrayList<>(100);
                i = reIndex;
            } else {
                list.add(c);
            }
        }
        return Math.max(max, list.size());*/

        int rk = -1, ans = 0;
        Set<Character> oos = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                oos.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !oos.contains(s.charAt(rk + 1))) {
                oos.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() % 2 == 0) {
            int i = list.size() / 2;
            int integer = list.get(i);
            int integer1 = list.get(i - 1);
            double d = (integer + integer1) / 2;
            return d;
        } else {
            int i = list.size() / 2;
            return list.get(i);
        }
    }


    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currRow).append(c);
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        rows.forEach(ret::append);
        return ret.toString();
    }


    public int reverse(int x) {
       /* StringBuilder sb = new StringBuilder();
        long s = 1;

        boolean b = false;
        if (x < 0) {
            b = true;
            x = Math.abs(x);
        }

        while (x / s > 1) {
            sb.append(x / s % 10);
            s *= 10;
        }
        if (b) {
            return -Integer.parseInt(sb.toString());
        }
        return Integer.parseInt(sb.toString());*/

        /*try {
            StringBuilder sb = new StringBuilder();
            long s = 1;

            boolean b = false;
            if (x < 0) {
                b = true;
                x = Math.abs(x);
            }

            while (x / s > 0) {
                sb.append(x / s % 10);
                s *= 10;
            }
            if (b) {
                return -Integer.parseInt(sb.toString());
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            return 0;
        }*/


        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop > 8)) {
                return 0;
            }

            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }


    public int myAtoi(String s) {
        //不行。换个思路吧
        /*s = s.replaceAll(" ", "");
        if (s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            char c = s.charAt(0);
            if (c < 48 || c > 57) {
                return 0;
            }
        }

        char c = s.charAt(0);
        int index = 0;
        boolean flag = false;
        if (c == '-') {
            if (s.length() > 1 && '+' == s.charAt(1)) {
                return 0;
            }
            index += 1;
            flag = true;
        } else if (c == '+') {
            if (s.length() > 1 && '-' == s.charAt(1)) {
                return 0;
            }
            index += 1;
        } else if (c < 48 || c > 57) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 < 48 || c1 > 57) {
                break;
            }
            sb.append(c1);
        }

        if (flag) {
            try {
                return -Integer.parseInt(sb.toString());
            } catch (Exception e) {
                //e.printStackTrace();
                return Integer.MIN_VALUE;
            }
        } else {
            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception e) {
                //e.printStackTrace();
                return Integer.MAX_VALUE;
            }
        }*/

        //不行。换个思路吧
        /* if (s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            char c = s.charAt(0);
            if (c < 48 || c > 57) {
                return 0;
            }
        }

        int index = 0;
        char c = s.charAt(index);
        while (c == ' ') {
            c = s.charAt(++index);
        }

        boolean flag = false;
        if (c == '-') {
            if (s.length() >= index + 1 && '+' == s.charAt(index + 1)) {
                return 0;
            }
            index += 1;
            flag = true;
        } else if (c == '+') {
            if (s.length() >= index + 1 && '-' == s.charAt(index + 1)) {
                return 0;
            }
            index += 1;
        } else if (c < 48 || c > 57) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 < 48 || c1 > 57) {
                break;
            }
            sb.append(c1);
        }

        if (flag) {
            try {
                return -Integer.parseInt(sb.toString());
            } catch (Exception e) {
                //e.printStackTrace();
                return Integer.MIN_VALUE;
            }
        } else {
            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception e) {
                //e.printStackTrace();
                return Integer.MAX_VALUE;
            }
        }*/

        Automaton automaton = new Automaton();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            automaton.get(s.charAt(i));
        }

        return (int) automaton.ans * automaton.sign;
    }


    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i < m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Automaton {
    public int sign = 1;
    public long ans = 0;
    private String state = "start";
    private final Map<String, String[]> table = new HashMap<String, String[]>() {
        {
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }
    };

    public void get(char c) {
        state = table.get(state)[getCol(c)];
        if (Objects.equals("in_number", state)) {
            ans = ans * 10 + c - '0';
            ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
        } else if (Objects.equals("signed", state)) {
            sign = c == '+' ? 1 : -1;
        }
    }

    private int getCol(char c) {
        if (c == ' ') {
            return 0;
        }

        if (c == '+' || c == '-') {
            return 1;
        }

        if (Character.isDigit(c)) {
            return 2;
        }

        return 3;
    }
}

