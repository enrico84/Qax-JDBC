package it.capone.service;

import it.capone.bean.CategoriaBean;
import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.bean.ListaRisposteBean;
import it.capone.bean.LoginBean;
import it.capone.dao.DomandaDAO;

public class CGestioneDomande {
	
	static DomandaDAO domandaDAO = new DomandaDAO();
	
	public CGestioneDomande() {
		
	}
	   
	
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande){
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaDAO.getDomande(listaDomande);
		return listaDomande;
	}
	
	
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaDAO.getDomande(listaDomande, categoria);
		return listaDomande;
	}
	
	
	public DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaDAO.getDomandaConRisposte(id, domanda, listaRisposta);
		return domanda;
	}
	
	
	public ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaDAO.getMieDomande(username, password, myListaDomande);
		return myListaDomande;
		
	}
	
	
	public void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente) {
		domandaDAO.creaDomanda(titolo, descrizione, categoria, utente);	
	}
	
	
	public void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria, LoginBean utente) {
		domandaDAO.creaDomanda(domanda, titolo, descrizione, categoria, utente);
	}
	
	
	public void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione, 
			                       String categoria) {
		domandaDAO.aggiornaDomanda(categoriaBean, iddomanda, titolo, descrizione, categoria);
		
	}
	
	
	public void eliminaDomanda(int idDomanda) {
		domandaDAO.eliminaDomanda(idDomanda);
	}
	
	
	public LoginBean prendiUtente(int id) {
		LoginBean utente = DomandaDAO.prendiUtente(id);
		
		return utente;
	}
	
	
	public DomandaBean prendiDomanda(int iddomanda) {
		DomandaBean domanda = domandaDAO.prendiDomanda(iddomanda);
	
		return domanda;	
	}
	
	

}
