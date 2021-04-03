package Account;
import User.User;
import java.util.Scanner;
public class Account {
    private int userNum;
    private static double balance;
    private double quota;
    public Account(int userNum) {
        this.userNum = userNum;
        Account.balance = 0.0;
        this.quota = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public boolean put(double value) {
        if(value > 0) {
            balance = balance + value;
            this.quota = balance / userNum;
            return true;
        }
        return false;
    }

    public double get(User us, double value) {
        System.out.print("Please input your password: ");
        Scanner sc = new Scanner(System.in);
        long pas = sc.nextLong();
        us.setPassword(pas);
        if(!us.validate()) {
            System.out.println("Password is wrong!");
            System.exit(0);
        }
        if(value > 0) {
            if(value <= quota) {
                balance = balance - value;
            } else {
                balance = balance - quota;
                value = quota;
            }
            return value;
        }
        return 0;
    }
}
