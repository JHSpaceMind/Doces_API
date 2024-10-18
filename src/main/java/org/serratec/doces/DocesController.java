package org.serratec.doces;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/doces")
public class DocesController {
	
   @Autowired
   private DocesRepository repositorio;
   
    
    
   @GetMapping
   public List<Doces> obterTodos() {
		return repositorio.findAll();
	}
  
  @GetMapping("/{id}")
	public ResponseEntity <Doces> obterPorId(@PathVariable Long id) {
	  if(!repositorio.existsById(id)) {
		  return ResponseEntity.notFound().build();
	  }
    return ResponseEntity.ok(repositorio.findById(id).get());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Doces cadastrarFilme(@RequestBody @Valid Doces doce) {
		return repositorio.save(doce);
		
		}
	@DeleteMapping("/{id}")
	public ResponseEntity <Doces> excluirFilme (@PathVariable Long id) {
		 if(!repositorio.existsById(id)) {
		return ResponseEntity.notFound().build(); 
				 }
		 repositorio.deleteById(id);
		 return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity <Doces> alternarFilme(@PathVariable Long id ,@RequestBody  @Valid Doces doce) {
		 if(!repositorio.existsById(id)) {
		return ResponseEntity.notFound().build(); 
		 }
		 doce.setId(id);
	     repositorio.save(doce);
		 return ResponseEntity.ok(doce);
		 
	}
	
}


