package com.example.myapplication.api;

public class PolicyResponse {
    private boolean status;
    private Message message;
    private Data data;

    public Data getData() {
        return data;
    }

    public static class Message {
        private String message;
    }

    public static class Data {
        private String title;
        private String description;

        public String getTitle() { return title; }
        public String getDescription() { return description; }
    }
}

