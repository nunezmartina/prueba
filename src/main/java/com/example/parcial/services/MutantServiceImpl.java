package com.example.parcial.services;

import com.example.parcial.entities.Mutant;
import com.example.parcial.repositories.BaseRepository;
import com.example.parcial.repositories.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class MutantServiceImpl extends BaseServiceImpl<Mutant, Long> implements MutantService, Serializable {

    @Autowired
    protected MutantRepository repository;

    public MutantServiceImpl(BaseRepository<Mutant, Long> baseRepository) {
        super(baseRepository);
    }
}