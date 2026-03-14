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


