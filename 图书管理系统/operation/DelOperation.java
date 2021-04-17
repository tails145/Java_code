package operation;

import book.BookList;

import java.util.Scanner;

public class DelOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的书籍:");
        String name = scanner.next();
        int num = 0;
        //查找
        while(num != bookList.getUsedsize()) {
            //找到所输入书籍
            if(bookList.getBooks()[num].getName().equals(name)) {
                while(num != bookList.getUsedsize()-1) {
                    bookList.getBooks()[num] = bookList.getBooks()[num+1];
                    num++;
                }
                bookList.setUsedsize(bookList.getUsedsize()-1);
                System.out.println("删除完成");
                return;
            }
            num++;
        }
        //没找到所输入书籍
        System.out.println("所输入的书籍不存在");
    }

}
