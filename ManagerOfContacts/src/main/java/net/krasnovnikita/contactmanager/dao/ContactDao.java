package net.krasnovnikita.contactmanager.dao;

import java.util.List;

import net.krasnovnikita.contactmanager.domain.Contact;

public interface ContactDao {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);

}
