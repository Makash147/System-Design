#include <iostream>
#include "margherittaPizza.h"
#include "cheese.h"

int main() {
	BasePizza* pizza = new Cheese(new MargherittaPizza());
	int costOfPizzaa = pizza->getPrice();

	std::cout<< "Cost of pizza is: " << costOfPizzaa << std::endl;
}