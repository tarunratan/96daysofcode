#include<iostream>
using namespace std;
int  main()
{
    int num1,count=0;
    cin>>num1;
    for(int i=2;i<7;i++)
    {
       if(num1%i==0)
       {
           count++;
       } 
    }
    if(count>0)
    {
        cout<<"not prime";
    }
    else
    cout<<"prime";
}