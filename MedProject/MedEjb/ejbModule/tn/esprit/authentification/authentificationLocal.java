package tn.esprit.authentification;

import javax.ejb.Local;

import tn.esprit.entities.Admin;

@Local
public interface authentificationLocal {
	Admin authentificate (String login, String pwd);
}
