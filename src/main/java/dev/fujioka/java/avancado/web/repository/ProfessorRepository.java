package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
