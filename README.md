Problem: Custom — Sum of Even Positions in Reversed Array
Pattern: Array Traversal — Reverse Indexing
Recognized: Because we needed elements at specific positions of a reversed array, which maps to stepping backwards through the original array
Brute Force: O(n) time | O(n) space — actually reverse the array, then loop through even indices
Optimal: O(n) time | O(1) space — walk original array backwards with i -= 2, no extra array needed
Edge Cases:

Array of size 1 → only ar[0], answer is ar[0] itself
Array of even length → last picked index is 1 (not 0)
Array of odd length → last picked index is 0

Mistakes to watch:

Confusing 0-based vs 1-based indexing
Forgetting that i = -2 is safe because the loop checks condition before doing work... wait, actually after doing work — check happens first, then work, then move

Confidence: ⭐⭐ — understood the logic, figured out i -= 2 yourself, asked great questions

Pattern: Two Pointers — Opposite Ends
Recognized: Because we needed to reverse in-place without extra space, which means working from both ends toward the middle simultaneously
Brute Force: Loop backward and copy into new array | O(n) time | O(n) space
Optimal: Two pointers swapping in-place using temp variable | O(n) time | O(1) space
Key Insight: Left and right pointers start at opposite ends. Each step — swap the two elements, then move pointers inward. When they meet in the middle, every element is already in its correct place. Middle element in odd-length arrays never needs swapping.

Edge Cases:

Even length → pointers cross (left > right) → loop stops
Odd length → pointers meet (left == right) → middle stays untouched
Single element → left < right is false immediately → no swap needed

Mistakes:

Don't move left++ before finishing the swap — complete the full swap first, then move both pointers
Forgetting to declare temp as char not int

Trace:

["H","a","n","n","a","h"] → swap H↔h, a↔a, n↔n → ["h","a","n","n","a","H"] ✅
["h","e","l","l","o"] → swap h↔o, e↔l, middle l untouched → ["o","l","l","e","h"] ✅

Confidence: ⭐⭐⭐

**DAILY PROBLEM JOURNAL — #4**
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

**Problem:** LC 977 — Squares of a Sorted Array

**Pattern:** Two Pointers — Opposite Ends

**Recognized:** Because array is sorted and we need result in sorted order — largest squares always come from either leftmost or rightmost element since negatives become large when squared

**Brute Force:** Square each element → sort using Arrays.sort() → return | O(n log n) time | O(n) space

**Optimal:** Two pointers from both ends, fill result array from back to front | O(n) time | O(n) space

**Key Insight:** In a sorted array, the largest square is always at either the left end (most negative) or right end (most positive). Compare both ends, place the larger square at the last empty position of result, move that pointer inward. `pos` starts at end and decreases every step.

**New things learned:**
- Negative numbers become large when squared — `-4 * -4 = 16`
- Fill result from back to front using `pos = nums.length - 1`
- Compare `nums[left]*nums[left]` vs `nums[right]*nums[right]` directly
- `Arrays.sort()` for brute force approach

**Edge Cases:**
- All negative → largest squares at left end
- All positive → largest squares at right end
- Mix of negative and positive → compare both ends each step

**Mistakes:**
- Used `for` loop instead of `while` loop
- Tried to sort after squaring instead of using two pointers
- `ints2` instead of `int s2` — always leave space after data type!
- Compared already squared values instead of comparing while filling result

**Trace:**

Input: `[-4, -1, 0, 3, 10]`

| Step | left | right | s1(left²) | s2(right²) | bigger | res | pos |
|---|---|---|---|---|---|---|---|
| 1 | 0 | 4 | 16 | 100 | s2 | [_,_,_,_,100] | 3 |
| 2 | 0 | 3 | 16 | 9 | s1 | [_,_,_,16,100] | 2 |
| 3 | 1 | 3 | 1 | 9 | s2 | [_,_,9,16,100] | 1 |
| 4 | 1 | 2 | 1 | 0 | s1 | [_,1,9,16,100] | 0 |
| 5 | 2 | 2 | 0 | 0 | s2 | [0,1,9,16,100] | -1 |

**Output: `[0, 1, 9, 16, 100]`** ✅

**Confidence:** ⭐⭐⭐

DAILY PROBLEM JOURNAL — #5

Problem: LC 283 — Move Zeroes
Pattern: Two Pointers — Same Direction
Recognized: Because we need to move elements around in-place without extra space
Brute Force: Collect non-zeros in new array, fill rest with zeros | O(n) time | O(n) space
Optimal: Two pointers same direction — j tracks position for non-zero, i scans | O(n) time | O(1) space
Key Insight: i moves forward always. j only moves when a non-zero is placed. After first loop, everything from j to end must be zero.
Mistakes: None this time! 🔥
Confidence: ⭐⭐⭐


