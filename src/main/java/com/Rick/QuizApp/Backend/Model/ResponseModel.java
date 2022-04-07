package com.Rick.QuizApp.Backend.Model;

public class ResponseModel<T> {
    // error code, status message, returning data
    private Integer errorCode;
    private String statusMessage;
    private T returningData;

    public Integer getErrorCode(){
        return errorCode;
    }

    public String getStatusMessage(){
        return statusMessage;
    }

    public T getReturningData() {
        return returningData;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setReturningData(T returningData) {
        this.returningData = returningData;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
