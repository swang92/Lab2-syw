
**Lab 2 - Answers**


**Question 1**

All three of the search classes will be O(n) except binary search will be O(log n).  

**Question 2**

If you don't sort the array, there is no accuracy in the binary search. Running a binary search assumes that the array is sorted because this must be true in order to keep decreasing the size of our array. One of the qualifying assumptions is whether the number we are looking for is higher or lower than the mid.

**Question 3**

The purpose of final is to lock down the variable and arguments so that other developers cannot change the values. It also impacts the mutability of our ArrayLists because normally we would want them to be dynamic. However, we are declaring them final in this lab because we don't want the values to be changing.  

**Question 4**

The purpose of the Optional class is to test for null objects and reduce null pointer exceptions. If we remove the optional class, we would need to test for if the object is null and likely have some test methods for trying and catching null pointer exceptions. 