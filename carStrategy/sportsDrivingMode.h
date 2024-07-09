#pragma once
#include <iostream>
#include "drivingModes.h"

class SportsDrivingMode : public DrivingModes {
public:
	void driveMode() override {
		std::cout << "Sports driving mode available in this car." << std::endl;
	}
};