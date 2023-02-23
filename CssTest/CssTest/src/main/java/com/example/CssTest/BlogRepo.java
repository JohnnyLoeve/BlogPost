package com.example.CssTest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepo extends CrudRepository<BlogPost, Long> {

    List<BlogPost> findAllByOrderByIdDesc();


}
