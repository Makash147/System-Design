#include <iostream>
using namespace std;

// Abstract class
class base
{
public:
	virtual void print() = 0;
};

class derived1 : public base
{
public:
	void print()
	{
		cout << "Derived1 class" << endl;
	}
};

class derived2 : public base
{
public:
	void print()
	{
		cout << "Derived2 class" << endl;
	}

};

void abstractClass()
{
	cout<< endl << "Abstract class" << endl;

	base *ptr = new derived1;
	ptr->print();

	ptr = new derived2;
	ptr->print();
}