public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int result = 0;

        if (first > second) {
            for (int i = first; i > 1 ; i--) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                   break;
                }
            }
        } else {
            for (int i = second; i > 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}
