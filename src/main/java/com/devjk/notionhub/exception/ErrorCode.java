package com.devjk.notionhub.exception;

public enum ErrorCode {

  UNKNOWN_ERROR(500, "C001", "Unknown Error occured");

  private final int status;
  private final String code;
  private final String message;

  ErrorCode(int status, String code, String message) {
    this.status = status;
    this.code = code;
    this.message = message;
  }

  public int getStatus() {
    return this.status;
  }

  public String getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

}
