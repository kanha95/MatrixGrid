#include <bits/stdc++.h>
 
using namespace std;
 
void solve() {
    int n, m;
    cin >> n >> m;
    cout << (n - 1)*m + (m - 1)*n << endl;
}
 
int main() {
    int test;
    cin >> test;
    while (test--) {
        solve();
    }
    return 0;
} 
