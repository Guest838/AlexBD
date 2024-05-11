package com.example.AlBD.repository;

import com.example.AlBD.dto.AbstractDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<T extends AbstractDto> extends JpaRepository<T, Integer> {
}