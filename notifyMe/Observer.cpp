#include <iostream>
#include "Observable.h"

class MobileObserver : public Observer {
private:
	std::string mobileName;
	EarPhoneObservable earPhoneObservable;
public:
	MobileObserver(std::string mobileName, EarPhoneObservable earPhoneObservable) {
		this->mobileName = mobileName;
		this->earPhoneObservable = earPhoneObservable;
	}
	void sendNotification()
	{
		std::cout << "Mobile notified." << std::endl;
	}
};

class DesktopObserver : public Observer {
private:
	std::string desktopName;
	EarPhoneObservable earPhoneObservable;
public:
	DesktopObserver(std::string desktopName, EarPhoneObservable earPhoneObservable) {
		this->desktopName = desktopName;
		this->earPhoneObservable = earPhoneObservable;
	}
	void sendNotification()
	{
		std::cout << "Desktop notified." << std::endl;
	}
};