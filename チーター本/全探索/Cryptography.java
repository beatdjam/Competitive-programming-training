public class Cryptography {
    public long encrypt(int[] numbers){
        long max = 0;
        // 全パターン計算させて最大値のものを探す
        for(int i = 0;i < numbers.length;i++){
            long prod = 1;
            for(int j = 0;j < numbers.length;j++) {
                prod *= i == j ? numbers[j] + 1 : numbers[j];
            }
            max = max < prod ? prod : max;
        }
        return max;
    }
}