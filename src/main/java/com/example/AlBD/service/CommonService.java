package com.example.AlBD.service;

import com.example.AlBD.dto.AbstractDto;
import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Field;
import java.util.List;

public interface CommonService<T extends AbstractDto> {

    public ResponseEntity<List<T>> getAll();
   public ResponseEntity<T> getByID(Integer id);

    public ResponseEntity<T> updateByID(Integer id, @RequestBody T obj) throws IllegalAccessException;

    public void deleteByID(Integer id);

}


