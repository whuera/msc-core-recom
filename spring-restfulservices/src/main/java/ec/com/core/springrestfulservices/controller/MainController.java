package ec.com.core.springrestfulservices.controller;

import java.util.List;

import ec.com.core.springrestfulservices.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.com.core.springrestfulservices.model.Beer;
import ec.com.core.springrestfulservices.model.Contact;
import ec.com.core.springrestfulservices.service.BeerService;
import ec.com.core.springrestfulservices.service.impl.ContactServiceImpl;

import javax.validation.Valid;

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
	@Autowired
	ContactRepository contactRepository;
	
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
	 @CrossOrigin(origins = "http://localhost:4200")
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
	 @CrossOrigin(origins = "http://localhost:4200")
     @RequestMapping(value="/saveContact", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
			return new ResponseEntity<Contact>( contactServiceImpl.saveContact(contact),HttpStatus.CREATED);
		}


    /**
     * Method controller serach contact object by id
     * @param idContact : long
     * @return
     */
    @RequestMapping(value="/getContactById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Contact> getContactById(@PathVariable(value = "id") int idContact) {
        Contact contact = contactServiceImpl.getContactById(idContact);
        if(contact == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(contact);
    }

	/**
	 * Method for update contact object
	 * @param idContact
	 * @param contact
	 * @return
	 */

	//@RequestMapping(value="/{id}/updateContact", method = RequestMethod.PUT)
	@PutMapping("/updateContact/{id}")
	public ResponseEntity<Contact> updateContact(@PathVariable(value = "id") int idContact,
										   @Valid @RequestBody Contact contact) {
		ec.com.core.springrestfulservices.model.Contact contactInMem = contactRepository.findOne(idContact);
		if(contactInMem == null) {
			return ResponseEntity.notFound().build();
		}
		else{			
			contactInMem = contact;
		}
		return ResponseEntity.ok(contactServiceImpl.saveContact(contactInMem));
	}

}
