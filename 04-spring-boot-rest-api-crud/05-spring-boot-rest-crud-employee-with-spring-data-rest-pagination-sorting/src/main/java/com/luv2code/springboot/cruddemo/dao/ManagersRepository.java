package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Managers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "managers", path = "managers")
public interface ManagersRepository extends JpaRepository<Managers, Integer> {

    // that's it ... no need to write any code LOL!

}
