package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Print one = new Print("������");
        int x=8;
        int y=10;
        int sum=one.Add(x,y);
        System.out.println(sum);
	}

}
class Print{
	public Print(String name)
	{
		System.out.println("���캯��  " + name);
	}
	public int Add(int m,int n)
	{
		return m+n;
	}
}

