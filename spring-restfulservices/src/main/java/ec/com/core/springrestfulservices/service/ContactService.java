package ec.com.core.springrestfulservices.service;

import ec.com.core.springrestfulservices.model.Contact;

import java.util.List;

/**
 * The Interface ContactService.
 */
public interface ContactService {

    /**
     * Gets the all contacts.
     *
     * @return the all contacts
     */
    public List<Contact> getAllContacts();
}
