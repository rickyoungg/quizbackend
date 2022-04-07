package com.Rick.QuizApp.Backend.Model;

public enum ResponseCodes {
    SUCCESS(0,"VALID ENTRY"),
    POSITIONERROR(1, "Invalid Position Input"),
    ARRAYNOTINITIALIZED(2, "Array is not initialized"),
    INVALIDMSGINPUT(3, "Message input is invalid");


    private final int errorCode;
    private final String desc;

    ResponseCodes(int errorCode, String desc) {
        this.errorCode = errorCode;
        this.desc = desc;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDesc() {
        return desc;
    }
}
