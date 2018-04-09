package com.lechenggu.bkeasygo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppException extends Exception {

    private String message;
    private int code;


}
