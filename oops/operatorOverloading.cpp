#include <iostream>
using namespace std;

class person
{
private:
	int weight;
public:
	// Parameterized constructor
	person(int w = 0)
	{
		weight = w;
	}

	void print();

	//	Operator overloading
	person operator+(person& p)
	{
		person temp;
		temp.weight = weight + p.weight;
		return temp;
	}

	//	Prefix operator overloading
	void operator++()
	{
		++weight;
	}

	//	Postfix operator overloading
	void operator++(int)
	{
		weight++;
	}
};

void person::print()
{
	cout<< "Weight = " << weight << endl;
}

void operatorOverloading()
{
	cout<< endl << "Operator overloading" << endl;
	int a = 10, b = 20, c;
	c = a + b;
	cout << "c = " << c << endl;

	person p1(65);
	person p2(75);
	person p3;

	p3 = p1 + p2;
	p3.print();

	++p3;
	p3.print();

	p3++;
	p3.print();
}