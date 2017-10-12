package Dima.Form.Tp.Vue;

import Dima.Form.Tp.Metier.Controller;

public class DoNothingCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Saisir ta commande :");
	}

}
