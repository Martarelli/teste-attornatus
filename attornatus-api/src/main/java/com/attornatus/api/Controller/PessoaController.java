package com.attornatus.api.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.api.model.Pessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@GetMapping
	public List<Pessoa> list() {
		
	}
}
