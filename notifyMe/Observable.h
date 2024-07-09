#pragma once

#include <vector>
#include "Observer.h"

class Observable {
public:
	virtual ~Observable() = default;
	virtual void addObserver(Observer* observer) = 0;
	virtual void removeObserver(Observer* observer) = 0;
	virtual void notifyObservers() = 0;
	virtual void setData(int data) = 0;
	virtual int getData() = 0;
};

class EarPhoneObservable : public Observable {
private:
	std::vector<Observer*> observers;
	int data = 0;
public:
	void addObserver(Observer* observer) override;
	void removeObserver(Observer* observer) override;
	void notifyObservers() override;
	void setData(int data) override;
	int getData() override;
};