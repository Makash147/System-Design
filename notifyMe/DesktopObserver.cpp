#include <iostream>
#include "DesktopObserver.h"

DesktopObserver::DesktopObserver(const std::string desktopName, EarPhoneObservable earPhoneObservable) : desktopName(desktopName), earPhoneObservable(earPhoneObservable) {}

void DesktopObserver::sendNotification() {
	std::cout << "Desktop notified." << std::endl;
}