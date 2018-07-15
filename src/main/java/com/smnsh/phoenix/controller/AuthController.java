package com.smnsh.phoenix.controller;

import com.smnsh.phoenix.exception.PasswordErrorException;
import com.smnsh.phoenix.service.FrmUserService;
import com.smnsh.phoenix.vo.MessageVO;
import com.smnsh.phoenix.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.Set;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {

    @Autowired
    private FrmUserService frmUserService;

    @RequestMapping("login")
    @ResponseBody
    public UserVO login(@Valid UserVO userVO) {

        if (userVO.getUsername().equals("9712152")) {
            frmUserService.login(userVO.getUsername(), userVO.getPassword());
        }

        return userVO;
    }

}
