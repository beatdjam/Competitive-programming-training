using System;
class Program
{
	static void Main(string[] args)
	{
        string s = Console.ReadLine();
        int count = 0;
        for(int i = 0;i < s.Length;i++){
            if(s[i] == '1') count++;
        }
        Console.WriteLine(count);
	}
}
