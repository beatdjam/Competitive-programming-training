using System;
using System.Linq;
class Program
{
	static void Main(string[] args)
	{
        int n = int.Parse(Console.ReadLine());
        int[] d = new int[n];
        for(int i = 0;i < n;i++){
            d[i] = int.Parse(Console.ReadLine());
        }
        Console.WriteLine(d.Distinct().ToArray().Length);
	}
}
