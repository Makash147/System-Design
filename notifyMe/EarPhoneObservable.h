#pragma once

#include <vector>
#include "Observable.h"

class EarPhoneObservable : public Observable {
private:
	std::vector<Observer*> observers;
	int data_ = 0;
public:
	void addObserver(Observer* observer) {
		observers.push_back(observer);
	}
	void removeObserver(Observer* observer) {
		auto it = std::find(observers.begin(), observers.end(), observer);
		observers.erase(it);
	}
	void notifyObservers() {
		for (auto observer : observers) {
			observer->sendNotification();
		}
	}
	void setData(int data) {
		data_ = data;
		if (data_ != 0) {
			notifyObservers();
		}
	}
	int getData() {
		return data_;
	}
};