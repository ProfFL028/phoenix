package com.smnsh.phoenix.controller;

import com.smnsh.phoenix.vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class JsonErrorController implements ErrorController {
    public static final String ERROR_PATH = "/error";
    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(ERROR_PATH)
    @ResponseBody
    public Map<String, Object> handleError(HttpServletRequest request) {
        ServletWebRequest webRequest = new ServletWebRequest(request);
        Map<String, Object> errorAttributes = this.errorAttributes.getErrorAttributes(webRequest,false);
        return errorAttributes;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
