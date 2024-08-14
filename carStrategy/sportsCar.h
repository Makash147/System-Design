#pragma once
#include <iostream>
#include "baseCar.h"
#include "sportsDrivingMode.h"

class SportsCar : public BaseCar {
public:
	SportsCar() : BaseCar(new SportsDrivingMode()) {}
};