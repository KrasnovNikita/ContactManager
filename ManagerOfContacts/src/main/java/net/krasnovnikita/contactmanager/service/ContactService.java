package net.krasnovnikita.contactmanager.service;

import java.util.List;

import net.krasnovnikita.contactmanager.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
