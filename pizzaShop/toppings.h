#pragma once
#include "basePizza.h"

class Toppings : public BasePizza {
public:
	virtual int getPrice() = 0;
	virtual ~Toppings() {}
};