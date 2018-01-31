package ec.com.core.springrestfulservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.core.springrestfulservices.model.Contact;

/**
 * The Interface ContactRepository.
 */
public interface ContactRepository extends JpaRepository<Contact, Long>{}