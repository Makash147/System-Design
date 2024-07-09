#include <iostream>
using namespace std;

class base
{
public:
	void print()
	{
		cout << "Base class" << endl;
	}
};

class derived : public base
{
public:
	void print()
	{
		base::print();
		cout << "Derived class" << endl;
	}
};

void functionOverriding()
{
	cout<< endl << "Function overriding" << endl;

	derived d;
	d.print();
}