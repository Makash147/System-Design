#pragma once
#include "basePizza.h"

class MargherittaPizza : public BasePizza {
public:
	int getPrice() override{
		return 100;
	}
};