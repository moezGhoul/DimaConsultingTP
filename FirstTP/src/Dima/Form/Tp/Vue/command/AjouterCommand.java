package Dima.Form.Tp.Vue.command;

import java.util.Scanner;

import Dima.Form.Tp.Metier.Controller;
import Dima.Form.Tp.Vue.Command;

public class AjouterCommand implements Command {

	public AjouterCommand() {
	}

	@Override
	public void execute() {
		Controller control = Controller.getInstance();
		System.out.println("Rentrez le nom et prenom d'une personne :");
		System.out
				.println("----------------------------------------------------------");
		Scanner lectureClavier = new Scanner(System.in);
		String nom = lectureClavier.nextLine();
		String prenom = lectureClavier.nextLine();
		if (nom.matches("[a-zA-Z]*") && prenom.matches("[a-zA-Z]*")) {
			control.addPersonList(nom, prenom);
		} else {
			System.out.println("Erreur de saisie, refais à nouveau:");
		}
	}
}
