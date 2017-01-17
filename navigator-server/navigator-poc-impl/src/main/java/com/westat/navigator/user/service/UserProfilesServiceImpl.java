/**
 * 
 */
package com.westat.navigator.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westat.navigator.user.dao.repository.UserProfilesDAO;
import com.westat.navigator.user.model.UserProfiles;

/**
 * @author yandagudita_s
 *
 */
@Service
public class UserProfilesServiceImpl implements UserProfilesService {

	@Autowired
	private UserProfilesDAO userProfileDAO;

	public List<UserProfiles> getUserProfiles(String userName) throws Exception {

		return userProfileDAO.getUserProfilesByUserName(userName);
	}

	@Override
	public List<UserProfiles> getAllUserProfiles() throws Exception {
		return userProfileDAO.findAll();
	}

	@Override
	public void deleteUserProfile(Integer userId) throws Exception {
		userProfileDAO.delete(userId);
	}

	@Override
	public void presistUserProfile(UserProfiles userProfile) throws Exception {
		userProfileDAO.save(userProfile);
	}
}