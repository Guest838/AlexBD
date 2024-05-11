package com.example.AlBD.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalTime;

@Getter
@Setter
@Entity(name="Cooking_Way")
@Table(name="Cooking_Way", catalog = "CookBook", schema = "dbo")
public class CookingWay extends AbstractDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "Kind", nullable = false, length = 50)
    private String kind;

    @NotNull
    @Column(name = "Duration", nullable = false)
    private LocalTime duration;

}