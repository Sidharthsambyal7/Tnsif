package com.example.itemsmodule;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ItemsController 
{
 @Autowired
 private ItemsServices service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/Items")
 public List<Items> list() 
 {
 return service.listAll();
 }
 @GetMapping("/Items/{id}")
 public ResponseEntity<Items> get(@PathVariable Integer id) 
 {
 try
 {
 Items items = service.get(id);
 return new ResponseEntity<Items>(items, HttpStatus.OK);
 } 
 catch (Exception e) 
 {
 return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/items")
 public void add(@RequestBody Items items) 
 {
 service.save(items);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/products/{id}")
 public ResponseEntity<?> update(@RequestBody Items item, @PathVariable Integer id) 
 {
 try
 {
 Items existItems = service.get(id);
 service.save(existItems);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (Exception e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/items/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
}