#include<iostream>
using namespace std;
void nhap(int &a,int &b,int &c,int &d,char &s);
void tinh(int a,int b,int c,int d,char s,char K);
int main()
{
	int a,b,c,d;
	char s,K;
	tinh(a,b,c,d,s,K);
	return 0;
}
void nhap(int &a,int &b,int &c,int &d,char &s)
{
	char dummy;
	cout<<"Enter number 1,2,operator,3,4: ";
	cin>>a>>dummy>>b>>s>>c>>dummy>>d;
	
}
void tinh(int a,int b,int c,int d,char s,char K)
{
	float Tong=0;
	START:
	nhap(a,b,c,d,s);
	switch(s)
	{
		case '+':
			{
				Tong=1.0*(a*d+b*c)/(b*d);
				cout<<"Ket qua la: "<<Tong<<endl;
				break;
			}
		case '-':
			{
				Tong=1.0*(a*d-b*c)/(b*d);
				cout<<"Ket qua la: "<<Tong<<endl;
				break;
			}
		case '*':
			{
				Tong=1.0*(a*c)/(b*d);
				cout<<"Ket qua la: "<<Tong<<endl;
				break;
			}
		case '/':
			{
				Tong=1.0*(a*d)/(b*c);
				cout<<"Ket qua la: "<<Tong;
				break;
			}
		default:
			{
				cout<<"khong phu hop: ";	
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
