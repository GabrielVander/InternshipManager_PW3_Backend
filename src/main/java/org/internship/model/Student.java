package org.internship.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Entity
public class Student extends User{
  @Id
  @GeneratedValue
  private long id;
  private String record;
  private String name;
  private Date birthday;
  private String cpf;
  private String rg;
  @OneToOne
  private CV cv;
  @OneToMany
  private List<Report> reports = new ArrayList<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRecord() {
    return record;
  }

  public void setRecord(String record) {
    this.record = record;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthdate) {
    this.birthday = birthdate;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public CV getCv() {
    return cv;
  }

  public void setCv(CV cv) {
    this.cv = cv;
  }

  public Iterator<Report> getReports() {
    return reports.iterator();
  }

  public void addReports(Report report) {
    this.reports.add(report);
  }
}
