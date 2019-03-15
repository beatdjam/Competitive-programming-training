using System;
class Program
{
	static void Main(string[] args)
	{
        int n = int.Parse(Console.ReadLine());
        int[] input = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        Array.Sort(input);
        Array.Reverse(input);
        int alice = 0;
        int bob = 0;
        for(int i = 0;i < input.Length;i++){
            if (i%2 == 0) {
                alice += input[i];
            } else {
                bob += input[i];
            }
        }
        Console.WriteLine(alice - bob);
	}
}
