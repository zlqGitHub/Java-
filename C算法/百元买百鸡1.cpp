#include <stdio.h>
//百元买百鸡问题 
int main(){
	int a,b,c,n=100;
	for(a=0;a<n/5;a++){
		for(b=0;b<n/3;b++){
			for(c=0;c<n;c++){
				if(a+b+c==100 && 5*a+3*b+c/3==100 && c%3==0){
					printf("%d\t%d\t%d\n",a,b,c);
				}
			}
		}
	}
	return 0;
	 
}
 
