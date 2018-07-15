package com.smnsh.phoenix.service;

import com.smnsh.phoenix.entity.FrmUser;
import com.smnsh.phoenix.exception.PasswordErrorException;

public interface FrmUserService {
    FrmUser login(String username, String password) throws PasswordErrorException;
}
