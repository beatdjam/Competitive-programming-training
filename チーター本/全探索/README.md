# 全探索
## InterestingParty
### AC時の解答
話題を先頭から順番に選択し、全員の話題と照らし合わせて最も人数の多い場合を求めた。
### よりよい解法
上記の解法では確認済みの話題に対しても再度ループを行ってしまうため、  
事前に全員の話題で連想配列を作成して、話題ごとの数を集計すると無駄が無く良い。  
```java
// 話題とその人数を保持する連想配列を作成
// 全ての話題の数を0で初期化する
HashMap<String, Integer> dic = new HashMap<String, Integer>();
for(int i = 0; i < first.length;i++){
  dic.put(first[i], 0);
  dic.put(second[i], 0);
}
// 各話題に対して+1を行う
for(int i = 0;i < first.length;i++){
  dic.put(first[i], dic.get(first[i])+1);
  dic.put(second[i], dic.get(second[i])+1);
}
// 最も人数が多い場合の人数を取得する
int ans = 0;
for(String key : dic.keyset()){
  ans = Math.max(ans, dic.get(key));
}
return ans;
```
