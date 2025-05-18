#include<bits/stdc++.h>
using namespace std;


void insertionSort(int a[],int size){

for(int i=1;i<size;i++)
{
    int temp = a[i];
  int  j = i-1;
    while(j >=0 && a[j]>temp){
        a[j+1] = a[j];
        j--;
    }
    a[j+1] = temp;
}

}
void print(int a[],int size)
{
    for(int i=0;i<size;i++){
        cout<<" "<<a[i];
    }
}


int main()
{
   int data[] ={-40,29,3,43,10};
   int size = sizeof(data)/sizeof(data[0]);

   insertionSort(data,size);
   cout<<"Sorted Array: "<<endl;
   print(data,size);
   return 0;


}
