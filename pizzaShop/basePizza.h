#pragma once

class BasePizza {
public:
	virtual int getPrice() = 0;
	virtual ~BasePizza() {}
};