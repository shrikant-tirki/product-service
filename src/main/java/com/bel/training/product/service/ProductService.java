package com.bel.training.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bel.training.product.model.Product;
import com.bel.training.product.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository prepo;

	public List<Product> getProducts(){
		return prepo.findAll();
	}

	public List<Product> saveProduct(Product p){
		prepo.save(p);
		return prepo.findAll();
	}

	public Product get(Long id) {
		return prepo.findById(id).get();
	}

	public Product updateProduct(Long id,Product p) {
		return prepo.save(p);
	}

	public void delete(Long id) {
		prepo.deleteById(id);
	}

}
