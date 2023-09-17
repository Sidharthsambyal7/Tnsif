package com.example.itemsmodule;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemsRepository extends JpaRepository<Items, Integer> 
{
}