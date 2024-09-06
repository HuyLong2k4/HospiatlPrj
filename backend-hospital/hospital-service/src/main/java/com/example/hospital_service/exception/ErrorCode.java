package com.example.hospital_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    PATIENT_EXISTED(1002, "User existed"),
    PATIENT_NOT_EXISTED(1003,"Patient not existed ")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;

    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

}
