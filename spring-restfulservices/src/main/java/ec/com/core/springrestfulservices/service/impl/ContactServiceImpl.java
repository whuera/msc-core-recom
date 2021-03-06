package ec.com.core.springrestfulservices.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.core.springrestfulservices.model.Contact;
import ec.com.core.springrestfulservices.repository.ContactRepository;
import ec.com.core.springrestfulservices.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ContactServiceImpl.
 */
@Service
public class ContactServiceImpl implements ContactService {
	
	/** The contact repository. */
	@Autowired
	ContactRepository contactRepository;
	
	/* (non-Javadoc)
	 * @see ec.com.core.springrestfulservices.service.ContactService#getAllContacts()
	 */
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	/**
	 * Save contact.
	 *
	 * @param contact the contact
	 * @return the contact
	 */
	@Transactional
	public Contact saveContact(Contact contact){
		System.out.println("object contact "+contact.toString());
		return contactRepository.saveAndFlush(contact); }
	
	
	   /**
     * Method Search contact by Id
     * @param id
     * @return
     */
		public Contact getContactById (int id){
      //      logger.info("search contcat by id: "+id);
	            return contactRepository.findOne(id);
        }

}


