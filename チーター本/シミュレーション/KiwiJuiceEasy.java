public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        int count = fromId.length;
        for (int i = 0;i < count;i++) {
            int from = fromId[i];
            int to = toId[i];

            // Fromが空なら処理しない
            if (bottles[from] == 0) continue;
            // ボトル移し替え
            bottles[to] += bottles[from];
            // キャパオーバーならfromに残りを詰める
            if (bottles[to] >= capacities[to]) {
                bottles[from] = bottles[to] - capacities[to];
                bottles[to] = capacities[to];
                continue;
            }

            bottles[from] = 0;
        }
        return bottles;
    }
}