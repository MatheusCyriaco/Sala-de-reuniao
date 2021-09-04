package com.digital.innovation.room.salareuniao.repository;

import com.digital.innovation.room.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
