#include<stdio.h>




/*
void main()
{
int a;
printf("��һ�����֣���-1Ϊ����")��
while (scanf_s("%d", &a), a != -1 )   //���ʽ��ȡ���һ�����ʽ�Ľ������֮ǰ�ı��ʽҲ�����С�
{
printf("a= %d", a);
}
}




/*               //�� 4 λ���ϣ�B��Ϊ 2��N�η������֣������������A��ߵ�����A   ��  B����С��������   �� 5��8��9��12
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
// �ж�һ��ʮ�������Ķ������м���һ
int Count(unsigned char value)
{
int count = 0;
while (value)
{
value = value &(value - 1);//(��Ч������1ѭ������) ���Ч����switch case���� ���� �б�,���㡣
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
// �ж�һ��ʮ�������Ķ������м���һ
int Count(unsigned char value)
{
int count = 0;
while (value)
{
if (value % 2 == 1)  ����ȡ�����λ�� if (value & 00x0) (���롱�ж���ĩλ�Ƿ�Ϊ��)
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



//����򽻻����� 21����
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