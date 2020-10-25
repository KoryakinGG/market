package ru.geekbrains.koryakin.market.services;

import org.springframework.stereotype.Component;
import ru.geekbrains.koryakin.market.api.products.Product;

import javax.xml.datatype.DatatypeConfigurationException;

@Component
public class ProductService {
    public Product generateProduct (String name) throws DatatypeConfigurationException {
        Product product = new Product();
        product.getTitle();
        return product;
    }
}
