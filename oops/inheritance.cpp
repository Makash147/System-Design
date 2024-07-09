#include <iostream>
using namespace std;

class rectangle
{
protected:
	int length;
	int breadth;
public:
	rectangle(int l = 0, int b = 0)
	{
		length = l;
		breadth = b;
	}
	void area()
	{
		cout << "Area = " << length * breadth << endl;
	}
};

class cuboid : public rectangle
{
private:
	int height;
public:
	cuboid(int l = 0, int b = 0, int h = 0) : rectangle(l, b)
	{
		height = h;
	}
	void volume()
	{
		cout << "Volume = " << length * breadth * height << endl;
	}
};

void inheritance()
{
	cout<< endl << "Inheritance" << endl;
	rectangle r1(10, 20);
	r1.area();

	cuboid c1(10, 20, 30);
	c1.volume();
}