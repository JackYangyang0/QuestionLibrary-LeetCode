package basic.sliding_window;

public class _1423 {
    public int maxScore(int[] cardPoints, int k) {
        int target = cardPoints.length - k;
        int sum = 0; // 计算所有卡牌总和
        for (int i = 0; i < cardPoints.length; i++) {
            sum += cardPoints[i];
        }
        if (target == 0) {
            return sum;
        }
        int total = 0; // 计算中间卡牌数量
        int min = Integer.MAX_VALUE; // 计算中间卡牌的最小点数和
        for (int i = 0; i < cardPoints.length; i++) {
            total += cardPoints[i];
            if (i < target - 1) {
                continue;
            }
            min = Math.min(min, total);
            int out = cardPoints[i - target + 1];
            total -= out;
        }
        return sum - min;
    }
}
