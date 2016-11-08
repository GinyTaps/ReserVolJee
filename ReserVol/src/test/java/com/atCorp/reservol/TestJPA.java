package com.atCorp.reservol;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atCorp.reservol.entities.Utilisateur;
import com.atCorp.reservol.metier.IAdministrateurMetier;


public class TestJPA {

	ClassPathXmlApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}

	@Test
	public void test() {
		try{
			IAdministrateurMetier metier = (IAdministrateurMetier) context.getBean("metier");
			List<Utilisateur> utils1 = metier.listUtilisateurs();
			metier.ajouterUtilisateur(new Utilisateur("armya", "armya2016", "Tapsoba", "Army", "", new Date(2015-01-07)));
			List<Utilisateur> utils2 = metier.listUtilisateurs();
			assertTrue(utils1.size()+1==utils2.size());
			//assertTrue(true);
		}

	catch(Exception e){
           
		assertTrue(e.getMessage(),false);
       }
	}

}
