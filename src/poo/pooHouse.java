package poo;
import classOnes.House;

public class pooHouse {
    public static void main(String[] args) {
        // Adding house1 values
        House house1;
        house1 = new House();
        house1.setId(3456);
        house1.setCity("New York");
        house1.setAddress("Street 80");
        house1.setRooms(3);
        house1.setFloors(1);
        house1.setBaths(2);
        // Printing the values
        System.out.println("-------------------------");
        house1.showHouse();
        System.out.println("-------------------------");

    }
}

/*

from classOnes.House import House

def pooHouse():
    # Adding house1 values
    house1 = House()
    house1.id = 3456
    house1.city = "New York"
    house1.address = "Street 80"
    house1.rooms = 3
    house1.floors = 1
    house1.baths = 2
    # Printing the values
    print("-------------------------")
    house1.showHouse()
    print("-------------------------")

 */
