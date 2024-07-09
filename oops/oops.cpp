#include <iostream>
using namespace std;

extern void constructors();
extern void operatorOverloading();
extern void inheritance();
extern void functionOverriding();
extern void abstractClass();
extern void virtualDestructor();
extern void staticKeyword();

int main()
{
	constructors();
	operatorOverloading();
	inheritance();
	functionOverriding();
	abstractClass();
	virtualDestructor();
	staticKeyword();

	return 0;
}