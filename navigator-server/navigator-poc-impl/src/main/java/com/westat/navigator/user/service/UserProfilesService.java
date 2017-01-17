/**
 * 
 */
package com.westat.navigator.user.service;

import java.util.List;

import com.westat.navigator.user.model.UserProfiles;

/**
 * @author yandagudita_s
 *
 */
public interface UserProfilesService {
	
	public List<UserProfiles> getUserProfiles(String userName) throws Exception;

	public List<UserProfiles> getAllUserProfiles() throws Exception;
	
	public void deleteUserProfile(Integer userId) throws Exception;
	
	public void presistUserProfile(UserProfiles userProfile) throws Exception;
}
