#include <iostream>
using namespace std;

class Alpha
{
private:
	int a;
	int b;
public:
	Alpha()
	{
		a = 0;
		b = 0;
		stat++;
	}
	static int stat;

	int static getStat()
	{
		stat++;
		return stat;
	}
};

int Alpha::stat = 0;

void staticKeyword()
{
	cout << endl << "Static keyword" << endl;

	Alpha a1, a2;
	cout << "a1.stat = " << a1.stat << endl;
	cout << "a2.stat = " << a2.stat << endl;
	cout << "Alpha::stat = " << Alpha::stat << endl;

	cout<< "Alpha::getStat() = " << Alpha::getStat() << endl;
}