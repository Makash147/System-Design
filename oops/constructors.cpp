#include <iostream>
using namespace std;

class house
{
private :
	int length;
	int breadth;
public :
	//	Default constructor
	/*
	house()
	{
		length = 10;
		breadth = 20;
	}
	*/

	//  Parameterized constructor
	//	Constructor overloading
	house(int l = 10, int b = 20)
	{
		length = l;
		breadth = b;
	}

	//	Copy constructor
	house(house& h)
	{
		length = h.length;
		breadth = h.breadth;
	}
	void area();
};

void house::area()
{
	cout << "Area = " << length * breadth << endl;
}

void constructors()
{
	cout<< "Constructors" << endl;
	house h1;
	h1.area();

	house h2(20,30);
	h2.area();

	house h3(h2);
	h3.area();
}