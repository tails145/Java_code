import java.util.Random;
import java.util.Scanner;

public class Tast {
	/**
	 * ��ӡ����ÿһλ
	 * @param args
	 */
	public static void main10(String[] args) {
		System.out.print("������һ����");
		Scanner input = new Scanner(System.in);
		int get = input.nextInt();
		int num = get;
		while(num != 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}
	/**
	 * ��ӡ�����Ƶ�����λ��ż��λ
	 * @param args
	 */
	public static void main9(String[] args) {
		Scanner input = new Scanner(System.in);
		int get = input.nextInt();
		int i = 0;
		System.out.print("����λΪ��");
		for(i = 30; i >= 0; i = i - 2) {
				System.out.print((get >> i) & 1);
		}
		System.out.println();
		System.out.print("ż��λΪ��");
		for(i = 31; i >= 1; i = i - 2) {
			System.out.print((get >> i) & 1);
	    }
	}
	/**
	 * ��������1�ĸ���
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
	 * �����ַ���
	 * @param args
	 */
	public static void main7(String[] args) {
		String password = "abcde";
		int i = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("���������룺");
			String get = input.next();
			if(get.equals(password)) {
				System.out.println("��½�ɹ�");
				break;
			}
			i++;
		}while(i < 3);
		if(i == 3) {
			System.out.println("�˳�����");
		}
	}
	/**
	 * 1-100�������г��ֶ��ٸ�9
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
	 * ����1/1-1/2+1/3-1/4...+1/99-1/100
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
	 * �����������������Լ��
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
		System.out.println("���Լ����"+i);
	}
	/**
	 * ����˷��ھ���
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
	 * �ж������Ƿ�Ϊ����
	 * @param args
	 */
	public static void main2(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������:");
		int num1 = input.nextInt();
		double num = Math.sqrt(num1);
		int i = 0;
		for(i = 2; i <= num; i++) {
			if(num1 % i == 0) {
				break;
			}
		}
			if(i >= num) {
				System.out.println("������");
			}
			else {
				System.out.println("��������");
			}
	}
	
	/**
	 * ������
	 * @param args
	 */
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
        Random random = new Random();
        int ranDom = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.print("������һ������");
        	int input = scan.nextInt();
        	if(input < ranDom) {
              System.out.println("С��");
            }
        	else if(input == ranDom) {
        		System.out.println("��ϲ��¶���");
        		break;
        	}
        	else {
        		System.out.println("����");
        	}
	   }
    }
}
