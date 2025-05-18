#include<bits/stdc++.h>
using namespace std;

void merge(int a[],int low,int mid,int hi)
{
    int n1=mid-low+1;
    int n2=hi-mid;
    vector<int>L(n1);
    vector<int>R(n2);

    for(int i=0;i<n1;i++)
    {
        L[i] = a[low+i];
    }
    for(int j=0;j<n2;j++)
    {
        R[j] = a[mid+j+1];
    }
    int i=0,j=0,k=low;

    while(n1>i && n2>j)
    {
        if(L[i] <= R[j])
        {
            a[k] = L[i];
            i++;
        }else{
            a[k] = R[j];
            j++;
        }k++;
    }
    while(n1 > i)
    {
        a[k] = L[i];
        i++;k++;
    }
    while(n2>j){
        a[k] = R[j];
        j++;k++;
    }
}




void mergesort(int a[],int low,int hi)
{
    if(hi>low)
    {
        int mid = low+(hi-low)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,hi);

        merge(a,low,mid,hi);
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

    mergesort(a,0,n-1);
    cout<<"Output: ";
    print(a,n);
    return 0;
}
