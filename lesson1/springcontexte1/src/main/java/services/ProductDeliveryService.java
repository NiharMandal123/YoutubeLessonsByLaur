package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {
//    @Autowired
//    private ProductRepository productRepository;
private final ProductRepository productRepository;
@Autowired
    public ProductDeliveryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("Hello Guys !!! ");
    }

    public void addSomeProducts(){
        productRepository.add();;
        productRepository.add();;
    }
}
