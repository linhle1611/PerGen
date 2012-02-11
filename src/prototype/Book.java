/************************************************
 * This file was generated by ....
 ************************************************/

package prototype;

import java.util.ArrayList;

/**
 * The Book object.
 */
public class Book {

    /**
     * The Id of the object.
     */
    private Integer id = null;

    /**
     * The title field.
     */
    private String title = null;

    /**
     * The price field.
     */
    private Double price = null;

    /**
     * The year field.
     */
    private Integer year = null;

    /**
     * Id of a Section object.
     */
    private Integer sectionId = null;

    /**
     * A list of Ids on Author objects.
     */
    private ArrayList<Integer> authorList = null;

    /**
     * Create a new Book.
     */
    public Book() {
        authorList = new ArrayList<Integer>();
    }

    /**
     * Id getter.
     * @return The Id of the object.
     */
    public final Integer getId() {
        return id;
    }

    /**
     * Id setter.
     * @param newId The new Id value.
     */
    public final void setId(final Integer newId) {
        id = newId;
    }

    /**
     * The price field getter.
     * @return The price field value.
     */
    public final Double getPrice() {
        return price;
    }

    /**
     * The price field setter.
     * @param newPrice The new price value.
     */
    public final void setPrice(final Double newPrice) {
        price = newPrice;
    }

    /**
     * The title field getter.
     * @return The title field value.
     */
    public final String getTitle() {
        return title;
    }

    /**
     * The title field setter.
     * @param newTitle The new title value.
     */
    public final void setTitle(final String newTitle) {
        title = newTitle;
    }

    /**
     * The year field getter.
     * @return The year field value.
     */
    public final Integer getYear() {
        return year;
    }

    /**
     * The year field setter.
     * @param newYear The new year value.
     */
    public final void setYear(final Integer newYear) {
        year = newYear;
    }

    /**
     * The Id of a Section object getter.
     * @return The Id of a Section.
     */
    public final Integer getSectionId() {
        return sectionId;
    }

    /**
     * The Id of a Section object setter.
     * @param newSectionId The new Id of a Section.
     */
    public final void setSectionId(final Integer newSectionId) {
        sectionId = newSectionId;
    }

    /**
     * Add a Author Id.
     * @param authorId The Id of the Author to add.
     */
    public final void addAuthor(final Integer authorId) {
        authorList.add(authorId);
    }

    /**
     * Remove a Author Id.
     * @param authorId The Id of the Author to remove.
     */
    public final void removeAuthor(final Integer authorId) {
        authorList.remove(authorId);
    }

    /**
     * Get a list of Author Ids.
     * @return A list of Author Ids.
     */
    public final ArrayList<Integer> getAuthorList() {
        return authorList;
    }
}