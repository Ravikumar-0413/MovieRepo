package com.example.MoviesApi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MoviesApi.Entity.Kids;
import com.example.MoviesApi.Repo.KidsRepo;

@Service
public class KidsService {
	 
	private final KidsRepo kidrepo ;
	 

	public KidsService(KidsRepo kidrepo) {
		this.kidrepo = kidrepo;
	}
	//for adding  a cn to the database
	public Kids addCn(Kids kid) {
		return kidrepo.save(kid);
	}
	// for view or to get the all Cn in the database
	public List<Kids> getAllCn() {
	        return kidrepo.findAll();
	}
	// for view or to get the all Cn in the database by id
	public Kids getCnById(Long id) {
	        return kidrepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Movie not found"));
	}
	// to delete the cn by id
	 public void deleteCn(Long id) {
	        Kids kid = getCnById(id);
	        kidrepo.delete(kid);
	 }
	 //for updating the existing records
	 public Kids updateCn(Long id, Kids updatedKids) {
	        Kids kid = getCnById(id);
	        kid.setTitle(updatedKids.getTitle());
	        kid.setDescription(updatedKids.getDescription());
	        kid.setGenre(updatedKids.getGenre());
	        kid.setLanguage(updatedKids.getLanguage());
	        kid.setReleaseyear(updatedKids.getReleaseyear());
	       
	        kid.setRating(updatedKids.getRating());
	        kid.setPosterUrl(updatedKids.getPosterUrl());
	        
	        kid.setVideoUrl(updatedKids.getVideoUrl());

	        return kidrepo.save(kid);
	    }
	
}
