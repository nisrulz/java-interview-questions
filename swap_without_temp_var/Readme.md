## Swap value of 2 variables without using a temp variable

Given two variables, x and y, swap two variables without using a third variable.

### Problems with above methods
1. The multiplication and division based approach doesn’ work if one of the numbers is 0 as the product becomes 0 irrespective of the other number.

1. Both Arithmetic solutions may cause arithmetic overflow. If x and y are too large, addition and multiplication may go out of integer range.

1. When we use pointers to variable and make a function swap, all of the above methods fail when both pointers point to the same variable