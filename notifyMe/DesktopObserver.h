#include <iostream>
#include "Observable.h"

class DesktopObserver : public Observer {
private:
	std::string desktopName;
	EarPhoneObservable earPhoneObservable;
public:
	DesktopObserver(const std::string desktopName, EarPhoneObservable earPhoneObservable);
	void sendNotification() override;
};