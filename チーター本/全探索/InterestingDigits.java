import java.util.*;
public class InterestingDigits {
    public int[] digits(int base){
        List<Integer> ans = new ArrayList<>();
        // 探索する数を設定
        for(int n = 2;n < base;n++) {
            boolean flag = true;
            // 1桁目
            for (int i = 0; i < base; i++) {
                // 2桁目
                for (int j = 0; j < base; j++) {
                    // 3桁目
                    for (int k = 0; k < base; k++) {
                        // 10進数換算で3桁分数字を取得→nの倍数かを確認
                        // i+j+kがnで割り切れるかを確認
                        if((i * base * base + j * base + k) % n == 0 && (i + j + k) % n != 0){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag) break;
                }
                if(!flag) break;
            }
            // trueのままループを抜けたnだけadd
            if(flag) ans.add(n);
        }
        int[] ret = new int[ans.size()];
        int size = ans.size();
        for(int i = 0;i < size;i++) ret[i] = ans.get(i);
        return  ret;
    }
}