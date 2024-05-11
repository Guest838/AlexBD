package com.example.AlBD.controller;

import com.example.AlBD.dto.AbstractDto;
import com.example.AlBD.dto.CookingWay;
import com.example.AlBD.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public abstract class AbstractController<T extends AbstractDto, S extends CommonService<T>>
        implements CommonController<T> {

    private final S service;

    @Autowired
    protected AbstractController(S service) {
        this.service = service;
    }


    @Override
    public ResponseEntity<List<T>> getAll() {
        return service.getAll();
    }


    public ResponseEntity<T> getByID(int id) {
        return service.getByID(id);
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<T> updateByID(Integer id, @RequestBody T obj) throws IllegalAccessException {

        return service.updateByID(id,obj);


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteByID(int id) {
        service.deleteByID(id);
    }
}