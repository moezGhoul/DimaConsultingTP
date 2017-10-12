package Dima.Form.Tp.Dao;

public class Person implements Comparable<Person> {
	private String name;
	private String prenom;
	private int numArriv�e;

	public Person(String name, String prenom, int numArriv�e) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.numArriv�e = numArriv�e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumArriv�e() {
		return numArriv�e;
	}

	public void setNumArriv�e(int numArriv�e) {
		this.numArriv�e = numArriv�e;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numArriv�e;
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numArriv�e != other.numArriv�e)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person: " + this.getName() + " " + this.getPrenom() + " "
				+ this.getNumArriv�e();
	}

	@Override
	public int compareTo(Person o) {
		if (o == null)
			return 1;
		int result = this.getName().compareTo(o.getName());
		if (result == 0)
			result = this.getPrenom().compareTo(o.getPrenom());
		return result;
	}

}
