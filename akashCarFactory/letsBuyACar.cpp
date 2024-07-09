#include <iostream>
#include <unordered_map>
#include "carBrandSection.h"
#include "mercedes.h"
#include "alpine.h"

int main() {
	CarBrandSection carBrandSection;
	carBrandSection.selectCarBrand("luxurious")->selectCar();
	carBrandSection.selectCarBrand("ordinary")->selectCar();
}