package com.project.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.hotel_management.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
