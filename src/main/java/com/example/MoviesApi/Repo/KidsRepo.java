package com.example.MoviesApi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MoviesApi.Entity.Kids;

public interface KidsRepo extends JpaRepository <Kids , Long> {

}
