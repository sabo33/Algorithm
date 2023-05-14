

#include <iostream>
using namespace std;
#include<string>



int main()
{
    int n=0, n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9 = 0;
    int a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    
    string result = to_string(a * b * c);
    for (int i = 0; i < result.length(); i++) {
        if (result[i] == '0')
            n++;
        else if (result[i] == '1')
            n1++;
        else if (result[i] == '2')
            n2++;
        else if (result[i] == '3')
            n3++;
        else if (result[i] == '4')
            n4++;
        else if (result[i] == '5')
            n5++;
        else if (result[i] == '6')
            n6++;
        else if (result[i] == '7')
            n7++;
        else if (result[i] == '8')
            n8++;
        else
            n9++;
    }
    

    cout << n << '\n';
    cout << n1 << '\n';
    cout << n2 << '\n';
    cout << n3 << '\n';
    cout << n4 << '\n';
    cout << n5 << '\n';
    cout << n6 << '\n';
    cout << n7 << '\n';
    cout << n8 << '\n';
    cout << n9 << '\n';


}

