#include <vector>
#include "Observable.h"

void EarPhoneObservable::addObserver(Observer* observer) {
	observers.push_back(observer);
}

void EarPhoneObservable::removeObserver(Observer* observer) {
	auto it = std::find(observers.begin(), observers.end(), observer);
	observers.erase(it);
}

void EarPhoneObservable::notifyObservers() {
	for (auto observer : observers) {
		observer->sendNotification();
	}
}

void EarPhoneObservable::setData(int data) {
	this->data = data;
	if (this->data != 0) {
		notifyObservers();
	}
}

int EarPhoneObservable::getData() {
	return data;
}