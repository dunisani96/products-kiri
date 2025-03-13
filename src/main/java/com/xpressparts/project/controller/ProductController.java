package com.xpressparts.project.controller;

import com.xpressparts.project.model.Product;
import com.xpressparts.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products= this.productService.getAllProducts();
        return  new ResponseEntity<>(products, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) throws Exception {
        Product product= this.productService.getProductById(id);
        return  new ResponseEntity<>(product,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveProduct(@RequestBody Product product){
        this.productService.saveProduct(product);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable int id, @RequestBody Product product) throws Exception {
        this.productService.updateProduct(id,product);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id){
        this.productService.deleteProductById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
