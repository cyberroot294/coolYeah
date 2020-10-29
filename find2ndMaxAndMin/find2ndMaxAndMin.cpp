#include <iostream>
#include <iomanip>
// #include <conio>
using namespace std;

int main(int argc, char const *argv[])
{
    int n;
    cout << "Masukkan banyak data : ";
    cin >> n;
    int arr[n];
    cout << "Input data anda" << endl;
    
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i]; 
    }

    for (int i = 0; i < n; i++)
    {
        int idMin = i;
        int Min = arr[i];

        for (int j = i+1; j < n; j++)
        {
            if (Min > arr[j] )
            {
                idMin = j;
                Min = arr[j];
            }
            
        }

        // swapping
        int temp = arr[i];
        arr[i] = Min;
        arr[idMin] = temp;
        
    }

    // size_t l = sizeof(arr)/sizeof(arr[0]);

    printf("Nilai terkecil ke 2 ialah %d\n", arr[1]);
    printf("Nilai terbesar ke 2 ialah %d", arr[n-2]);
    return 0;
}

