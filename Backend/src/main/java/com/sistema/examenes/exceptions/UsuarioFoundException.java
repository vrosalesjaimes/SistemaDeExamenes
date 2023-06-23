package com.sistema.examenes.exceptions;

public class UsuarioFoundException extends Exception{

    public UsuarioFoundException(){
        super("El usuario con ese Username ya existe, vuelva a intentarlo");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
