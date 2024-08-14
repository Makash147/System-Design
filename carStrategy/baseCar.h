#pragma once

#include "drivingModes.h"

class BaseCar {
private:
	DrivingModes* driving_mode_;
public:
	BaseCar(DrivingModes* driving_mode) : driving_mode_(driving_mode) {}
	void driveMode() {
		driving_mode_->driveMode();
	}
	virtual ~BaseCar() = default;
};