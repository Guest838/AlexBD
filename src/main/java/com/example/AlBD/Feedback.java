package com.example.AlBD;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity(name="Feedback")
@Table(name="Feedback", catalog = "CookBook", schema = "dbo")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 500)
    @NotNull
    @Nationalized
    @Column(name = "Description", nullable = false, length = 500)
    private String description;

    @NotNull
    @Column(name = "Score", nullable = false)
    private Integer score;

}