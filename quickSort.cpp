#include<bits/stdc++.h>
using namespace std;

void swap(int *a,int *b)
{
    int t =*a;
    *a = *b;
    *b = t;
}

int partition(int a[],int low,int hi)
{
    int pivot = a[hi];

    int i =(low - 1);
    for(int j=low;j<hi;j++)
    {
        if(a[j] <= pivot){
            i++;
            swap(&a[i],&a[j]);
        }
    }swap(&a[i+1],&a[hi]);
    return (i+1);
}

void printArry(int a[],int size)
{
    for(int i =0;i<size;i++)
    {
        cout<<a[i]<<" ";
    }cout<<endl;
}




void quickSort(int a[],int l,int h)
{
    if(h > l)
    {
        int piv = partition(a,l,h);

        quickSort(a,l,piv - 1);

        quickSort(a,piv + 1,h);
    }
}



int main()
{
    int arr[] = {9,7,6,1,0,8,10};
    int size = sizeof(arr)/sizeof(arr[0]);


    quickSort(arr,0,size - 1);
    cout<<"Sorted Array: "<<endl;
    printArry(arr,size);

}
