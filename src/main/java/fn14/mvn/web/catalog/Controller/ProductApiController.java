/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fn14.mvn.web.catalog.Controller;

import fn14.mvn.web.catalog.Dao.ProductDao;
import fn14.mvn.web.catalog.Entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FN14
 */
@RestController @RequestMapping("/api/product")
public class ProductApiController {
    @Autowired private ProductDao productDao;
    
    @GetMapping("/")
    public Page<Product> findProducts(Pageable page){
        return productDao.findAll(page);
    }
    
    
    
    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Product p){
        return p;
    }
    
    
}
