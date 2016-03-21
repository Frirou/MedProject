package tn.esprit.authentification;

import javax.ejb.Remote;

import tn.esprit.entities.Admin;

@Remote
public interface authentificationRemote {
Admin authentificate (String login, String pwd);
}
