using System;
using System.Linq;
class Program
{
	static void Main(string[] args)
	{
        string[] input = Console.ReadLine().Split(' ');
        int n = int.Parse(input[0]);
        int y = int.Parse(input[1]);
        for(int i = 0;i <= n;i++){
            for(int j = 0;j <= n;j++){
                int k = n - i - j;
                if (i + j + k != n || k < 0) continue;
                if (10000 * i + 5000 * j + 1000 * k == y){
                    Console.WriteLine(i + " " + j + " " + k);
                    return;
                }
            }
        }
        Console.WriteLine("-1 -1 -1");
	}
}
