import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class BookTest {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入身份 1.管理员 2.普通用户:");
        int choice = scanner.nextInt();
        if(choice == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {

        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(bookList,choice);
            if(choice == 0) {
                break;
            }
        }

    }
}
