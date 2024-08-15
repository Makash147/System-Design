#pragma once

#include <iostream>
#include "Observer.h"
#include "Observable.h"

class DesktopObserver : public Observer {
private:
	std::string desktopName;
	Observable earPhoneObservable;
public:
	DesktopObserver(const std::string desktopName, Observable earPhoneObservable) : desktopName(desktopName), earPhoneObservable(earPhoneObservable) {}
	void sendNotification() override {
		std::cout << "Desktop notified." << std::endl;
	}
};