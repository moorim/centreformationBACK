package org.sid.centreformation.Dao;

import org.sid.centreformation.entities.participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface participantRepository extends JpaRepository<participant,Long> {
}
