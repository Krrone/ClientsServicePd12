package com.example.clientsservicepd12;

import com.example.clientsservicepd12.models.Account;
import com.example.clientsservicepd12.models.Client;
import com.example.clientsservicepd12.models.Phone;
import com.example.clientsservicepd12.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static com.example.clientsservicepd12.models.Client.*;
import static com.example.clientsservicepd12.models.Client.Gender.*;

@SpringBootApplication
public class ClientsServicePd12Application {
	public static void main(String[] args) {
		SpringApplication.run(ClientsServicePd12Application.class, args);
	}

	@Autowired
	private ClientRepository clientRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void applicationReady() {
		/*Client client = new Client(0, "a", "a","a",
			LocalDate.now(), FEMALE, "e111",null, null);
		client = clientRepository.save(client);
		System.err.println(client);
		client.setSurname("A");
		clientRepository.save(client);
		clientRepository.delete(client);
		System.err.println();
		clientRepository.findAll().forEach(System.err::println);*/
		System.out.println("dz 1");
		Phone phone = new Phone(0l, "0234324554", new Client(0, "a", "a","a",
				LocalDate.now(), FEMALE, "e111",null, null));
		Account account = new Account(0l, 100, new Set<Client>() {
			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public boolean contains(Object o) {
				return false;
			}

			@Override
			public Iterator<Client> iterator() {
				return null;
			}

			@Override
			public Object[] toArray() {
				return new Object[0];
			}

			@Override
			public <T> T[] toArray(T[] a) {
				return null;
			}

			@Override
			public boolean add(Client client) {
				return false;
			}

			@Override
			public boolean remove(Object o) {
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Client> c) {
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				return false;
			}

			@Override
			public void clear() {

			}
		});
	}
}
