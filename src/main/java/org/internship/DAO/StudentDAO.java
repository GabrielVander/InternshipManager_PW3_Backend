package org.internship.DAO;

import org.internship.model.Student;

public class StudentDAO extends HibernateDao<Student> {
  public StudentDAO() {
    super(Student.class);
  }
}
