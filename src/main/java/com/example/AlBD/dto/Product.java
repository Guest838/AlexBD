package com.example.AlBD.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity(name="Product")
@Table(name="Product", catalog = "CookBook", schema = "dbo")
public class Product extends AbstractDto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @NotNull
    @Column(name = "Calorie", nullable = false)
    private Integer calorie;

    @NotNull
    @Column(name = "Price", nullable = false)
    private Double price;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "Measure_unit", nullable = false, length = 50)
    private String measureUnit;

    @NotNull
    @Column(name = "Count_for_calorie", nullable = false)
    private Integer countForCalorie;

}