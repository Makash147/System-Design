#pragma once

class BaseCar {
public:
	virtual void driveMode() = 0;
	virtual ~BaseCar() = default;
};