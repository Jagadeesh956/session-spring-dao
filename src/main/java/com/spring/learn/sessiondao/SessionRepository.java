package com.spring.learn.sessiondao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface SessionRepository extends JpaRepository<Session, UUID> {
    @Transactional
     @Modifying
     @Query("update Session s set s.Status='INACTIVE' where s.sessionId=:id")
   void updateStatus(@Param("id") UUID id);

    Long l = System.currentTimeMillis();
    @Transactional
    @Modifying
    @Query("update Session s set s.LastActive=:time")
    void updateTime(@Param("id") UUID id, @Param("time") Long time);
    @Query(value = "select * from Session s where s.user_id=:id",nativeQuery = true)
    List<Session> userSessions(@Param("id") long Id);
}


