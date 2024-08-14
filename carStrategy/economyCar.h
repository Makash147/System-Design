#pragma once
#include <iostream>
#include "baseCar.h"
#include "basicDrivingMode.h"

class EconomyCar : public BaseCar {
public:
	EconomyCar() : BaseCar(new BasicDrivingMode()) {}
};