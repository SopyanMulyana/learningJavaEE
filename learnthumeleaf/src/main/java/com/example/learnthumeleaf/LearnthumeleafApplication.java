package com.example.learnthumeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.learnthumeleaf.domain.Post;
import com.example.learnthumeleaf.domain.PostRepository;

@SpringBootApplication
public class LearnthumeleafApplication implements CommandLineRunner {

	@Autowired
	private PostRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(LearnthumeleafApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			repository.save(new Post("My post number #"+(i+1)));
		}
	}
}
