
#include<bits/stdc++.h>
using namespace std;


void bubbleSort(int a[],int size)
{
    for(int i=0;i<size-1;i++){
        for(int j =0;j<size - i - 1;j++){

             if(a[j] > a[j+1]){
                int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
             }
        }
    }
}
void print(int a[],int size){

for(int i=0;i<size;i++){
    cout<<" "<<a[i];
}

}



int main(){

  int data[] = {10,23,4,45,12,30,11,4};

  int size = sizeof(data)/sizeof(data[0]);

  bubbleSort(data,size);
  cout<<"Sorted Array: " <<endl;
  print(data,size);

  return 0;

}

