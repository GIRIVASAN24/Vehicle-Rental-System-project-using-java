import java.util.*;
public class VehicleManagementSystem {
    public static void main(String[] args) {
        VehicleRentalSystem rental=new VehicleRentalSystem();
        Vehicle car=new Car("C007",50,25);
        Vehicle truck=new Truck("T001",100,10);
        Vehicle bike=new Bike("B003",30,70);
        rental.addVehicle(car); 
        rental.addVehicle(bike);
        rental.addVehicle(truck);
        Scanner d=new Scanner(System.in);
        while(true){
            System.out.println("Vehicle rental system options : ");
            System.out.println("1.Display Available vehicles");
            System.out.println("2.Rent a Vehicle");
            System.out.println("3.Return a Vehicle");
            System.out.println("4.Search Vehicle by Mileage");
            System.out.println("5.Calculate total Earnings");
            System.out.println("6.Exit");
            System.out.print("Enter the choice : ");
            int choice=d.nextInt();
            switch (choice)
            {
                case(1):
                    rental.displayAvailableVehicles();
                    break;
                case 2:
                    System.out.print("Enter the vehicle Id to rent : ");
                    String id = d.next();
                    System.out.print("Enter the Number of days : ");
                    int days = d.nextInt();
                    rental.rentalvehicles(id, days);
                    break;
                case 3:
                    System.out.print("Enter the vehicle Id to retrun : ");
                    String vehicleId = d.next();
                    rental.returnvehicle(vehicleId);
                    break;
                case 4:
                    System.out.print("Enter minimum mileage : ");
                    double minMileage=d.nextDouble();
                    System.out.print("Enter maximum mileage : ");
                    double maxMileage=d.nextDouble();
                    rental.searchbymileage(minMileage, maxMileage);
                    break;
                case(5):
                    rental.calculatetotalearnings();
                    break;
                case(6):
                    System.out.println("Thanks for Renting Vehicle!!!!!!!!!");
                    return;
                default:
                    System.out.println("Enter the valid choice:");
            }
        }
    }
}
