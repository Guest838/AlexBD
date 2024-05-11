package com.example.AlBD.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Recipe")
@Table(name="Recipe", catalog = "CookBook", schema = "dbo")
public class Recipe extends AbstractDto{
    @EmbeddedId
    private RecipeId id;

    @MapsId("idDish")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dish", nullable = false)
    private Dish idDish;

    @MapsId("idProduct")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Product", nullable = false)
    private Product idProduct;

    @MapsId("cookingWayId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Cooking_Way_id", nullable = false)
    private CookingWay cookingWay;

    @NotNull
    @Column(name = "Product_quantity", nullable = false)
    private Double productQuantity;

}