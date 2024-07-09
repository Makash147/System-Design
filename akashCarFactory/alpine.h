#pragma once
#include "car.h"

class Alpine : public Car {
public:
	~Alpine () {
		std::cout << "Alpine destructor" << std::endl;
	}
	void carName() override {
		std::cout << "Alpine" << std::endl;
	}
};