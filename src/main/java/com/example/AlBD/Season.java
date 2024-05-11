package com.example.AlBD;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity(name="Season")
@Table(name="Season", catalog = "CookBook", schema = "dbo")
public class Season {
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
    @Column(name = "Month_Start", nullable = false)
    private Integer monthStart;

    @NotNull
    @Column(name = "Month_End", nullable = false)
    private Integer monthEnd;

}