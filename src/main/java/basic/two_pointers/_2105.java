package basic.two_pointers;

public class _2105 {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int remainA = capacityA, remainB = capacityB;
        int l = 0, r = plants.length - 1;
        int ans = 0;
        while (l < r) {
            if (remainA < plants[l]) {
                ans++;
                remainA = capacityA;
            }
            remainA -= plants[l++];
            if (remainB < plants[r]) {
                ans++;
                remainB = capacityB;
            }
            remainB -= plants[r--];
        }
        if (plants.length % 2 != 0 && Math.max(remainA, remainB) < plants[l]) {
            ans++;
        }
        return ans;
    }
}
