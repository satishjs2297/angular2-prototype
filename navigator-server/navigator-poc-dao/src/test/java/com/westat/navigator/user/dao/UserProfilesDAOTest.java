/**
 * 
 */
package com.westat.navigator.user.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.westat.navigator.user.dao.repository.UserProfilesDAO;
import com.westat.navigator.user.model.UserProfiles;

/**
 * @author yandagudita_s
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/spring/localAdmin-daoJpaConfig.xml",
		"classpath:localAdmin-daoJpaConfig-test.xml"		
})
public class UserProfilesDAOTest {
	
	@Autowired
	private UserProfilesDAO userProfilesDAO;
	
	private String userName;

	@Before
	public void setUp() {
		
		userName = "yandaguditas";
	}
	
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testGetUserProfilesByUserName() {
		
		String expFirstName = "Veerraju";
		
		assertNotNull(userProfilesDAO);
		List<UserProfiles> userProfilesList = userProfilesDAO.getUserProfilesByUserName(userName);
		assertFalse(userProfilesList.isEmpty());
		
		assertEquals(expFirstName, userProfilesList.get(0).getFirstName());
		
	}

}
