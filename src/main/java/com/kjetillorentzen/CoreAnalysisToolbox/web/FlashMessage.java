package com.kjetillorentzen.CoreAnalysisToolbox.web;

public class FlashMessage {
    private String message;
    private Status status;

    public FlashMessage(String message, Status status) {
        this.message = message;
        this.status = status;
    }

    public static enum Status {
    SUCCESS,FAILURE
    }

}
