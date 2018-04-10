package com.lechenggu.bkeasygo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppException extends RuntimeException {

    private String msg;
    private int code;


}
