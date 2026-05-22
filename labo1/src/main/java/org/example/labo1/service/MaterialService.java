package org.example.labo1.service;

import org.example.labo1.model.Material;
import org.example.labo1.model.Rarity;
import org.example.labo1.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAllMaterialsSortedByPriceDesc() {
        return materialRepository.findAll()
                .stream()
                .sorted(Comparator.comparingDouble(Material::getPrice).reversed())
                .toList();
    }

    public Material getMostExpensiveMaterial() {
        return materialRepository.findAll()
                .stream()
                .max(Comparator.comparingDouble(Material::getPrice))
                .orElseThrow(() -> new RuntimeException("No materials found"));
    }

    public List<Material> getLegendaryMaterials() {
        return materialRepository.findAll()
                .stream()
                .filter(material -> material.getRarity() == Rarity.LEGENDARIO)
                .toList();
    }

    public List<String> getDistinctLocations() {
        return materialRepository.findAll()
                .stream()
                .map(Material::getLocation)
                .distinct()
                .toList();
    }
}