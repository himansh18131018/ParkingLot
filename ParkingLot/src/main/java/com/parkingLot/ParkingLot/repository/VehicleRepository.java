package com.parkingLot.ParkingLot.repository;

import com.parkingLot.ParkingLot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
