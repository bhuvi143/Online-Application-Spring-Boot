package com.online.service;

import java.util.*;


import org.springframework.stereotype.Service;

import com.online.model.Item;


@Service
public class ItemService {
	
	private final List<Item> items = new ArrayList<>();
	
	private long idCounter = 1;
	
	// ADD ITEM
	
	public Item addItem(Item item) {
		item.setId(idCounter++);
		items.add(item);
		return item;
	}
	
	//Get Item By ID
	
	public Optional <Item> getItemById(Long id){
		return items.stream().filter(item->item.getId().equals(id)).findFirst();
	}
	

}
