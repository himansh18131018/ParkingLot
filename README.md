# ParkingLot
Parking Lot Using Java in Spring Boot Framework

## API Endpoints

* POST http://localhost:8080/parking/initialize?name={name}&r={rows}&c={columns} initializes a new Parking Lot with r rows and c columns each indicating spots
* POST http://localhost:8080/parking/park?parkingLotName={name} and body = {
    "vehicleId":"13",
    "type":"MOTORCYCLE"
} for adding vehicle to the available spot if found.
* GET http://localhost:8080/parking/open-spots?parkingLotName=ParkingLot3&occupiedSpot=true to get the available spots or occupied spots depending on occupiedSpot value in a parking lot
* DELETE http://localhost:8080/parking/removeVehicle?vehicleId=13&parkingLotName={name} to remove vehicle and make spot available.

You can use React in frontend like me to simple fetch API's and display data

ScreenShot

<img width="1792" alt="Screenshot 2023-12-28 at 4 44 01 PM" src="https://github.com/himansh18131018/ParkingLot/assets/60508244/357a5123-cadd-4899-9990-94dac2bec6fe">

