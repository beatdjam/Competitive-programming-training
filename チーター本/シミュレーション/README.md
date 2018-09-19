# シミュレーション
## KiwiJuiceEasy
### AC時の解法
toにfromを移してみて、toが溢れていれば残りを戻すという方法で回答
### より良い解法
分岐を減らすため、移動量を先に求めるとよい。  
* fromのビンに入っている量  
* toの空き容量(capacity-toの量)  
のうち、小さい方を移動量として定義する。  
求めた移動量をfromから引き、toに足すことで答えが求められる。
```java
int from = fromId[i];
int to = toId[i];
int move = Math.min(bottles[from],capacities[to] - bottles[to]);
bottles[from] -= move;
bottles[to] += move;
```
