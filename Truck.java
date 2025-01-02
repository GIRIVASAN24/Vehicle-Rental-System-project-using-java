class Truck extends Vehicle{
    public double dailyrate;
    public double mileage;
    public Truck(String id,double dailyrate,double mileage){
        super(id);
        this.dailyrate=dailyrate;
        this.mileage=mileage;
    }
    @Override
    public double getrentcost(int days){
        return days*dailyrate;
    }
    public double getmileage(){
        return mileage;
    }
}
