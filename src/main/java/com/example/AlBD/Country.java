package com.example.AlBD;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity(name="Country")
@Table(name="Country", catalog = "CookBook", schema = "dbo")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Size(max = 500)
    @NotNull
    @Nationalized
    @Column(name = "Description_famous_dishes", nullable = false, length = 500)
    private String descriptionFamousDishes;

}