package online.shop.service;

import online.shop.model.Product;
import online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void createOrUpdateProduct(Product product){
        if(null==product.getId()){
            createProduct(product);
            return;
        }
        updateProduct(product);

    }
    public void createProduct(Product product){
        productRepository.save(product);
    }
    public void updateProduct(Product product){
        productRepository.save(product);
    }
    public void removeProduct(){

    }
}
