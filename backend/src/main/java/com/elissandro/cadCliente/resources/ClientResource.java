package com.elissandro.cadCliente.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elissandro.cadCliente.entity.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client>list = new ArrayList<>();
		list.add(new Client(1L, "João", "123456789", 1200.00, null, 2));
		list.add(new Client(2L, "Maria", "9875679890", 1600.00, null, 1));
		list.add(new Client(3L, "Pedro", "65498990890", 1400.00, null, 4));
		return ResponseEntity.ok().body(list);
	}
}
