package operation;

import book.BookList;

public class DisplayOperation implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        //不存在书籍时
        if(bookList.getUsedsize() == 0) {
            System.out.println("当前无任何书籍");
            return;
        }
        int i = 0;
        for(i = 0;i < bookList.getUsedsize();i++) {
//            System.out.println("书名:" + bookList.getBooks()[i].getName() +
//                    " 价格:" + bookList.getBooks()[i].getPrice() +
//                    " 作者:" + bookList.getBooks()[i].getAuthor() +
//                    " 类型:" + bookList.getBooks()[i].getType());
            System.out.println(bookList.getBooks()[i].toString());
        }
    }

}
