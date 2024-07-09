#include <iostream>
#include "Observable.h"

class MobileObserver : public Observer {
private:
	std::string mobileName;
	EarPhoneObservable earPhoneObservable;
public:
	MobileObserver(const std::string& mobileName, EarPhoneObservable& earPhoneObservable);
	void sendNotification() override;
};