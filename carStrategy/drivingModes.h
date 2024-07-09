#pragma once

class DrivingModes {
public:
	virtual void driveMode() = 0;
	virtual ~DrivingModes() = default;
};