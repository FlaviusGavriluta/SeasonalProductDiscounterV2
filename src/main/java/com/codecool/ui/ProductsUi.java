package com.codecool.ui;

import com.codecool.model.products.Product;
import com.codecool.seasonalproductdiscounter.service.products.browser.ProductBrowser;

import java.util.Collection;

public class ProductsUi {
    private final ProductBrowser productBrowser;

    public ProductsUi(ProductBrowser productBrowser) {
        this.productBrowser = productBrowser;
    }

    public void run() {
        printProducts("Shirts", productBrowser.getByName("shirt"));

        //...
    }

    private static void printProducts(String text, Collection<Product> products) {
        System.out.println(text + ": ");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

