#include<iostream>
using namespace std;
void nhap(float &a,char &s,float &b);
void baitoan(float a,char s,float b,char K);
int main()
{
	float a,b;
	char s,K;
	baitoan(a,s,b,K);
	return 0;
}
void nhap(float &a,char &s,float &b)
{
	cout<<"Enter first number,operator,second number: ";
	cin>>a>>s>>b;
}
void baitoan(float a,char s,float b,char K)
{
	float T=0;
	START:
	nhap(a,s,b);
	switch(s)
	{
		case '+':
		{
			T=1.0*a+b;
			cout<<"tong la: "<<T<<endl;
			break;
		}
		case '-':
		{
			T=1.0*a-b;
			cout<<"Hieu la: "<<T<<endl;
			break;
		}
		case '*':
		{
			T=1.0*a*b;
			cout<<"tich la: "<<T<<endl;
			break;
		}
		case '/':
		{
			T=1.0*a/b;
			cout<<"thuong la: "<<T<<endl;
			break;
		}
		default:
			{
				cout<<"khong co toan tu phu hop: "<<endl;	
				break;
			}
	}
cout<<"Yes or No"<<endl;
cin>>K;
if(K=='y')
{
	goto START;
}
else if(K=='n')
{
	cout<<"the end ";
}
	
}
