package Test;
import java.util.Scanner;
import Account.Account;
import User.User;

public class TestAccount {
    public static void main(String[] args) {
        Account ac = new Account(2);
        User us1 = new User("ZhangHua", ac);
        User us2 = new User("LiMing", ac);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number of savings: ");
        double values = sc.nextDouble();
        us1.save(values);
        System.out.print("Please input the number of getting: ");
        values = sc.nextDouble();
        System.out.println(us1.getName() + " gets " + ac.get(us1,values) + "yuan");
        System.out.println("Account balance: " + ac.getBalance() + "yuan");
        System.out.print("Please input the number of gettings: ");
        values = sc.nextDouble();
        System.out.println(us2.getName() + " gets " + ac.get(us2, values) + "yuan");
        System.out.println("Account balance: " + ac.getBalance() + "yuan");
    }
}
