package basic.two_pointers;

public class _1578 {

    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        char[] ch = colors.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; ) {
            int max = neededTime[i], sum = neededTime[i];
            while (i < n - 1 && ch[i] == ch[i + 1]) {
                max = Math.max(max, neededTime[i + 1]);
                sum += neededTime[i + 1];
                i++;
            }

            ans += sum - max;
            i++;
        }
        return ans;
    }
}
