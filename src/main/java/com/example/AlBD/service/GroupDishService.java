package com.example.AlBD.service;


import com.example.AlBD.dto.GroupDish;

import com.example.AlBD.repository.GroupDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupDishService extends AbstractService<GroupDish, GroupDishRepository> {
    @Autowired
    public GroupDishService(GroupDishRepository repository) {
        super(repository);
    }
}