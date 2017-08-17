package net.krasnovnikita.contactmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.krasnovnikita.contactmanager.dao.ContactDao;
import net.krasnovnikita.contactmanager.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

	@Transactional
	public void addContact(Contact contact) {
		contactDao.addContact(contact);
	}

	@Transactional
	public List<Contact> listContact() {
		return contactDao.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDao.removeContact(id);
	}

}
