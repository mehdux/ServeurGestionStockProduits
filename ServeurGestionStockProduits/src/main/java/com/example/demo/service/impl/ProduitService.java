package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.entity.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.service.ICrudService;

@Service
@Primary
public class ProduitService implements ICrudService<Produit, Long>{
	
	@Autowired
	private ProduitRepository produitRepository;

	public List<Produit> getAll() {
		return produitRepository.findAll();
	}

	public void add(Produit produit) {
		produitRepository.save(produit);		
	}

	public void update(Produit produit) {
		produitRepository.save(produit);
	}

	public void delete(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produitRepository.delete(produit);
	}

}
