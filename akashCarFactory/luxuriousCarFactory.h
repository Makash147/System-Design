#pragma once
#include "carFactory.h"
#include "mercedes.h"

class LuxuriousCarFactory : public CarFactory {
public:
	~LuxuriousCarFactory() {
		std::cout << "LuxuriousCarFactory destructor" << std::endl;
	}
	void selectCar() override {
		std::cout << "Selecting Mercedes" << std::endl;
	}
};