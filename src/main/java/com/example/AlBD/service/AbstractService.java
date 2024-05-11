package com.example.AlBD.service;

import com.example.AlBD.dto.AbstractDto;
import com.example.AlBD.repository.CommonRepository;
import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Field;
import java.util.List;

public abstract class AbstractService<T extends AbstractDto, R extends CommonRepository<T>>
        implements CommonService<T> {

    protected final R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }
    @Override
    public ResponseEntity<List<T>> getAll() {
        var result=repository.findAll();
        if (!result.isEmpty())
        {
            return ResponseEntity.ok(result);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }
    @Override
    public ResponseEntity<T> getByID(Integer id) {
        var result=repository.findById(id);
        return  result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @Override
    public ResponseEntity<T> updateByID(Integer id, @RequestBody T obj) throws IllegalAccessException {
        if (repository.findById(id).isPresent()) {
            T result = repository.findById(id).orElseThrow(RuntimeException::new);
            for (Field f : result.getClass().getDeclaredFields()) {
                if (!f.getName().equals("id")) {
                    PropertyAccessor myAccessor = PropertyAccessorFactory.forBeanPropertyAccess(result);
                    f.setAccessible(true);
                    myAccessor.setPropertyValue(f.getName(), f.get(obj));
                }
            }
            return ResponseEntity.ok(repository .save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    @Override
    public void deleteByID(Integer id) {
        repository.deleteById(id);
    }
    public void getByConstraintID()
    {

    }


}
