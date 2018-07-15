package com.smnsh.phoenix.validation;

import antlr.StringUtils;

import javax.validation.ConstraintViolation;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ValidatedMessage {
    private String field;
    private String code;
    private String message;

    public List<ValidatedMessage> fromContraintViolations(Collection<ConstraintViolation> violations) {
        return violations.stream().map(ValidatedMessage::of).collect(Collectors.toList());
    }

    private static ValidatedMessage of(ConstraintViolation violation) {
        String field = StringUtils.stripBack(violation.getPropertyPath().toString(), '.');
        return new ValidatedMessage(field, violation.getMessageTemplate(), violation.getMessage());
    }

   public ValidatedMessage(String field, String code, String message) {
        this.field = field;
        this.code = code;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
