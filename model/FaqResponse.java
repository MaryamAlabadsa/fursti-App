package com.example.myapplication.model;

import java.util.List;

public class FaqResponse {
    private boolean status;
    private Message message;
    private List<FaqItem> data;

    public boolean isStatus() { return status; }
    public Message getMessage() { return message; }
    public List<FaqItem> getData() { return data; }

    public class Message {
        private String message;
        public String getMessage() { return message; }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setData(List<FaqItem> data) {
        this.data = data;
    }
}

