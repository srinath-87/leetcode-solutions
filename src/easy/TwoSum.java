package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			int x = target - cur;
			if (map.containsKey(x)) {
				return new int[] { map.get(x), i };
			}
			map.put(cur, i);
		}
		return null;
	}
}
