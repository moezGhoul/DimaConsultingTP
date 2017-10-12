package Dima.Form.Tp.Vue.command;

import java.util.Scanner;

import Dima.Form.Tp.Metier.Controller;
import Dima.Form.Tp.Vue.Command;

public class SupprimerCommand implements Command {

	public SupprimerCommand() {
	}

	@Override
	public void execute() {
		Controller control = Controller.getInstance();
		System.out
				.println("Rentrez le numéro d'arrivé d'une personne pour la supprimer :");
		System.out
				.println("------------------------------------------------------------------");
		Scanner lectureClavier = new Scanner(System.in);
		String numStr = lectureClavier.nextLine();

		if (numStr.matches("[+-]?\\d*(\\.\\d+)?")) {
			int num = Integer.parseInt(numStr);
			control.deletePersonList(num);
			control.updatePersonList();
		} else {
			System.out.println("Erreur de saisie, refais à nouveau:");
		}
	}

}
