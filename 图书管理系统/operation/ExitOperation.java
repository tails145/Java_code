package operation;

import book.BookList;

public class ExitOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
    }

}
