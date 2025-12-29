package com.example.MoviesApi.Controller.copy;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MoviesApi.Entity.Kids;
import com.example.MoviesApi.Service.KidsService;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/kids")
public class KidController {
	private final KidsService kidsservice;

	public KidController(KidsService kidsservice) {
		this.kidsservice = kidsservice;
	}
	@GetMapping
	 public ResponseEntity<List<Kids>> getAllCn() {
        return ResponseEntity.ok(kidsservice.getAllCn());
    }
	@PostMapping
	public ResponseEntity<Kids> addMovie(@RequestBody Kids kid) {
	      return new ResponseEntity<>(kidsservice.addCn(kid), HttpStatus.CREATED);
	}
	 @GetMapping("/{id}")
	    public ResponseEntity<Kids> getCnById(@PathVariable Long id) {
	        return ResponseEntity.ok(kidsservice.getCnById(id));
	 }
	 @PutMapping("/{id}")
	    public ResponseEntity<Kids> updateCn(
	            @PathVariable Long id,
	            @RequestBody Kids kid) {

	        return ResponseEntity.ok(kidsservice.updateCn(id, kid));
	    }

	    // Delete Movie
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteCn(@PathVariable Long id) {
	        kidsservice.deleteCn(id);
	        return ResponseEntity.ok("Movie deleted successfully");
	    }

}
