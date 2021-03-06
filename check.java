
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 3*3*3+4*4*4+5*5*5;
        int b = 6*6*6;
        if(a == b)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        int i = 6;
        int sum = 0;
        for(i = 6; i <= 69; i++)
        {
        	sum += i* i* i;
        }
        int c = 180* 180* 180;
        if(sum == c)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
	}

}
