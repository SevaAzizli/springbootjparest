package com.springbootjparest.DAO;

import com.springbootjparest.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien,Integer> {
}
