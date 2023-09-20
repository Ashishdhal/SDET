package HWAFTER41;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/*Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]*/

public class SummaryRange {
	@Test
	public void test() {
		List<String> summaryRanges = summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 });
		// Assert.assert
		System.out.println(summaryRanges);
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> ls = new ArrayList();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] + 1 != nums[i + 1]) {
				// ls.add(i, );
				// ls.add(i, null);
				ls.add(null);

				// string.value

			}

		}

		return null;

	}

}
