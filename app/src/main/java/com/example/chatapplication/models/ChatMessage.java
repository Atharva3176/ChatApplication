package com.example.chatapplication.models;

import java.util.Date;

import java.util.Date;

public class ChatMessage {
    public String senderId;
    public String receiverId;
    public String message;
    public String dateTime;
    public Date dataobject;
    public String conversionId, conversionName,conversionImage;

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDataobject() {
        return dataobject;
    }

    public void setDataobject(Date dataobject) {
        this.dataobject = dataobject;
    }
}

