package com.project.hotel_management.services.admin.rooms;

import com.project.hotel_management.dto.RoomDto;
import com.project.hotel_management.dto.RoomsResponseDto;

public interface RoomsService {
	boolean postRoom(RoomDto roomDto);
	RoomsResponseDto getAllRooms(int pageNumber);
	RoomDto getRoomById(Long id);
}
