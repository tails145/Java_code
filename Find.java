
public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[101];
        int i = 0;
        //创建数组并初始化
        for(i=2;i<101;i++)
        {
        	arr[i] = i;
        }
        //利用埃氏筛法判断
        for(i=2;i<101;i++)
        {
        	//如果此时i的平方大于数组中的最大数，则结束循环
        	int x = 100;
        	int max = 0;
        	for(x=100; ;x--)
        	{
        		if(arr[x] != 0)
        		{
        			max = arr[x];
        			break;
        		}
        	}
        	if(i*i >= max)
        	{
        		break;
        	}
        	//如果arr[i]为0（即arr[i]已经是前面数的倍数,则i无需进入循环作为被除数)
        	if(arr[i] == 0)
        	{
        		continue;
        	}
        	int j = 0;
        	for(j=i+1;j<101;j++)
        	{
        		//如果arr[j]为0（即arr[j]已经是前面数的倍数,则arr[j]无需进入循环判断是否为i的倍数)
        		if(arr[j] == 0)
            	{
            		continue;
            	}
        		//如果arr[j]是i的倍数，则将其（非素数）变为0
        		if(arr[j]%i == 0)
        		{
        			arr[j] = 0;
        		}
        	}
        }
        //使用增强的for语句输出(输出数组中不为0的数，即素数)
        for(int n : arr) 
        {
        	if(n != 0)
        	{
        		System.out.print(n+" ");
        	}
        }
	}

}
