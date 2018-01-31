package ec.com.core.springrestfulservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Beer.
 */
@Entity
@Table(name="Beer")
 public class Beer {
	
	/** The id. */
	@Id
	@GeneratedValue
	private int id;
	
	/** The name beer. */
	private String nameBeer;
	
	/** The presentation. */
	private String presentation;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name beer.
	 *
	 * @return the name beer
	 */
	public String getNameBeer() {
		return nameBeer;
	}

	/**
	 * Sets the name beer.
	 *
	 * @param nameBeer the new name beer
	 */
	public void setNameBeer(String nameBeer) {
		this.nameBeer = nameBeer;
	}

	/**
	 * Gets the presentation.
	 *
	 * @return the presentation
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * Sets the presentation.
	 *
	 * @param presentation the new presentation
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
}
