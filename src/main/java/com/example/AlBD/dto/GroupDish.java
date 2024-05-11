package com.example.AlBD.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity(name="GroupDish")
@Table(name="Group_Dish", catalog = "CookBook", schema = "dbo")
public class GroupDish extends AbstractDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Nationalized
    @Column(name = "Name", length = 50)
    private String name;

    @Size(max = 500)
    @Nationalized
    @Column(name = "Description", length = 500)
    private String description;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Country_ID", nullable = false)
    private Country country;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Season_ID", nullable = false)
    private Season season;

}