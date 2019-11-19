#include<stdio.h>                 ///
                                  //
void main(int argc,char *argv[])  //argc命令行参数的个数   argv[]命令行参数的数组   下标=个数减一 即数组中最后一个为argv[argc-1]
{                                  //由于命令行参数都是字符串，所以类型为char 其末尾的argv[argc]为/0 即argv[argc]==0
	int i;
	for (i = 0; i < argc; i++)
		printf("Argument %d is %s.    \n", i, argv[i]);
	return 0;
}
/*
void Swap(int *x, int *y)//即使Int *x=&a  int *y =&b,之后Swap中的所有操作全部都用指针变量*x  *y来间接改变原来的a b值
{                                                                  
	int temp = *x;//*x = *x^*y;   *y= *x^*y  ;  *x = *x^*y
 	*x = *y; 
	*y = temp;		

}


void main(){
	int a = 10;
	int b = 20;
	printf("%d %d\n", a, b);
	Swap(&a, &b);
	printf("%d %d", a,b );
}*/