package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scanner = new Scanner(System.in);
        //输入信息
        System.out.println("请输入书名:");
        String name = scanner.next();
        System.out.println("请输入价钱:");
        double price = scanner.nextDouble();
        System.out.println("请输入作者:");
        String author = scanner.next();
        System.out.println("请输入类型:");
        String type = scanner.next();
        //添加书籍
        bookList.getBooks()[bookList.getUsedsize()] = new Book(name,price,author,type);
        bookList.setUsedsize(bookList.getUsedsize()+1);
        System.out.println("添加完成");
    }

}
