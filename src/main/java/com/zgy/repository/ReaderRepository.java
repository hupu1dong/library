package com.zgy.repository;

import com.zgy.entity.Reader;

public interface ReaderRepository {
    public Reader login(String username,String password);
}
