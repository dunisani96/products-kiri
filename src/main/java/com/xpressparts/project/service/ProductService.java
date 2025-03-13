package com.xpressparts.project.service;


import com.xpressparts.project.exception.ProductNotFoundException;
import com.xpressparts.project.model.Product;
import com.xpressparts.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }
    public void updateProduct(int id, Product product) throws Exception {
        Product updatedProduct= getProductById(id);
        updatedProduct.setName(product.getName());
        updatedProduct.setDescription(product.getDescription());
        updatedProduct.setPrice(product.getPrice());
        this.productRepository.save(updatedProduct);

    }

    public Product getProductById(int id) throws Exception {
        return this.productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product with id "+id+" not found"));
    }

    public void deleteProductById(int id) {
        this.productRepository.deleteById(id);
    }
}
