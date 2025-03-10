package com.example.parcial.repositories;

import com.example.parcial.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository<E extends Base, I extends Serializable> extends JpaRepository<E, I> {
}