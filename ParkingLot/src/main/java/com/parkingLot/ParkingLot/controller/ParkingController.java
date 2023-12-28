package com.parkingLot.ParkingLot.controller;

import com.parkingLot.ParkingLot.model.ParkingSpot;
import com.parkingLot.ParkingLot.model.Vehicle;
import com.parkingLot.ParkingLot.repository.VehicleRepository;
import com.parkingLot.ParkingLot.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public ParkingController(ParkingService parkingService, VehicleRepository vehicleRepository) {
        this.parkingService = parkingService;
        this.vehicleRepository = vehicleRepository;
    }

    @PostMapping("/initialize")
    public ResponseEntity<String> initializeParkingLot(@RequestParam String name,
                                                       @RequestParam int r,
                                                       @RequestParam int c) {
        parkingService.initializeParkingLot(name,r,c);
        return ResponseEntity.ok("Parking Lot initialized successfully");
    }

    @PostMapping("/park")
    public ResponseEntity<String> parkVehicle(@RequestBody Vehicle vehicle,
                                              @RequestParam String parkingLotName) {
        vehicleRepository.save(vehicle);
        parkingService.parkVehicle(vehicle, parkingLotName);
        return ResponseEntity.ok("Vehicle parked successfully");
    }

    @DeleteMapping ("/removeVehicle")
    public ResponseEntity<String> removeVehicle(@RequestParam String vehicleId,
                                              @RequestParam String parkingLotName) {
        parkingService.removeVehicle(vehicleId, parkingLotName);
//      vehicleRepository.save(vehicle);
        return ResponseEntity.ok("Vehicle removed successfully");
    }

    @GetMapping("/open-spots")
    public ResponseEntity<List<ParkingSpot>> getOpenSpots(@RequestParam String parkingLotName, @RequestParam boolean occupiedSpot) {
        List<ParkingSpot> openSpots = parkingService.getOpenSpots(parkingLotName, occupiedSpot);
        return ResponseEntity.ok(openSpots);
    }
}
