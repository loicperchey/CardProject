package com.example.CardProjectSpring;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.repository.FleshAndBloodCardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Year;

@SpringBootTest
class CardProjectSpringApplicationTests {

	@Autowired
	private FleshAndBloodCardRepository fleshAndBloodCardRepository;


	@Test
	void contextLoads() {
	}

}
