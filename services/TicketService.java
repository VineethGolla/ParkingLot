package ParkingLot.services;

import ParkingLot.models.Ticket;
import ParkingLot.models.enums.VehicleType;

public class TicketService {
    public Ticket issueTicket(VehicleType vehicleType, String vehicleNo, String OwnerName, Long GateId) {
        //contain business logic for generating the ticket
        Ticket ticket = new Ticket();
        ticket.setEntryTime(System.currentTimeMillis());  //epoch


    }
}
