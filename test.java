package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Print one = new Print("込込込");
        int x=8;
        int y=10;
        int sum=one.Add(x,y);
        System.out.println(sum);
	}

}
class Print{
	public Print(String name)
	{
		System.out.println("更夛痕方  " + name);
	}
	public int Add(int m,int n)
	{
		return m+n;
	}
}

