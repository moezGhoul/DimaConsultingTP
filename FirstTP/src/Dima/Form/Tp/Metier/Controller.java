package Dima.Form.Tp.Metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 
 */

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Dima.Form.Tp.Dao.Person;

public class Controller {
	
	private static Controller instance = new Controller();
	
	private Controller() {
		init();
	}
	
	public static Controller getInstance()
	{
		return instance;
	}
/**
 *  
 */
	public List<Person> listPerson;
/**
 * 
 * 
 */
	
/**
 * 
 * 
 */
	private void init() {
		listPerson = new ArrayList<Person>();
		addPersonList("zafri", "khalil");
		addPersonList("Entreprise", "Dimaconsulting");
		addPersonList("Formation", "java");
		addPersonList("nom", "prenom");
		addPersonList("hello", "world");
	}
	/**
	 * 
	 * 
	 */
	public void addPersonList(String nom, String prenom) {
		if (listPerson.isEmpty()) {
			Person p = new Person(nom, prenom, 0);
			listPerson.add(p);
		} else {
			int num = listPerson.size();
			Person p = new Person(nom, prenom, num++);
			listPerson.add(p);
		}
	}

	/**
	 * 
	 * 
	 */
	public List getPersonList() {
		return listPerson;
	}

	/**
	 * 
	 * 
	 */
	public void updatePersonList() {
		Person p;

		for (int i = 0; i < listPerson.size(); i++) {
			p = listPerson.get(i);
			p.setNumArrivée(i);
		}
	}

	/**
	 * 
	 * 
	 */
	public int deletePersonList(int num) {
		if (num > listPerson.size()) {
			System.out.println("Num entré est trop grand, refais à nouveau");
			return -1;
		} else {

			Person p;

			for (int i = 0; i < listPerson.size(); i++) {
				p = listPerson.get(i);
				if (p.getNumArrivée() == num)
					listPerson.remove(i);
			}

			return num;
		}
	}

	/**
	 * 
	 * 
	 */
	public void alphaOrder() {
		Collections.sort(listPerson);
		printPeople(listPerson);
	}

	/**
	 * 
	 * 
	 */
	public void printPeople(List<Person> person) {
		for (Person p : person) {
			System.out.println(p);
		}
	}

	/**
	 * 
	 * 
	 */
	public void numOrder() {
		
		Collections.sort(listPerson, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				if (o1.getNumArrivée() > o2.getNumArrivée()) {
					return 1;
				}
				return -1;
			}
		});
		printPeople(listPerson);
	}

	/**
	 * 
	 * 
	 */
	public void findOcc(String nom, String prenom) {
		Stream<Person> personsOver18 = listPerson.stream().filter(
				p -> nom.equals(p.getName()) || prenom.equals(p.getPrenom()));

		System.out.println(personsOver18.count());

	}

}
