package com.smart.brain;

import com.smart.brain.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@SpringBootTest
class BrainApplicationTests {

	@Autowired
	EntityManager testEntityManager;

	@Test
	void contextLoads() {
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testAddEntries() {
		User user = new User("Babis");
		user.setEmail("babis@yahoo.gr");
		user.setJoined(LocalDateTime.now());
		testEntityManager.persist(user);
	}




}
