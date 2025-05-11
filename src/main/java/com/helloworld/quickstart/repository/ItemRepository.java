package com.helloworld.quickstart.repository;

import com.helloworld.quickstart.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {
}                                           // ItemEntity에서 @Id의 String 타입

