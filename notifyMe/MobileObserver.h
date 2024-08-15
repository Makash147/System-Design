#pragma once

#include <iostream>
#include "Observer.h"
#include "Observable.h"

class MobileObserver : public Observer {
private:
	std::string mobileName;
	Observable earPhoneObservable;
public:
	MobileObserver(const std::string& mobileName, Observable earPhoneObservable) : mobileName(mobileName), earPhoneObservable(earPhoneObservable) {}
	void sendNotification() override {
		std::cout << "Mobile notified." << std::endl;
	}
};