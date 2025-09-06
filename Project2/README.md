8 Queens Problem? - How can eight queens be placed on an 8×8 chessboard so that no two queens threaten each other? 

Looking for conditions where the Queens can not be on the same row, column, or diagonal, backtracking and recursion would be needed to be used to get the answer.

Aprroach
1) Start at the first row and attempt to place a queen in each column.
2) For each valid placement, move to the next row and repeat.
3) If a row cannot accept a queen (no safe columns), backtrack to the previous row and try a new position.
4) Continue until all 8 queens are placed or all possibilities are exhausted.
5) The algorithm records every valid configuration, resulting in 92 unique solutions in the case of a 8×8 board.
