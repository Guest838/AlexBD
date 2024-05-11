package com.example.AlBD.controller;

import com.example.AlBD.dto.AbstractDto;
import com.example.AlBD.dto.CookingWay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



public interface CommonController<T extends AbstractDto> {



    @GetMapping (value = "/getAll")
    public ResponseEntity<List<T>> getAll();

    @GetMapping(value = "/getByID")
    public ResponseEntity<T> getByID(int id);

    @PutMapping(value="/updateByID")
    public ResponseEntity<T> updateByID(Integer id, @RequestBody T obj) throws IllegalAccessException;

    @DeleteMapping(value = "/deleteByID")
    public void deleteByID(int id);

//остальные методы
}