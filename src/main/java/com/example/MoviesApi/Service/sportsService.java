package com.example.MoviesApi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MoviesApi.Entity.Sports;
import com.example.MoviesApi.Repo.SportsRepositroy;

 

@Service
public class sportsService {

    private final SportsRepositroy sportsrepo;

    public sportsService(SportsRepositroy sportsrepo) {
        this.sportsrepo = sportsrepo;
    }

    // Add sport
    public Sports addSport(Sports spt) {
        return sportsrepo.save(spt);
    }

    // Get all sports
    public List<Sports> getAllsports() {
        return sportsrepo.findAll();
    }

    // Get sport by id
    public Sports getsportById(Long id) {
        return sportsrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Sport not found with id: " + id));
    }

    // Delete sport
    public void deletesport(Long id) {
        Sports spt = getsportById(id);
        sportsrepo.delete(spt);
    }

    // Update sport
    public Sports updatesport(Long id, Sports updatedsport) {
        Sports spt = getsportById(id);

        spt.setName(updatedsport.getName());
        spt.setCountry(updatedsport.getCountry());
        spt.setBest_perfomance(updatedsport.getBest_perfomance());
        spt.setRole(updatedsport.getRole());
        spt.setBattingStyle(updatedsport.getBattingStyle());
        spt.setBowlingStyle(updatedsport.getBowlingStyle());
        spt.setMatches(updatedsport.getMatches());
        spt.setRuns(updatedsport.getRuns());    
        spt.setWickets(updatedsport.getWickets());
        spt.setCenturies(updatedsport.getCenturies());
        spt.setAverage(updatedsport.getAverage());
        spt.setImageUrl(updatedsport.getImageUrl());
        spt.setVideoUrl(updatedsport.getVideoUrl());
        return sportsrepo.save(spt);
    }
}
