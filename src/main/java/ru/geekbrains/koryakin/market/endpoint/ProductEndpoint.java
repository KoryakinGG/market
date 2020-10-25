package ru.geekbrains.koryakin.market.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.geekbrains.koryakin.market.api.products.GetProductsRequest;
import ru.geekbrains.koryakin.market.api.products.GetProductsResponse;
import ru.geekbrains.koryakin.market.api.products.Product;
import ru.geekbrains.koryakin.market.repositories.ProductsRepository;
import ru.geekbrains.koryakin.market.services.ProductService;

import javax.xml.datatype.DatatypeConfigurationException;

@Endpoint
public class ProductEndpoint {
    private static final String NAMESPACE_URI = "http://geekbrains.ru/koryakin/market/api/products";

    private ProductService productService;

    @Autowired
    public ProductEndpoint(ProductService productService) {
        this.productService = productService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductRequest")
    @ResponsePayload
    public GetProductsResponse getProduct(@RequestPayload GetProductsRequest request) throws DatatypeConfigurationException {
        GetProductsResponse response = new GetProductsResponse();
//        response.setProductList((Product) productsRepository.findAllBy());
        response.setProductList(productService.generateProduct(request.getProduct()));
        return response;
    }

}
