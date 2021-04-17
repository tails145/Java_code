package operation;

import book.BookList;

import java.util.Scanner;

public class FindOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入想要查找的书籍:");
        String name = scanner.next();
        int num = 0;
        //查找
        while(num != bookList.getUsedsize()) {
            //找到输入图书
            if(bookList.getBooks()[num].getName().equals(name)) {
                System.out.println(bookList.getBooks()[num].toString());
                return;
            }
            num++;
        }
        //没找到输入图书
        System.out.println("所输入的书籍不存在");
    }

}
