#pragma once
#include <iostream>
#include "baseCar.h"
#include "sportsDrivingMode.h"

class SportsCar : public BaseCar {
private:
	DrivingModes* driving_mode_;
public:
	SportsCar(DrivingModes* driving_mode) : driving_mode_(driving_mode) {}
	void driveMode() override {
		driving_mode_->driveMode();
	}
};