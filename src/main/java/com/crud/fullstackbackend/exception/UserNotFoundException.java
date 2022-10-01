package com.crud.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Usuário com o ID "+ id +" não foi encontrado");
    }
}
