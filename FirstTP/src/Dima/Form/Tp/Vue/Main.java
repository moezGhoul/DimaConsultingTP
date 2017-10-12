package Dima.Form.Tp.Vue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

import Dima.Form.Tp.Dao.EnumTypeCommand;
import Dima.Form.Tp.Dao.EnumTypeCommand;
import Dima.Form.Tp.Dao.Person;
import Dima.Form.Tp.Dao.Person;
import Dima.Form.Tp.Vue.command.AjouterCommand;
import Dima.Form.Tp.Vue.command.SupprimerCommand;

public class Main {
	public void fly(int...args) { } 
	
	
	public static void main(String[] args) {

		new Main().fly( 1, 2, 3  ); 
		
		
		// Controller control = new Controller();
		// Switcher switcher = new Switcher();
		//
		// switcher.addCaseCommand("ajouter", new AjouterCommand());
		// switcher.addCaseCommand("Supprimer", new SupprimerCommand());
		//
		// switcher.addCaseCommand("ListerAlpha", new Command() {
		// @Override
		// public void execute() {
		// System.out.println("Liste en ordre Alpha :");
		// System.out
		// .println("----------------------------------------------------------");
		// control.alphaOrder();
		// }
		// });
		//
		// switcher.addCaseCommand("ListerNumArr", new Command() {
		// @Override
		// public void execute() {
		// System.out.println("Liste triee selon le numero d'arrivé :");
		// System.out
		// .println("----------------------------------------------------------");
		// control.afficher();
		// }
		// });
		//
		// switcher.addCaseCommand("FindNumOcc", new Command() {
		// @Override
		// public void execute() {
		// System.out.println("Rentrez  nom . prenom :");
		// System.out
		// .println("----------------------------------------------------------");
		// Scanner lectureClavier = new Scanner(System.in);
		// String nom = lectureClavier.nextLine();
		// String prenom = lectureClavier.nextLine();
		// control.findOcc(nom, prenom);
		// }
		// });
		//
		// switcher.addCaseCommand("Exit", new Command() {
		// @Override
		// public void execute() {
		// System.exit(0);
		// }
		// });
		//
		//
		// switcher.on("init");
		// System.out.println("Saisir ta commande :");

		while (true) {

			Scanner lectureClavier = new Scanner(System.in);
			String commande = lectureClavier.nextLine();

			try {
				EnumTypeCommand enumTypeCommand = EnumTypeCommand
						.valueOf(commande);
				enumTypeCommand.execute();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}

			// switch (commande) {
			// case "ajouter":
			// switcher.on("ajouter");
			// System.out.println("Saisir ta commande :");
			// break;
			// case "ListerAlpha":
			// switcher.on("ListerAlpha");
			// System.out.println("Saisir ta commande :");
			// break;
			// case "ListerNumArr":
			// switcher.on("ListerNumArr");
			// System.out.println("Saisir ta commande :");
			// break;
			// case "Supprimer":
			//
			// switcher.on("Supprimer");
			// System.out.println("Saisir ta commande :");
			// break;
			// case "FindNumOcc":
			// switcher.on("FindNumOcc");
			// System.out.println("Saisir ta commande :");
			// break;
			// case "Exit":
			// System.exit(0);
			// break;
			// default:
			// switcher.setDefaultCaseCommand(new DoNothingCommand());
			// break;
			// }

		}

	}
}
