package ec.com.core.springrestfulservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Contact.
 */
@Entity
@Table (name="Contact")
@ToString
public class Contact {

    /** The id. */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter private int id;
    
    /** The first name. */
    @Column(length = 50) @Getter @Setter private String firstName;
    
    /** The middle name. */
    @Column(length = 50) @Getter @Setter private String middleName;
    
    /** The last name. */
    @Column(length = 50) @Getter @Setter private String lastName;
    
    /** The profession. */
    @Column(length = 50) @Getter @Setter private String profession;
    
    /** The email. */
    @Column(length = 50) @Getter @Setter private String email;
    
    /** The number document. */
    @Column(length = 20) @Getter @Setter private String numberDocument;
    
    /** The code person. */
    @Column(length = 20) @Getter @Setter private String codePerson;
    
    /** The status. */
    @Column(length = 10) @Getter @Setter private String status;
    
    /** The phone number. */
    @Column(length = 20) @Getter @Setter private String phoneNumber;

}
