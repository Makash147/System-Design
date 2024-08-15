#pragma once

#include <iostream>
#include "EarPhoneObservable.h"
#include "DesktopObserver.h"
#include "MobileObserver.h"

int main() {
	EarPhoneObservable earPhoneObservable;
	std::unique_ptr<Observer> mobileObserver = std::make_unique<MobileObserver>("akashMobile", earPhoneObservable);
	Observer *desktopObserver = new DesktopObserver("akashDesktop", earPhoneObservable);

	earPhoneObservable.addObserver(mobileObserver.get());
	earPhoneObservable.addObserver(desktopObserver);

	earPhoneObservable.setData(1);

	delete desktopObserver;

	return 0;
}