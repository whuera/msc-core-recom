package ec.com.core.springrestfulservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.core.springrestfulservices.model.Beer;

/**
 * The Interface BeerRepository.
 */
public interface BeerRepository extends JpaRepository<Beer, Long>{}

