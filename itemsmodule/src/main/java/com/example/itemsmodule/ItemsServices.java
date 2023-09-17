package com.example.itemsmodule;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ItemsServices
{
 @Autowired
 private ItemsRepository repo;
 
 public List<Items> listAll() 
 {
 return repo.findAll();
 }
 public Items get(Integer id)
 {
	 return repo.findById(id).get();
 }
 
 public void save(Items items) 
 {
 repo.save(items);
 }
 
 
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 }
}