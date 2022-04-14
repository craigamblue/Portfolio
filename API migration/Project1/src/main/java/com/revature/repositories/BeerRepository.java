package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Beer;
import com.revature.models.User;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Integer> {




}
