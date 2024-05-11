package com.example.AlBD.repository;


import com.example.AlBD.dto.Feedback;
import com.example.AlBD.dto.GroupDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDishRepository extends CommonRepository<GroupDish> {


}