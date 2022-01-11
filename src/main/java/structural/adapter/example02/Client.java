package structural.adapter.example02;

public class Client {

  public static void main(String[] args) {
    BaliHotelAdapter baliHotel = new BaliHotelAdapter(new BaliHotel());
    baliHotel.printAvailableRooms();
    baliHotel.bookByRoomNumber(203);

    CancunHotelAdapter cancunHotel = new CancunHotelAdapter(new CancunHotel());
    cancunHotel.printAvailableRooms();
    cancunHotel.bookByRoomNumber(763);
  }
}
