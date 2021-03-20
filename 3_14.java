
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Print(1234);
        System.out.println();
        int ret = Sum(6353);
        System.out.println(ret);
        System.out.println(Num(10));
	}
	
    /**
     * 按顺序输出每一位
     * @param args
     */
    public static void Print(int num) {
    	if(num / 10 == 0) {
    		System.out.print(num);
    	}
    	else {
    		Print(num / 10);
    		System.out.print(num % 10);
    	}
    }
    /**
     * 输入一个数，返回组成该数的数字之和
     * @param args
     */
    public static int Sum(int num) {
	    if(num < 10) {
		   return num;
	    }
	    return num % 10 + Sum(num / 10);
    }  
    
    /**
     * 求斐波那契数列第n项
     */
    public static int Num(int n) {
    	if(n == 1) {
    		return 0;
    	}
    	if(n == 2) {
    		return 1;
    	}
    	return Num(n - 1) + Num(n - 2);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
