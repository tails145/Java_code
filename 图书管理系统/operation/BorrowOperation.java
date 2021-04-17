package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入想要借阅的书名:");
        String name = scanner.next();
        int num = 0;
        while(num != bookList.getUsedsize()) {
            //找到要借阅的书籍
            if(bookList.getBooks()[num].getName().equals(name)) {
                //若书籍已被借出
                if(bookList.getBooks()[num].isBorrow()) {
                    System.out.println("该书籍已被借出");
                    return;
                    //若没被借出
                }else {
                    bookList.getBooks()[num].setBorrow(true);
                    System.out.println("借阅成功");
                    return;
                }
            }
            num++;
        }
        //没找到所输入书籍
        System.out.println("所输入的书籍不存在");
    }

}
