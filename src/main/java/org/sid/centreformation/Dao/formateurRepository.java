package org.sid.centreformation.Dao;

import org.sid.centreformation.entities.formateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface formateurRepository extends JpaRepository<formateur,Long> {


}

