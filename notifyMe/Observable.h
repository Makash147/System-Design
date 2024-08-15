#pragma once

#include "Observer.h"

class Observable {
public:
	virtual ~Observable() = default;
	void addObserver(Observer* observer);
	void removeObserver(Observer* observer);
	void notifyObservers();
	void setData(int data);
	int getData();
};