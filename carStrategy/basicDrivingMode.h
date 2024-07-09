#pragma once
#include <iostream>
#include "drivingModes.h"

class BasicDrivingMode : public DrivingModes {
public:
	void driveMode() override {
		std::cout << "Basic driving mode available in this car." << std::endl;
	}
};