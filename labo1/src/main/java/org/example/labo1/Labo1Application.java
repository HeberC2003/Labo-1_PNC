package org.example.labo1;

import org.example.labo1.model.Material;
import org.example.labo1.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Labo1Application implements CommandLineRunner {

    private final MaterialService materialService;

    public Labo1Application(MaterialService materialService) {
        this.materialService = materialService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Labo1Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("\n=== CATÁLOGO COMPLETO [HYRULE-DB] ===");
        List<Material> allMaterials = materialService.getAllMaterialsSortedByPriceDesc();
        allMaterials.forEach(material -> System.out.println(
                "[HYRULE-DB] Nombre: " + material.getName() +
                        " | Categoría: " + material.getCategory() +
                        " | Precio: " + material.getPrice().intValue() + " Rupias"
        ));

        System.out.println("\n=== MATERIAL MÁS CARO ===");
        Material mostExpensive = materialService.getMostExpensiveMaterial();
        System.out.println("[HYRULE-DB] Nombre: " + mostExpensive.getName() +
                " | Precio: " + mostExpensive.getPrice().intValue() + " Rupias");

        System.out.println("\n=== MATERIALES LEGENDARIOS ===");
        materialService.getLegendaryMaterials().forEach(material ->
                System.out.println("[HYRULE-DB] Nombre: " + material.getName() +
                        " | Rareza: " + material.getRarity())
        );

        System.out.println("\n=== UBICACIONES ÚNICAS ===");
        materialService.getDistinctLocations().forEach(location ->
                System.out.println("[HYRULE-DB] Ubicación: " + location)
        );
    }
}