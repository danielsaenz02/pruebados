package com.example.demo2.exception;

public class BadRequestCustom extends Exception{

    public BadRequestCustom(String mensaje){
        super(mensaje);
    }
}
