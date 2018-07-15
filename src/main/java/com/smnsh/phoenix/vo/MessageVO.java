package com.smnsh.phoenix.vo;

import com.smnsh.phoenix.validation.ValidatedMessage;

import java.time.LocalDateTime;
import java.util.List;

public class MessageVO {
    public static final String MESSAGE_ERROR = "error";
    public static final String MESSAGE_INFO = "info";
    public static final String MESSAGE_WARNING = "warning";

    private String message;
    private String messageLevel;
    private LocalDateTime platTime;

    private List<ValidatedMessage> messages;

    public MessageVO() {
        this.platTime = LocalDateTime.now();
    }

    public MessageVO(String message, String messageLevel) {
        this();
        this.message = message;
        this.messageLevel = messageLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageLevel() {
        return messageLevel;
    }

    public void setMessageLevel(String messageLevel) {
        this.messageLevel = messageLevel;
    }

    public LocalDateTime getPlatTime() {
        return platTime;
    }

    public void setPlatTime(LocalDateTime platTime) {
        this.platTime = platTime;
    }

    public List<ValidatedMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ValidatedMessage> messages) {
        this.messages = messages;
    }
}
