#pragma once
#include <iostream>
#include "baseCar.h"
#include "basicDrivingMode.h"

class EconomyCar : public BaseCar {
private:
	DrivingModes* driving_mode_;
public:
	EconomyCar(DrivingModes* driving_mode) : driving_mode_(driving_mode) {}
	void driveMode() override {
		driving_mode_->driveMode();
	}
};