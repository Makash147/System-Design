#pragma once

class CarFactory {
public:
	virtual ~CarFactory() = default;
	virtual void selectCar() = 0;
};