# include<iostream>
using namespace std;
class nhanvien
{
	private:
		int id;
		float money;	
	public:
		nhanvien(int id,float m)
		{
			this-> id=id;
			this-> money=m;
		}
		void tinh(int year)
		{
			float m=this->money;
			for(int i=0;i<year;i++)
			{
				m+=m*0.055;
			}
				cout<<"so tien sau "<<year<<"nam ="<<m<<endl;
		}
		
};
int main()
{
	nhanvien s1(1,2500);
	s1.tinh(3);
}

