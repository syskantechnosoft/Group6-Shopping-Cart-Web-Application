package com.revature.shoppingcart.form;

import org.springframework.web.multipart.MultipartFile;

import com.revature.shoppingcart.entity.Product;

import lombok.Data;

@Data
public class ProductForm {
    private String code;
    private String name;
    private double price;

    private boolean newProduct = false;

    // Upload file.
    private MultipartFile fileData;

    public ProductForm() {
        this.newProduct= true;
    }

    public ProductForm(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }
}