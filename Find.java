
public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[101];
        int i = 0;
        //�������鲢��ʼ��
        for(i=2;i<101;i++)
        {
        	arr[i] = i;
        }
        //���ð���ɸ���ж�
        for(i=2;i<101;i++)
        {
        	//�����ʱi��ƽ�����������е�������������ѭ��
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
        	//���arr[i]Ϊ0����arr[i]�Ѿ���ǰ�����ı���,��i�������ѭ����Ϊ������)
        	if(arr[i] == 0)
        	{
        		continue;
        	}
        	int j = 0;
        	for(j=i+1;j<101;j++)
        	{
        		//���arr[j]Ϊ0����arr[j]�Ѿ���ǰ�����ı���,��arr[j]�������ѭ���ж��Ƿ�Ϊi�ı���)
        		if(arr[j] == 0)
            	{
            		continue;
            	}
        		//���arr[j]��i�ı��������䣨����������Ϊ0
        		if(arr[j]%i == 0)
        		{
        			arr[j] = 0;
        		}
        	}
        }
        //ʹ����ǿ��for������(��������в�Ϊ0������������)
        for(int n : arr) 
        {
        	if(n != 0)
        	{
        		System.out.print(n+" ");
        	}
        }
	}

}
