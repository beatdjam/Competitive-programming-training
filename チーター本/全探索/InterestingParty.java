public class InterestingParty {
    public int bestInvitation(String[] first, String[] second){
        int max = 0;
        for(int i = 0;i < first.length; i++){
            int f = 0;
            int s = 0;
            // 1番目の話題と2番目の話題を全パターンループ
            for (int j = 0;j < first.length;j++){
                if(first[i].equals(first[j])) f++;
                if(first[i].equals(second[j])) f++;
                if(second[i].equals(first[j])) s++;
                if(second[i].equals(second[j])) s++;
            }
            int localMax = f > s ? f : s;
            if(localMax > max) max = localMax;
        }
        return max;
    }
}
