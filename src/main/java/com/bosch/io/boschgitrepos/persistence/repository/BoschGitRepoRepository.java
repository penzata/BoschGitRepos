package com.bosch.io.boschgitrepos.persistence.repository;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoschGitRepoRepository extends JpaRepository<BoschGitRepo, Integer> {

    List<BoschGitRepo> findAll();
}
