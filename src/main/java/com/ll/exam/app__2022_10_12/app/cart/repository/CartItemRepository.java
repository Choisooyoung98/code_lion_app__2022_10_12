package com.ll.exam.app__2022_10_12.app.cart.repository;

import com.ll.exam.app__2022_10_12.app.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByBuyerIdAndProductId(Long buyerId, Long productId);

    boolean existsByBuyerIdAndProductId(Long id, Long id1);
}