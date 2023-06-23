package com.sistema.examenes.exceptions;

public class UsuarioNotFoundException extends Exception{

    public UsuarioNotFoundException(){
        super("El usuario con ese Username no existe, vuelva a intentarlo");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
