
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.print("请输入一个正整数，将自动给出小于该数的数的立方和等于其立方和的连续数:");
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int n = 0;
         //谁的立方
         for(n = 3;n <= num;n++)
        {
            int i = 0;
            //从哪个数开始
            for(i = 1;i <= n - 2;i++)
           {
        	    int j = 0;
        	    //几个数的立方和
        	    for(j = 2;j <= n - i + 1;j++)
               {
                 //求和
        	     int sum = sum(i, j);
        	     //判断
        	     if(sum == n* n* n)
      		     {
     		       System.out.println(i+"的立方+...+"+(i+j-1)+"的立方等于"+n+"的立方");
        	     }
    	       }
           } 
	    }
	}
	//求和方法（立方和公式）
	static int sum(int start, int num)
	{
		return (start + num - 1)* (start + num) / 2* (start + num - 1)* (start + num) / 2
		     - (start - 1)* start / 2* (start - 1)* start / 2;
	}
}
