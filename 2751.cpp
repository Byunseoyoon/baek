#include <iostream>
#include<algorithm>

using namespace std;

const int MAX = 1000000;
int arr[MAX];

int main() {
    int N;
    cin >> N;
    
    for(int i=0; i<N;i++)
        cin >> arr[i];
        
    sort(arr,arr+N);
    
    for (int i=0;i<N;i++)
        cout << arr[i] <<'\n';
    
    return 0;
}
