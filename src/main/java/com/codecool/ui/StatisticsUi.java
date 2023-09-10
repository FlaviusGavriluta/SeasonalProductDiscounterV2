package com.codecool.ui;

import com.codecool.model.enums.Color;
import com.codecool.seasonalproductdiscounter.service.products.statistics.ProductStatistics;

import java.util.Map;

public class StatisticsUi {
    private final ProductStatistics productStatistics;

    public StatisticsUi(ProductStatistics productStatistics) {
        this.productStatistics = productStatistics;
    }

    public void run() {
        for (Map.Entry<Color, Double> entry : productStatistics.getAveragePricesByColor().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

