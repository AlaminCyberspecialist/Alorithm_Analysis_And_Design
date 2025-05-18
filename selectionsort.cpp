#include<bits/stdc++.h>
using namespace std;


void selectionsort(int a[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        int min =i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j] < a[min]){
                min = j;
            }swap(a[i],a[min]);
        }
    }
}


void print(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}
int main()
{
    int n;
 cout<<"Enter array size: ";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    selectionsort(a,n);
    cout<<"Output: ";
    print(a,n);
    return 0;
}
