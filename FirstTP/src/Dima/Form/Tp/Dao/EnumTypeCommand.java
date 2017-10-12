package Dima.Form.Tp.Dao;

import Dima.Form.Tp.Vue.Command;
import Dima.Form.Tp.Vue.command.AjouterCommand;
import Dima.Form.Tp.Vue.command.ListerCommand;
import Dima.Form.Tp.Vue.command.SupprimerCommand;

public enum EnumTypeCommand {

	AJOUTER("Ajouter", new AjouterCommand()), //
	SUPPRIMER("Supprimer", new SupprimerCommand()), //
	LISTER_ALPHA("Lister Alpha", new ListerCommand(EnumTypeOrdre.ALPHA)), //
	LISTER_NUMARR("Lister NumArr", new ListerCommand(EnumTypeOrdre.NUM));

	private String libelle;
	private Command command;

	private EnumTypeCommand(String libelle, Command commande) {
		this.libelle = libelle;
		this.command = commande;
	}

	public String getLibelle() {
		return libelle;
<<<<<<< HEAD
		hjhjhj
=======
		//hjhjhj
>>>>>>> 277cd85... comment
	}

	public Command getCommand() {
		return command;
	}

	public void execute() {
		this.command.execute();
	}
}
