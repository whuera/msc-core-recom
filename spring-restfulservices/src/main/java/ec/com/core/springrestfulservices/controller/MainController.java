package ec.com.core.springrestfulservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.com.core.springrestfulservices.model.Beer;
import ec.com.core.springrestfulservices.model.Contact;
import ec.com.core.springrestfulservices.service.BeerService;
import ec.com.core.springrestfulservices.service.impl.ContactServiceImpl;

/**
 * The Class MainController.
 */
@RestController
@RequestMapping(path="/")
public class MainController {
	
	/** The beer service. */
	@Autowired
	BeerService beerService;
	
	/** The contact service impl. */
	@Autowired
	ContactServiceImpl contactServiceImpl;
	
	 /**
 	 * Gets the all beers.
 	 *
 	 * @return the all beers
 	 */
 	@RequestMapping(value="/getAllBeers", method = RequestMethod.GET)
		public ResponseEntity<List<Beer>> getAllBeers(){
	    	System.out.println("dentro de metodo ");
			return new ResponseEntity<List<Beer>>(beerService.getAllBeers(), HttpStatus.OK);

		}
	 
	 /**
 	 * Gets the all contacts.
 	 *
 	 * @return the all contacts
 	 */
 	@RequestMapping(value="/getAllContacts", method = RequestMethod.GET)
		public ResponseEntity<List<Contact>> getAllContacts(){
	    	System.out.println("dentro de metodo contacts ");
			return new ResponseEntity<List<Contact>>(contactServiceImpl.getAllContacts(), HttpStatus.OK);

		}
	 
	 /**
 	 * Save contact.
 	 *
 	 * @param contact the contact
 	 * @return the response entity
 	 */
 	@RequestMapping(value="/saveContact", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
			return new ResponseEntity<Contact>( contactServiceImpl.saveContact(contact),HttpStatus.CREATED);
		}


}
