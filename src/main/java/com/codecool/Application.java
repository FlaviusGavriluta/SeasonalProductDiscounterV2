package com.codecool;

import com.codecool.service.products.browser.ProductBrowser;
import com.codecool.service.products.provider.RandomProductGenerator;
import com.codecool.service.products.statistics.ProductStatistics;
import com.codecool.ui.ProductsUi;
import com.codecool.ui.StatisticsUi;

public class Application {
    public static void main(String[] args) {
        var productProvider = new RandomProductGenerator(100, 10, 50);
        ProductBrowser productBrowser = null;
        ProductStatistics productStatistics = null;

        var productsUi = new ProductsUi(productBrowser);
        var statisticsUi = new StatisticsUi(productStatistics);

        productsUi.run();
    }
}
