package org.internship.controller;

import org.internship.DAO.SupervisorDAO;
import org.internship.model.Supervisor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupervisorController {
  private SupervisorDAO dao = new SupervisorDAO();

  @GetMapping("/supervisors")
  public List<Supervisor> all(){
    return (List<Supervisor>) dao.findAll();
  }

  @PostMapping("/supervisors")
  public Supervisor newSupervisor(@RequestBody Supervisor newSupervisor){
    return dao.save(newSupervisor);
    //TODO: Implement error handling
  }

  @GetMapping("/supervisors/{id}")
  Supervisor one(@PathVariable Long id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/supervisors/{id}")
  Supervisor editSupervisor(@RequestBody Supervisor supervisor, @PathVariable Long id) {
    supervisor.setId(id);
    return dao.edit(supervisor);
    //TODO: Implement error handling
  }

  @DeleteMapping("/supervisors/{id}")
  Boolean deleteSupervisor(@PathVariable Long id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
