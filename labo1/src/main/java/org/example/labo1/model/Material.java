package org.example.labo1.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Material {
    private String name;
    private Category category;
    private CookingEffect cookingEffect;
    private Double price;
    private String location;
    private Rarity rarity;
}
