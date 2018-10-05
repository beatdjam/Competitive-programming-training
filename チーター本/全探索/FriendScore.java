import java.util.Arrays;

public class FriendScore {
    public int highestScore (String[] friends) {
        int len = friends.length;
        int[][] friendStat = new int[len + 1][len + 1];
        // 2次元配列に友人関係をマッピング
        for(int i = 1;i <= len;i++){
            for(int j = 1;j <= len;j++){
                if(friends[i-1].charAt(j-1) == 'Y') friendStat[i][j] = 1;
            }
        }

        int[] friendCount = new int[len + 1];
        for(int i = 1;i <= len;i++){
            for(int j = 1;j <= len;j++){
                // 本人同士の場合はスキップ
                if(i == j) continue;
                // 友達の場合
                if(friendStat[i][j] == 1) {
                    friendCount[i] += friendStat[i][j];
                }else{
                    // 友達の友達を探す
                    for(int k = 1;k <= len;k++){
                        if(friendStat[k][j] == 1 && friendStat[i][k] == 1) {
                            friendCount[i] += friendStat[j][k];
                            break;
                        }
                    }
                }
            }
        }
        // 最大値を返却
        Arrays.sort(friendCount);
        return friendCount[len];
    }
}
