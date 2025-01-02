import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<Vehicle> invent;
    public VehicleRentalSystem(){
        this.invent=new ArrayList<>();
    }
    public void addVehicle(Vehicle v1){
        invent.add(v1);
    } 
    public void displayAvailableVehicles(){
        System.out.println("Available Vehicles : ");
        for(Vehicle i:invent){
            if(i.isAvailable()){
                System.out.println("Id : "+i.getId()+" Mileage : "+i.getmileage());
            }
        }
    }
    public void rentalvehicles(String id,int days){
        for(Vehicle i:invent){
            if(i.getId().equals(id)&&i.isAvailable()){
                i.setAvailable(false);
                System.out.println("Vehicle : "+id+" rented for : "+days+" days "+"Total cost : "+i.getrentcost(days));
                return;
            }
        }
        System.out.println("Vehicle not available or not found");

    }
    public void returnvehicle(String id){
        for(Vehicle i:invent){
            if(i.getId().equals(id)&&i.isAvailable()){
                i.setAvailable(true);
                System.out.println("Vehicle : "+id+" returned.");
                return;
            }
        }
        System.out.println("Vehicle not found or returned.");
    }
    public void searchbymileage(double minmileage,double maxmileage){
        for(Vehicle i:invent){
            if(i.getmileage()>=minmileage && i.getmileage()<=maxmileage){
                System.out.println("Id: "+i.getId()+", Mileage: "+i.getmileage());
            }
        }
    }
    public void calculatetotalearnings(){
        double totalearnings=0;
        for(Vehicle i:invent){
            if(!i.isAvailable()) {
    			totalearnings+=i.getrentcost(1);
    		}
    	}
    	System.out.println("Total Earnings: $"+totalearnings);
	}

}

