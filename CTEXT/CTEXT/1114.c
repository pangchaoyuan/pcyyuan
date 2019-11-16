#include<stdio.h>




/*
void main()
{
int a;
printf("给一个数字，以-1为结束")：
while (scanf_s("%d", &a), a != -1 )   //表达式，取最后一个表达式的结果，但之前的表达式也会运行。
{
printf("a= %d", a);
}
}




/*               //若 4 位置上（B）为 2的N次方的数字，将输入的数字A提高到大于A   的  B的最小的整数倍   如 5到8，9到12
#define ALIGN 4
int fun(int n)
{
return ((n + ALIGN - 1)&~(ALIGN - 1));
}

void main()
{
int n;
scanf_s("%d", &n);
int result = fun(n);
printf("%d\n", result);
}




/*
// 判断一个十进制数的二进制有几个一
int Count(unsigned char value)
{
int count = 0;
while (value)
{
value = value &(value - 1);//(高效，几个1循环几次) 最高效是拿switch case或者 数组 列表,手算。
count++;
}
return count;
}


void main()
{
unsigned char value = 153535235;
int result = Count(value);
printf("count = %d\n", result);
}




/*
// 判断一个十进制数的二进制有几个一
int Count(unsigned char value)
{
int count = 0;
while (value)
{
if (value % 2 == 1)  （用取余和移位） if (value & 00x0) (“与”判断最末位是否为真)
count++;
value = value >> 1;
}
return count;
}


void main()
{
unsigned char value = 153535235;
int result = Count(value);
printf("count = %d\n", result);
}
*/



//三异或交换数字 21亿内
/*
void main()
{
int a = 3558875;
int b = 523525252;
a = a^b;
b = a^b;
a = a^b;
printf("a=%d  b=%d", a, b);
}*/