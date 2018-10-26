#include <iostream>
#include <string>
#include <cstdlib>
#include <time.h>
using namespace std;

struct sdt
{
	double mavung;
	double traodoi;
	double so;
};

int main()
{
	struct sdt t;
	struct sdt k;
	srand (time(NULL));
	t.mavung =500; //rand() % 1000+111;
	t.traodoi =252; //rand() % 1000+111;
	t.so = 1010;//rand() % 10000+1111;
	cout<<"nhap vao ma vung, trao doi va so cua ban: ";
	cin>>k.mavung>>k.traodoi>>k.so;
	cout<<"\nban da nhap xong";
	cout<<"\nso cua toi la:";
	cout<<" ("<<t.mavung<<")"<<" "<<t.traodoi<<" "<<t.so;
	cout<<"\nso cua ban la: ";
	cout<<"("<<k.mavung<<") "<<k.traodoi<<" "<<k.so;
	return 0;
}
