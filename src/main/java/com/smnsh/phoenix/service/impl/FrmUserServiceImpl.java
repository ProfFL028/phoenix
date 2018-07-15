package com.smnsh.phoenix.service.impl;

import com.smnsh.phoenix.entity.FrmUser;
import com.smnsh.phoenix.exception.PasswordErrorException;
import com.smnsh.phoenix.repository.FrmUserRepository;
import com.smnsh.phoenix.service.FrmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrmUserServiceImpl implements FrmUserService {
    @Autowired
    private FrmUserRepository frmUserRepository;

    @Override
    public FrmUser login(String username, String password) throws PasswordErrorException {
        throw new PasswordErrorException();
    }
}
