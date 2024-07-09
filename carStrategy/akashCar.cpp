#include "sportsCar.h"
#include "economyCar.h"

int main() {
	BaseCar* akashCar = new SportsCar(new SportsDrivingMode());
	akashCar->driveMode();

	BaseCar* akashCar2 = new EconomyCar(new BasicDrivingMode());
	akashCar2->driveMode();
}