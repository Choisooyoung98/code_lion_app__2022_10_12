package com.ll.exam.app__2022_10_12.app.product.service;

import com.ll.exam.app__2022_10_12.app.product.entity.Product;
import com.ll.exam.app__2022_10_12.app.product.repository.ProductRepository;
import com.ll.exam.app__2022_10_12.app.song.entity.Song;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {
    private final ProductRepository productRepository;

    public Product create(Song song, String subject, int price) {
        Product product = Product.builder()
                .song(song)
                .subject(subject)
                .price(price)
                .author(song.getAuthor())
                .build();

        productRepository.save(product);

        return product;
    }

    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public void modify(Product product, String subject, int price) {
        product.setSubject(subject);
        product.setPrice(price);
    }
}
