#pragma once

class Observer {
public:
	virtual ~Observer() = default;
	virtual void sendNotification() = 0;
};