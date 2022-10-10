
package com.esprit.examen.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@ExtendWith(Mockito.class)
@SpringBootTest
@Slf4j
public class OperateurServiceImplTest {
	@Mock
	OperateurRepository operateurRepo;
	@InjectMocks
	OperateurServiceImpl operateurService;

	/*Operateur m = Operateur.builder().nom("aziz").prenom("fridhi").password("0000").build();
	List<Operateur> list = new ArrayList<Operateur>() {
		{
			add(Operateur.builder().nom("aziiz").prenom("friidhi").password("00000").build());
			add(Operateur.builder().nom("aziiiz").prenom("friiidhi").password("000000").build());
		}
	};*/

	@Test
	public void RetrieveAllOperateurTest()  {
	
			 
	    Mockito.when(operateurRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(m));
		Operateur operateur = operateurService.retrieveOperateur((long)2);
	    assertNotNull(operateur);
	    //L.("get==> " + operateur.toString());
	    
	}
}