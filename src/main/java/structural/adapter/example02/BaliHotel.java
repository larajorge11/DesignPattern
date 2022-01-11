package structural.adapter.example02;

import java.util.ArrayList;
import java.util.List;

public class BaliHotel {
  private List<Room> availableRooms = new ArrayList<>();

  public BaliHotel(){
    availableRooms.add(new Room(104));
    availableRooms.add(new Room(203));
    availableRooms.add(new Room(207));
    availableRooms.add(new Room(301));
    availableRooms.add(new Room(305));
    availableRooms.add(new Room(404));
  }

  public List<Room> getAvailableRooms() {
    return availableRooms;
  }

  public void bookRoom(int roomNumber) {
    Room roomBooked = availableRooms.stream()
        .filter(room -> room.getRoomNumber() == roomNumber)
        .findFirst()
        .orElse(null);

    if (roomBooked != null) {
      availableRooms.remove(roomBooked);
      System.out.println("roomNumber = " + roomNumber + " has been booked!");
    } else {
      System.out.println("Requested room not available");
    }
  }
}
