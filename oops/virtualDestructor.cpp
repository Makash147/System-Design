#include <iostream>
using namespace std;

class base
{
public:
	virtual ~base()
	{
		cout << "Base class destructor" << endl;
	}
};

class derived : public base
{
public:
	~derived()
	{
		cout << "Derived class destructor" << endl;
	}
};

void virtualDestructor()
{
	cout << endl << "Virtual destructor" << endl;

	base *ptr = new derived;
	delete ptr;
}