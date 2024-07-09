#pragma once
#include "car.h"

class Mercedes : public Car {
public :
	~Mercedes() {
		std::cout<< "Mercedes destructor" << std::endl;
	}
	void carName() override {
		std::cout << "Mercedes" << std::endl;
	}
};