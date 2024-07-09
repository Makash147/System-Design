#include <iostream>
#include "MobileObserver.h"

MobileObserver::MobileObserver(const std::string& mobileName, EarPhoneObservable& earPhoneObservable) : mobileName(mobileName), earPhoneObservable(earPhoneObservable) {}

void MobileObserver::sendNotification() {
	std::cout << "Mobile notified." << std::endl;
}