package com.project.hotel_management.services.admin.rooms;

import org.springframework.stereotype.Service;
import com.project.hotel_management.dto.RoomDto;
import com.project.hotel_management.entity.Room;
import com.project.hotel_management.repository.RoomRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomsServiceImpl implements RoomsService {

    private final RoomRepository roomRepository;

    @Override
    public boolean postRoom(RoomDto roomDto) {
        try {
            Room room = new Room();
            
            room.setName(roomDto.getName());
            room.setPrice(roomDto.getPrice());
            room.setType(roomDto.getType());
            room.setAvailable(true);

            roomRepository.save(room);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}