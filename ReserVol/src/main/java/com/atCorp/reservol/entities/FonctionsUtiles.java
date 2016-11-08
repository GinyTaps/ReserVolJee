package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Calendar;


public class FonctionsUtiles implements Serializable {

	public String matriculealea(Client cli) {
		String symb, mat = null;
		symb = cli.getNomClient().substring(1).concat(cli.getPrenomClient().substring(1));
		Calendar annee = Calendar.getInstance();
		int an = annee.get(Calendar.YEAR);
		symb = symb.concat(String.valueOf(an));
		/*if(listReservation().isEmpty()){
			symb = symb.concat("0");
		}
		else{
			mat = (listReservation().get(listReservation().size())).getMatricule();
			int cp = Integer.parseInt(mat.substring(6, 7))+1;
			symb = symb.concat(String.valueOf(cp));
		}*/
		
	    return symb;
	  }
}
