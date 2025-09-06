#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

const int pieces = 8;   // 8 x 8 chess board
int board[pieces];     
int solutionCount = 0;

bool isSafe(int row, int col) {
    for (int prevRow = 0; prevRow < row; prevRow++) {
        int prevCol = board[prevRow];
        // Check same column OR diagonal conflicts
        if (prevCol == col || abs(prevCol - col) == abs(prevRow - row))
            return false;
    }
    return true;
}

void printBoard() {
    cout << "Solution " << ++solutionCount << ":\n";
    for (int r = 0; r < pieces; r++) {
        for (int c = 0; c < pieces; c++) {
            if (board[r] == c) cout << "Q ";
            else cout << ". ";
        }
        cout << "\n";
    }
    cout << "\n";
}

void solve(int row) {
    if (row == pieces) {
        printBoard();
        return;
    }
    for (int col = 0; col < pieces; col++) {
        if (isSafe(row, col)) {
            board[row] = col;
            solve(row + 1);
        }
    }
}

int main() {
    solve(0);// start from first row
    cout << "Total solutions for " << pieces << " queens: " << solutionCount << endl;
    return 0;
}
