#include <iostream>
#include <vector>
using namespace std;

int main()
{
	vector<int> v = { 1,2, 3, 4, 5 };

	for (auto& i : v) {
		i = i + 1;
	}
	for (auto i : v) {
		cout << i << " ";
	}
	cin.get();
}