package com.zgy.service.impl;

import com.zgy.entity.Admin;
import com.zgy.entity.Reader;
import com.zgy.repository.AdminRepository;
import com.zgy.repository.ReaderRepository;
import com.zgy.repository.impl.AdminRepositoryImpl;
import com.zgy.repository.impl.ReaderRepositoryImpl;
import com.zgy.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private ReaderRepository readerRepository = new ReaderRepositoryImpl();
    private AdminRepository adminRepository = new AdminRepositoryImpl();
    @Override
    public Object login(String username, String password, String type) {
        Object object = null;
        switch (type){
            case "reader":
                object = readerRepository.login(username,password);
                break;
            case "admin":
                object = adminRepository.login(username,password);
                break;
        }
        return object;
    }
}
