import java.util.Random;
import java.util.Scanner;

public class Tast {
	/**
	 * 打印数的每一位
	 * @param args
	 */
	public static void main10(String[] args) {
		System.out.print("请输入一个数");
		Scanner input = new Scanner(System.in);
		int get = input.nextInt();
		int num = get;
		while(num != 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}
	/**
	 * 打印二进制的奇数位和偶数位
	 * @param args
	 */
	public static void main9(String[] args) {
		Scanner input = new Scanner(System.in);
		int get = input.nextInt();
		int i = 0;
		System.out.print("奇数位为：");
		for(i = 30; i >= 0; i = i - 2) {
				System.out.print((get >> i) & 1);
		}
		System.out.println();
		System.out.print("偶数位为：");
		for(i = 31; i >= 1; i = i - 2) {
			System.out.print((get >> i) & 1);
	    }
	}
	/**
	 * 二进制中1的个数
	 * @param args
	 */
	public static void main8(String[] args) {
		Scanner input = new Scanner(System.in);
		int get = input.nextInt();
		int num = 0;
		int i = 0;
		int x = 1;
		for(i = 0; i < 32; i++,x *= 2) {
			if((get & x) == x) {
				num++;
			}
		}
		System.out.println(num);
	}
	/**
	 * 输入字符串
	 * @param args
	 */
	public static void main7(String[] args) {
		String password = "abcde";
		int i = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("请输入密码：");
			String get = input.next();
			if(get.equals(password)) {
				System.out.println("登陆成功");
				break;
			}
			i++;
		}while(i < 3);
		if(i == 3) {
			System.out.println("退出程序");
		}
	}
	/**
	 * 1-100的数字中出现多少个9
	 * @param args
	 */
	public static void main6(String[] args) {
		int i = 0;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 10 == 9) {
				sum++;
			}
			if(i/10 == 9) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	/**
	 * 计算1/1-1/2+1/3-1/4...+1/99-1/100
	 * @param args
	 */
	public static void main5(String[] args) {
		double i = 0;
		double sum = 0;
		int tmp = 1;
		for(i = 1; i <= 100; i++) {
			sum += tmp*1/i;
			tmp = -tmp;
		}
		System.out.println(sum);
	}
	/**
	 * 求两个正整数的最大公约数
	 * @param args
	 */
	public static void main4(String[] args) {
		int a = 18;
		int b = 30;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int i = 0;
		for(i = min; i > 0; i--) {
			if((min % i) == 0) {
				if((max % i) == 0) {
				break;
				}
			}
		}
		System.out.println("最大公约数是"+i);
	}
	/**
	 * 输出乘法口诀表
	 */
	public static void main3(String[] args) {
        int i = 0;
        for(i = 1; i <= 9; i++) {
        	int j = 0;
        	for(j = 1; j <= i; j++) {
        		System.out.print(" "+i+"*"+j+"="+i*j+" ");
        	}
        	System.out.println();
        }
	}
	/**
	 * 判断数字是否为素数
	 * @param args
	 */
	public static void main2(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数:");
		int num1 = input.nextInt();
		double num = Math.sqrt(num1);
		int i = 0;
		for(i = 2; i <= num; i++) {
			if(num1 % i == 0) {
				break;
			}
		}
			if(i >= num) {
				System.out.println("是素数");
			}
			else {
				System.out.println("不是素数");
			}
	}
	
	/**
	 * 猜数字
	 * @param args
	 */
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
        Random random = new Random();
        int ranDom = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.print("请输入一个数：");
        	int input = scan.nextInt();
        	if(input < ranDom) {
              System.out.println("小了");
            }
        	else if(input == ranDom) {
        		System.out.println("恭喜你猜对了");
        		break;
        	}
        	else {
        		System.out.println("大了");
        	}
	   }
    }
}
