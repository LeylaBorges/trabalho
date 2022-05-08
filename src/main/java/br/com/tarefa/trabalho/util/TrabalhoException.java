package br.com.tarefa.trabalho.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TrabalhoException extends ResponseStatusException {
    public TrabalhoException(String msg){
        super(HttpStatus.INTERNAL_SERVER_ERROR,msg);
    }
}
