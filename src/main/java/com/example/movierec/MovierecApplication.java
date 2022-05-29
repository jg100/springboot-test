package com.example.movierec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovierecApplication {

	public static void main(String[] args) {

		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovie("Test");

		SpringApplication.run(MovierecApplication.class, args);
	}

}
