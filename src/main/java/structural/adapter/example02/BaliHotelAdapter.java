package structural.adapter.example02;

import java.util.List;

public class BaliHotelAdapter implements HotelTarget {

  private final BaliHotel baliHotel;

  public BaliHotelAdapter(BaliHotel baliHotel) {
    this.baliHotel = baliHotel;
  }

  @Override
  public void printAvailableRooms() {
    List<Room> allAvailableRooms = baliHotel.getAvailableRooms();
    allAvailableRooms.forEach(room -> System.out.println(room.getRoomNumber()));
  }

  @Override
  public void bookByRoomNumber(int room) {
    baliHotel.bookRoom(room);
  }
}
