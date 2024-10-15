package com.example.parcial.controllers;

import com.example.parcial.entities.Base;
import com.example.parcial.services.MutantService;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public class BaseControllerImpl<E extends Base, ID extends Serializable> implements BaseController<E, ID> {

    protected MutantService service;

    @Override
    public ResponseEntity<?> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOne(ID id) {
        return null;
    }

    //metodo que recibe un json de Persona y devuelve si es o no mutante
    @Override
    public ResponseEntity<?> save(E entity) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(ID id, E entity) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(ID id) {
        return null;
    }


}