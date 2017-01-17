/**
 * 
 */
package com.westat.navigator.user.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.westat.navigator.user.model.UserProfiles;

/**
 * @author yandagudita_s
 *
 */
public interface UserProfilesDAO extends JpaRepository<UserProfiles, Integer>{

	
	public List<UserProfiles> getUserProfilesByUserName(String userName);
	
}
