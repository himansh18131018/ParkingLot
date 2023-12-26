package com.parkingLot.ParkingLot.repository;

import com.parkingLot.ParkingLot.model.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {
    ParkingLot findByName(String name);
}
