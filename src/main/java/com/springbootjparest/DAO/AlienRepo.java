package com.springbootjparest.DAO;

import com.springbootjparest.model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer> {

    List<Alien> findByZlang(String zlang);
    List<Alien> findByIdGreaterThan(int id);

    @Query(value = "from Alien where zlang=?1 order by name ")
    List<Alien> findByZlangSortedByName(String zlang);
}
