package com.example.dbexample.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Response {
    private Date timeStamp;
    private int status;
    private String message;
    private Object data;
}
