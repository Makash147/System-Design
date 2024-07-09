#pragma once
#include "toppings.h"

class Cheese : public Toppings {
private:
	BasePizza* basePizza;
public:
	Cheese(BasePizza* basePizza) : basePizza(basePizza) {}

	int getPrice() override {
		return basePizza->getPrice()+20;
	}
};