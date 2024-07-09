#pragma once
#include "carFactory.h"
#include "alpine.h"

class OrdinaryCarFactory : public CarFactory {
public:
	~OrdinaryCarFactory() {
		std::cout << "OrdinaryCarFactory destructor" << std::endl;
	}
	void selectCar() override {
		std::cout << "Selecting Alpine" << std::endl;
	}
};