package com.online.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.online.*;
import com.online.model.Item;
import com.online.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/items")
public class ItemController {

	 private final ItemService itemService;

	    public ItemController(ItemService itemService) {
	        this.itemService = itemService;
	    }
	
	@PostMapping("/add")
	public ResponseEntity<Item> addItem(@Valid @RequestBody Item item){
		return ResponseEntity.ok(itemService.addItem(item));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getItem(@PathVariable Long id){
	return itemService.getItemById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}



	
	
	
}
