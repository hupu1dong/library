package com.zgy.service;

import com.zgy.entity.Book;
import com.zgy.entity.Borrow;

import java.util.List;

public interface BookService {
    public List<Book> findAll(int page);
    public int getPages();
    public int getBorrowPages(Integer readerid);
    public void addBorrow(Integer bookid,Integer readerid);
    public List<Borrow> findAllBorrowByReaderId(Integer id,Integer page);
    public List<Borrow> findAllBorrowByState(Integer state,Integer page);
    public int getBorrowPagesByState(Integer state);
    public void handleBorrow(Integer id,Integer state,Integer adminId);

}
