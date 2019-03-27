package com.hpe.springboot.firstProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.springboot.firstProject.dao.BrandDao;
import com.hpe.springboot.firstProject.dao.CategoryDao;
import com.hpe.springboot.firstProject.dao.ProductDao;
import com.hpe.springboot.firstProject.entity.Brand;
import com.hpe.springboot.firstProject.entity.Category;
import com.hpe.springboot.firstProject.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao dao;
	
	@Autowired
	BrandDao brandDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	
//	@RequestMapping("/view-all-products")
//	public String getProducts(Model model){
//		System.out.println("Hello from Get");
//		
//		Long pc = dao.count();
//		System.out.println(pc);
//		model.addAttribute("count", dao.count());
//		model.addAttribute("products", dao.findAll());
////		
////Iterable<Product> list = dao.findAll();
////		
////		for(Product p : list){
////			System.out.println(p);
////		}
//		return "product-list";
//	}
	
	@RequestMapping("/view-all-products")
	public String getProductList(@RequestParam(name="page", required=false, defaultValue="0") Integer pageNum, Model model){
		
		Pageable pageable = new PageRequest(pageNum, 10);//PageRequest.of(pageNum, 10); 
//		Pageable pageable = PageRequest.of(pageNum, 10);
		List<Product> list = dao.findAll(pageable).getContent();
		
		model.addAttribute("count", dao.count());
		model.addAttribute("products", list);
		
		return "product-list";
	}

	@RequestMapping("/home")
	public String home(@RequestParam(name="filter-by", required=false, defaultValue = "") String filterBy,@RequestParam(name="id", required=false) Integer id , Model model){
		
		Iterable<Product> list;
		switch (filterBy){
		case "brand":
			Brand b = brandDao.findById(id).get();
			list = b.getProducts();
			break;
		case "category":
			Category c = categoryDao.findById(id).get();
			list = c.getProducts();
			break;

			default:
				list = dao.findAll();
		}
		model.addAttribute("brands", brandDao.findAll());
		model.addAttribute("categories", categoryDao.findAll());
		model.addAttribute("products", list);
		
		return "home";
	}

}
