/**
 * 
 */
package com.westat.navigator.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.westat.navigator.user.model.UserProfiles;
import com.westat.navigator.user.service.UserProfilesService;

@RestController
@RequestMapping("/v1/userProfiles")
public class UserProfilesController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserProfilesController.class);

	@Autowired
	private UserProfilesService userProfilesSrv;
	
	@RequestMapping(value = "/{userName}")
	public List<UserProfiles> getUserProfiles(@PathVariable("userName") String userName) {
		
		List<UserProfiles> userProfiles = null;
		try {
			
			LOG.info("userName ::: {}", userName);
			userProfiles = userProfilesSrv.getUserProfiles(userName);
			
		} catch(Exception ex) {
			LOG.error("Exception @ getUserProfiles :: {}", ex.getMessage());
		}
		return userProfiles;
	}
	
	
	@RequestMapping(value = "/allUsers")
	public List<UserProfiles> allUserProfiles() {

		List<UserProfiles> userProfiles = null;
		try {
			userProfiles = userProfilesSrv.getAllUserProfiles();

		} catch (Exception ex) {
			LOG.error("Exception @ getUserProfiles :: {}", ex.getMessage());
		}
		return userProfiles;
	}
	
	
	@RequestMapping(value = "/deleteUser/{userId}")
	public boolean deleteUserProfile(@PathVariable("userId") String userId) {
		try {
			userProfilesSrv.deleteUserProfile(Integer.valueOf(userId));
			return true;
		} catch(Exception ex) {
			LOG.error("Exception @ deleteUserProfile", ex);
		}
		return false;
	}
	
	@RequestMapping(value = "/saveUser")
	public boolean saveUserProfile(@RequestBody UserProfiles userProfile) {
		try {
			LOG.info("saveUserProfile# userProfile ::", userProfile);
			userProfilesSrv.presistUserProfile(userProfile);
		} catch(Exception ex){
			LOG.error("Exception @ persistUserProfile", ex);
		}
		
		return false;
	}
	
	
	
}
