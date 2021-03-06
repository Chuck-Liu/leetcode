#include<iostream>
#include<string>
#include<vector>
using namespace std;
class Solution {
public:
	vector<int> productExceptSelf(vector<int>& nums) {
		int len = nums.size();
		vector<int> result(len, 1);
		for (int i = 1; i < len; i++){
			result[i] = result[i - 1] * nums[i - 1];
		}
		int mul = 1;
		for (int i = len - 2; i >= 0; i--){
			mul *= nums[i + 1];
			result[i] *= mul;
		}
		return result;

	}
};
