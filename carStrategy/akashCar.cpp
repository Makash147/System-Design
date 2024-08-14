#include "sportsCar.h"
#include "economyCar.h"

int main() {
	BaseCar* akashCar = new SportsCar();
	akashCar->driveMode();

	BaseCar* akashCar2 = new EconomyCar();
	akashCar2->driveMode();
}