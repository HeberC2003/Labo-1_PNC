package org.example.labo1.repository;

import org.example.labo1.model.Category;
import org.example.labo1.model.CookingEffect;
import org.example.labo1.model.Material;
import org.example.labo1.model.Rarity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialRepository {
    public List<Material> findAll() {
        return List.of(
                Material.builder()
                        .name("Ámbar Rojo")
                        .category(Category.MINERAL)
                        .cookingEffect(CookingEffect.DEFENSA)
                        .price(30.0)
                        .location("Cordillera de Hebra")
                        .rarity(Rarity.RARO)
                        .build(),
                Material.builder()
                        .name("Ala de Keese")
                        .category(Category.PARTE_DE_MONSTRUO)
                        .cookingEffect(CookingEffect.ATAQUE)
                        .price(15.0)
                        .location("Desierto Gerudo")
                        .rarity(Rarity.COMUN)
                        .build(),
                Material.builder()
                        .name("Pimienta Ardiente")
                        .category(Category.PLANTA)
                        .cookingEffect(CookingEffect.ESTAMINA)
                        .price(10.0)
                        .location("Volcán de Eldin")
                        .rarity(Rarity.POCO_COMUN)
                        .build(),
                Material.builder()
                        .name("Escama de Dragón")
                        .category(Category.PARTE_DE_MONSTRUO)
                        .cookingEffect(CookingEffect.CORAZONES)
                        .price(150.0)
                        .location("Cordillera de Hebra")
                        .rarity(Rarity.LEGENDARIO)
                        .build(),
                Material.builder()
                        .name("Manzana Dulce")
                        .category(Category.COMIDA)
                        .cookingEffect(CookingEffect.CORAZONES)
                        .price(5.0)
                        .location("Bosque Korok")
                        .rarity(Rarity.COMUN)
                        .build(),
                Material.builder()
                        .name("Zafiro")
                        .category(Category.MINERAL)
                        .cookingEffect(CookingEffect.SIGILO)
                        .price(260.0)
                        .location("Desierto Gerudo")
                        .rarity(Rarity.LEGENDARIO)
                        .build()
        );
    }
}