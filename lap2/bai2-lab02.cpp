#include<iostream>
#include<math.h>
using namespace std;
float tong(float n,float Po,float r );
void nhap(float &n);
int main()
{
	float n,Po,r;
	cout<<"Enter initial amount: ";
	nhap(Po);
	cout<<"Enter number of years: ";
	nhap(n);
	cout<<"Enter interest rate (percent per year): ";
	nhap(r);	
	cout<<"ket qua la: "<<tong<<endl;
	return 0;
}
void nhap(float &n)
{
	cin>>n;
}
float tong(float n,float Po,float r )
{
	float tong = 0;
	for(float i=1;i<n;i++)
	{
		float a=(1+r)*(1+r);
			tong=a*Po;
	}
	return tong;
}
