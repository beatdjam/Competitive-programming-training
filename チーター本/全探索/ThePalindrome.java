public class ThePalindrome {
    public int find(String s) {
        int len = s.length();
        // 先頭から1文字ずつ探索
        for (int i = 0; i < len; i++) {
            // i番目の文字から探索して回文になっているかどうかを判定
            // 最後までループしたら回文
            boolean flag = true;
            for (int j = 0; j < len - i; j++) {
                if (s.charAt(i + j) != s.charAt(len - 1 - j)) {
                    flag = false;
                    break;
                }
            }
            // 外のループで探索した文字数=足りない文字なので文字列長に足したものが答え
            if (flag) return i + len;
        }
        return -1;
    }
}