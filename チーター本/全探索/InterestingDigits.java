import java.util.*;
public class InterestingDigits {
    public int[] digits(int base){
        List<Integer> ans = new ArrayList<>();
        for(int n = 2;n < base;n++) {
            boolean flag = true;
            for (int i = 0; i < base; i++) {
                for (int j = 0; j < base; j++) {
                    for (int k = 0; k < base; k++) {
                        if((i * base * base + j * base + k) % n == 0 && (i + j + k) % n != 0){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag) break;
                }
                if(!flag) break;
            }
            if(flag) ans.add(n);
        }
        int[] ret = new int[ans.size()];
        int size = ans.size();
        for(int i = 0;i < size;i++) ret[i] = ans.get(i);
        return  ret;
    }
}