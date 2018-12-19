#include <iostream>
using namespace std;
class serial
{
	private:
		int id;
		static int number;//ap dung cho toan bo cac lop ko dung doi tuong rieng le
	public:
		serial()
		{
			number++;
			id=number;
		}
		static void nhap()
		{
			cout<<number<<endl;
		}
		void in()
		{
			cout<<this->id<<endl;
		}
};
int serial::number=0;
int main()
{
	serial a;
	a.in();
	serial::nhap();
	serial a1;
	a1.in();
	serial::nhap();
	
	
}
