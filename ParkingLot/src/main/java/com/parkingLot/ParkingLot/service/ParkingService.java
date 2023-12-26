package com.parkingLot.ParkingLot.service;

import com.parkingLot.ParkingLot.model.ParkingSpot;
import com.parkingLot.ParkingLot.model.Vehicle;

import java.util.List;

public interface ParkingService {
    void initializeParkingLot(String name, int r, int c);

    void parkVehicle(Vehicle vehicle, String parkingLotName);

    void removeVehicle(String vehicleId, String parkingLotName);

    ParkingSpot findSpotById(String spotId, String parkingLotName);

    List<ParkingSpot> getOpenSpots(String parkingLotName);
}
