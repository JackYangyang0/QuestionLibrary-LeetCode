package basic.difference;

public class _1109 {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n + 2];
        for (int[] booking : bookings) {
            int first = booking[0], last = booking[1], seats = booking[2];
            diff[first] += seats;
            diff[last + 1] -= seats;
        }

        int sum = 0;
        int[] ans = new int[n];
        for (int i = 1; i <= n; i++) {
            sum += diff[i];
            ans[i - 1]  = sum;
        }
        return ans;
    }
}
