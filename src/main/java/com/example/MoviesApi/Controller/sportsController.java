package com.example.MoviesApi.Controller;

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
import com.example.MoviesApi.Entity.Sports;
import com.example.MoviesApi.Service.sportsService;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/sports")
public class sportsController {
	private final sportsService sportsservice;

	public sportsController(sportsService sportsservice) {
		super();
		this.sportsservice = sportsservice;
	}
	@GetMapping
	 public ResponseEntity<List<Sports>> getAllsports() {
       return ResponseEntity.ok(sportsservice.getAllsports());
   }
	@PostMapping
	public ResponseEntity<Sports> addMovie(@RequestBody Sports spt) {
	      return new ResponseEntity<>(  sportsservice.addSport(spt), HttpStatus.CREATED);
	}
	 @GetMapping("/{id}")
	    public ResponseEntity<Sports> getsportById(@PathVariable Long id) {
	        return ResponseEntity.ok( sportsservice.getsportById(id));
	 }
	 @PutMapping("/{id}")
	    public ResponseEntity<Sports>  updatesport(
	            @PathVariable Long id,
	            @RequestBody Sports spt) {
	        return ResponseEntity.ok(sportsservice. updatesport(id, spt));
	    }
	    // Delete sport
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deletesport(@PathVariable Long id) {
	    	 sportsservice.deletesport(id);
	        return ResponseEntity.ok("sport deleted successfully");
	    }
}
