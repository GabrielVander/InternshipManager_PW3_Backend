package org.internship.DAO;

import org.internship.model.Internship;

public class InternshipDAO extends HibernateDao<Internship> {
  public InternshipDAO() {
    super(Internship.class);
  }
}
