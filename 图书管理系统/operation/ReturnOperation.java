package operation;

import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入想要归还的书名:");
        String name = scanner.next();
        int num = 0;
        while(num != bookList.getUsedsize()) {
            //找到要归还的书籍
            if(bookList.getBooks()[num].getName().equals(name)) {
                    bookList.getBooks()[num].setBorrow(false);
                    System.out.println("归还成功");
                    return;
                }
            num++;
            }
        //没找到所输入书籍
        System.out.println("所输入的书籍不存在");
    }

}
