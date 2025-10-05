package ParkingLot.models;

import ParkingLot.models.enums.VehicleType;

public class Vehicle extends BaseModel {
    private String no;
    private Owner owner;
    private VehicleType vehicleType;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
