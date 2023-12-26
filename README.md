# ParkingLot
Parking Lot Using Java in Spring Boot Framework

## API Endpoints

* POST http://localhost:8080/parking/initialize?name={name}&r={rows}&c={columns} initializes a new Parking Lot with r rows and c columns each indicating spots
* POST http://localhost:8080/parking/park?parkingLotName={name} and body = {
    "vehicleId":"13",
    "type":"MOTORCYCLE"
} for adding vehicle to the available spot if found.
* GET http://localhost:8080/parking/open-spots?parkingLotName=ParkingLot3 to get the available spots in a parking lot
* DELETE http://localhost:8080/parking/removeVehicle?vehicleId=13&parkingLotName={name} to remove vehicle and make spot available.



Disclaimer - Frontend and Corner cases coding in progress.
