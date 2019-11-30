package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator extends User {
  @Id
  @GeneratedValue
  public int id;

  public Administrator(String login, String password, String email) {
    this.setLogin(login);
    this.setPassword(password);
    this.setEmail(email);
  }

  public Administrator() {
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
