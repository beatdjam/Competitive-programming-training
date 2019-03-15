using System;
class Program
{
	static void Main(string[] args)
	{
        int n = int.Parse(Console.ReadLine());
        string[] input = Console.ReadLine().Split(' ');
        
        int count = 0;
        Boolean flag = true;
        while(flag){
            for(int i = 0;i < n;i++){
                int tmp = int.Parse(input[i]);
                if(tmp % 2 != 0){
                    flag = false;
                    break;
                }
                input[i] = (tmp/2).ToString();
            }
            if(flag) count++;
        }
        Console.WriteLine(count);
	}
}
