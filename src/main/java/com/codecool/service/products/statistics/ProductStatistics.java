package com.codecool.service.products.statistics;

import com.codecool.model.enums.Color;
import com.codecool.model.enums.Season;
import com.codecool.model.products.PriceRange;
import com.codecool.model.products.Product;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;

public interface ProductStatistics {
    Optional<Product> getMostExpensive();

    Optional<Product> getCheapest();

    OptionalDouble getAveragePrice();

    Map<String, Double> getAveragePricesByName();

    Map<Color, Double> getAveragePricesByColor();

    Map<Season, Double> getAveragePricesBySeason();

    Map<PriceRange, Double> getAveragePricesByPriceRange();

    Map<String, Integer> getCountByName();

    Map<Color, Integer> getCountByColor();

    Map<Season, Integer> getCountBySeason();

    Map<PriceRange, Integer> getCountByPriceRange();
}