package user;

import book.BookList;
import operation.Work;

public abstract class User {

    protected String name;

    protected Work[] works;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public abstract void doOperation(BookList bookList,int choice);

}
