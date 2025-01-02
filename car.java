class Car extends Vehicle{
    public double dailyrate;
    public double mileage;
    public Car(String id,double dailyrate,double mileage){
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
