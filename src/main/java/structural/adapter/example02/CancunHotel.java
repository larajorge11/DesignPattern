package structural.adapter.example02;

import java.util.ArrayList;
import java.util.List;

public class CancunHotel {
  private List<Room> availableRooms = new ArrayList<>();

  public CancunHotel(){
    availableRooms.add(new Room(540));
    availableRooms.add(new Room(235));
    availableRooms.add(new Room(456));
    availableRooms.add(new Room(763));
    availableRooms.add(new Room(128));
    availableRooms.add(new Room(709));
  }

  public List<Room> obtenerHabitaciones() {
    return availableRooms;
  }

  public void reservarHabitacion(int roomNumber) {
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
