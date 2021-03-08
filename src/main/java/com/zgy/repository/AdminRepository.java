package com.zgy.repository;

import com.zgy.entity.Admin;

public interface AdminRepository {
    public Admin login(String uername,String password);
}
