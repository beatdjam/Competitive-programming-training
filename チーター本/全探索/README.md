# 全探索
## InterestingParty
### 全探索の解答
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
## Cryptography
### 全探索の解答
入力に対して、全ての数字をそれぞれ+1したパターンの結果を計算し、  
最も大きい値を返却。  
### より良い解法
この問題の場合は、最小の値を+1すると答えになる。  
* ソートして最小値を取得
* 最小値を+1
* 計算結果を返却  
で答えを求められる。
```java
Array.sort(numbers);
numbers[0]++;
long prod = 1;
for(int i = 0;i < numbers.length;i++){
  prod *= numbers[i];
}
return prod;
```
## InterestingDigits
### 全探索の解答
* 2～基数の範囲で対象とする数を決める
* 3桁の0～基数の範囲を全件ループする
  * (i * base * base + j * base + k) で10進数の場合の数字を求め、対象とする数で割り切れるかを求める(nの倍数かどうか)
  * 割り切れた場合、i + j + kが対象とする数で割り切れるかを求める(求めたい数かどうか)
* 条件に適合した数を配列に詰める
### より良い解答
1 ≡ n(mod base)を満たすnがこの問題の回答となるので、下記のように`基数-1`がnで割り切れる場合を求めれば良い。
```java
for(int i = 2;i < base;i++){
  if((base - 1) % i == 0) ans.add(i);
}
```
