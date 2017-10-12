package Dima.Form.Tp.Vue.command;

import Dima.Form.Tp.Dao.EnumTypeOrdre;
import Dima.Form.Tp.Metier.Controller;
import Dima.Form.Tp.Vue.Command;

public class ListerCommand implements Command {

	private EnumTypeOrdre enumOrdre;
	
	public ListerCommand(EnumTypeOrdre enumOrdre) {
		this.enumOrdre = enumOrdre;
	}
	
	@Override
	public void execute() {
		System.out.println("Liste en ordre "+enumOrdre+ " :");
		System.out.println("----------------------------------------------------------");
		switch (enumOrdre) {
		case NUM:
			Controller.getInstance().numOrder();
			break;
		case ALPHA:
			Controller.getInstance().alphaOrder();
			break;
		}
	}

}
