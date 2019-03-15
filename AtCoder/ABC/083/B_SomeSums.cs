using System;
class Program
{
	static void Main(string[] args)
	{
        string[] input = Console.ReadLine().Split(' ');
        int n = int.Parse(input[0]);
        int a = int.Parse(input[1]);
        int b = int.Parse(input[2]);
        
        int result = 0;
        for(int i = 1;i <= n;i++){
            String s = i.ToString();
            int tmp = 0;
            for(int j = 0;j < s.Length;j++){
               tmp += int.Parse(s[j].ToString());
            }
            if(a <= tmp && tmp <= b) result+= i;
        }
        Console.WriteLine(result);
	}
}
