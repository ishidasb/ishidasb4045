package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimen
 *
 */
public interface ISpecimenService {

	/**
	 * Get specimen from persistence layer
	 *@param id a unique lookup
	 *@return a specimen with matching id
	 *
	 */
	
	SpecimenDTO fetchbyID(int id);
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);
	

}