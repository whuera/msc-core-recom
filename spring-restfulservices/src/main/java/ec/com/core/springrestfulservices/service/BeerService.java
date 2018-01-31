package ec.com.core.springrestfulservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.core.springrestfulservices.model.Beer;
import ec.com.core.springrestfulservices.repository.BeerRepository;

/**
 * The Class BeerService.
 */
@Service
public class BeerService{
	
	/** The beer repository. */
	@Autowired
	BeerRepository beerRepository;
	

	/**
	 * Gets the all beers.
	 *
	 * @return the all beers
	 */
	public List<Beer> getAllBeers() {
		
		return beerRepository.findAll();
		
	}

}