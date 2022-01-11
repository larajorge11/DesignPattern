package structural.adapter.example02;

import java.util.List;

public class CancunHotelAdapter implements HotelTarget {

  private final CancunHotel cancunHotel;

  public CancunHotelAdapter(CancunHotel cancunHotel) {
    this.cancunHotel = cancunHotel;
  }

  @Override
  public void printAvailableRooms() {
    List<Room> allAvailableRooms = cancunHotel.obtenerHabitaciones();
    allAvailableRooms.forEach(room -> System.out.println(room.getRoomNumber()));
  }

  @Override
  public void bookByRoomNumber(int room) {
    cancunHotel.reservarHabitacion(room);
  }
}
