package structural.adapter.example02;

public class Room {

  private int roomNumber;
  private String description;

  public Room(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Room{" +
        "roomNumber=" + roomNumber +
        ", description='" + description + '\'' +
        '}';
  }
}
