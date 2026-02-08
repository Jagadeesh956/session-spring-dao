package com.self.learn.session.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface SessionRepository extends JpaRepository<Session, UUID> {


}
