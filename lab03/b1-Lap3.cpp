#include<iostream>
  
  using namespace std; 
  
  class time{ 
  	private : 
  		int hour; 
  		int minute; 
  		int seconds; 
  	public : 
  		time() 
  		{ 
  			this->hour=0; 
  			this->minute=0; 
  			this->sec=0;	 
  		} 
  		time(int h,int m,int s) 
  		{ 
  				this->hour=h; 
  				this-> minute=m; 
  				this->sec=s; 
  		} 
  		void display() 
  		{ 
  				int minute=this->minute; 
  				int hour=this->hour; 
  				int sec=this->sec; 
  			if(sec>=60) 
  			{ 
  				int i=sec/60; 
  				minute+=i; 
  			} 
  			sec=sec%60; 
  			if(minute>=60) 
  			{ 
  				int i=minute/60; 
  				hour+=i; 
  			} 
  			minute=minute%60; 
  			hour=hour%12; 
  			if(minute<=10) 
  				cout<<hour<<":0"<<minute<<":"<<sec<<endl; 
  			else 
  				cout<<hour<<":"<<minute<<":"<<sec<<endl; 
  		} 
  		time operator+(const time &t) 
  		{ 
  				time t2; 
  				int hour; 
  				int minute; 
  				int sec; 
  				t2.hour=this->hour+t.hour; 
  				t2.minute=this->minute+t.minute; 
  				t2.sec=this->sec+t.sec; 
  				return t2; 
  		} 
  }; 
  int main() 
  { 
  	time t1(1,1,1); 
  	time t2(9,79,77); 
  	t2.display(); 
  	time t3; 
  	t3=t1+t2; 
  	t3.display(); 
} 
