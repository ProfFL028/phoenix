package com.smnsh.phoenix.exception;

public class PasswordErrorException extends RuntimeException {

    public PasswordErrorException() {
        super("用户名或密码错误");
    }
}
