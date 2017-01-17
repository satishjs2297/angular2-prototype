/**
 * 
 */
package com.westat.navigator.user.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yandagudita_s
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/spring/localAdmin-applicationContext.xml" })
public class UserProfilesServiceTest {

	@Autowired
	private UserProfilesService userProfilesService;
	
	@Before
	public void setUp() {

	}

	@After
	public void tearDown() {

	}
	
	@Test
	public void testUserProfilesByUserName() throws Exception {

		String userName = "yandaguditas";
		
		assertNotNull(userProfilesService);
		System.out.println(userProfilesService.getUserProfiles(userName));
	}
	
}
