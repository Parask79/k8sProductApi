package com.nagp.k8s.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "homeproduct_tblnew")
public class Products {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "product")
    private String product;

    @Column(name = "product_brand")
    private String productBrand;

    
    Products() {}
    
	public Products(int id, String product, String productBrand) {
		this.id = id;
	    this.product = product;
	    this.productBrand = productBrand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProduct_brand() {
		return productBrand;
	}

	public void setProduct_brand(String product_brand) {
		this.productBrand = product_brand;
	}

    
}

