#include<iostream>
class Solution {
public:
	int integerBreak(int n) {
		switch (n){
		case 1: return 1;
		case 2: return 1;
		case 3: return 2;
		case 4: return 4;
		case 5: return 6;
		case 6: return 9;
		}
		return 3 * integerBreak(n - 3);
	}
};
