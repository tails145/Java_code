
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.print("������һ�������������Զ�����С�ڸ��������������͵����������͵�������:");
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int n = 0;
         //˭������
         for(n = 3;n <= num;n++)
        {
            int i = 0;
            //���ĸ�����ʼ
            for(i = 1;i <= n - 2;i++)
           {
        	    int j = 0;
        	    //��������������
        	    for(j = 2;j <= n - i + 1;j++)
               {
                 //���
        	     int sum = sum(i, j);
        	     //�ж�
        	     if(sum == n* n* n)
      		     {
     		       System.out.println(i+"������+...+"+(i+j-1)+"����������"+n+"������");
        	     }
    	       }
           } 
	    }
	}
	//��ͷ����������͹�ʽ��
	static int sum(int start, int num)
	{
		return (start + num - 1)* (start + num) / 2* (start + num - 1)* (start + num) / 2
		     - (start - 1)* start / 2* (start - 1)* start / 2;
	}
}
