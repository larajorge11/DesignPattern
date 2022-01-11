package structural.adapter.example02;

public class Client {

  public static void main(String[] args) {
    HotelTarget baliHotel = new BaliHotelAdapter(new BaliHotel());
    baliHotel.printAvailableRooms();
    baliHotel.bookByRoomNumber(203);

    HotelTarget cancunHotel = new CancunHotelAdapter(new CancunHotel());
    cancunHotel.printAvailableRooms();
    cancunHotel.bookByRoomNumber(763);
  }
}
