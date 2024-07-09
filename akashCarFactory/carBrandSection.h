#pragma once
#include "luxuriousCarFactory.h"
#include "ordinaryCarFactory.h"
#include "mercedes.h"
#include "alpine.h"

class CarBrandSection {
private:
	enum CarBrandType {
		luxurious,
		ordinary
	};

	std::unordered_map<std::string, CarBrandType> carBrandTypeMap;

public:
	CarBrandSection() {
		carBrandTypeMap["luxurious"] = CarBrandType::luxurious;
		carBrandTypeMap["ordinary"] = CarBrandType::ordinary;
	}

	CarFactory* selectCarBrand(std::string brandType) {
		switch (carBrandTypeMap[brandType]) {
		case luxurious:
			std::cout << "Luxurious car brand selected" << std::endl;
			return new LuxuriousCarFactory();

		case ordinary:
			std::cout << "Ordinary car brand selected" << std::endl;
			return new OrdinaryCarFactory();

		default:
			std::cout << "Invalid car brand selected" << std::endl;
			return nullptr;
		}
	}
};