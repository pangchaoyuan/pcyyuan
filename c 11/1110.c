#include<stdio.h>
#include<stdbool.h>
#include<windows.h>
/*
void Bubblesort1(int ar[],int n)//冒泡排序数组降序
{
int temp;
for (int i = 0; i < n; ++i)
{
for (int j = 0; j < n - i - 1; ++j)
{
if (ar[j]<ar[j + 1])
{

temp = ar[j];
ar[j] = ar[j + 1];
ar[j + 1] = temp;
}
}
}
}
void printfArray(int ar[], int n)
{
for (int i = 0; i < n; ++i)
{
printf("%d   ", ar[i]);
}
}
void main()
{
int ar[] = { 312, 34, 2, 125, 512, 3, 125, 65, 4 };
int n = sizeof(ar) / sizeof(int);
Bubblesort1(ar,n);
printfArray(ar, n);
}
*/

/*
//S型矩阵
#define ROW 4
#define COL 4
void main()
{
int ar[ROW][COL] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

for (int i = 0; i < ROW; ++i)
{
if (i == 0 || i % 2 == 0)
{
for (int j = 0; j < COL; ++j)
{
printf(" %d  ", ar[i][j]);Sleep(500);
}
}
else
{
for (int j = COL-1; j > -1; --j)
{
printf(" %d  ", ar[i][j]);Sleep(500);
}
}
printf("\n");

}
}

/*
void Bubblesort(ar[],n)//冒泡排序数组升序
{
int temp;
for (int i = 0; i < n; ++i)
{
for (int j = 0; j < n - i - 1; ++j)
{
if (ar[j]>ar[j + 1])
{

temp = ar[j];
ar[j] = ar[j + 1];
ar[j + 1] = temp;
}
}
}
}


/*矩阵
void main()
{
int ar[][3] = { 312, 312, 3123, 123, 123, 123, 123, 123, 4, 124, 12, 3, 123, 12, 123 };

for (int i = 0; i < 5; ++i)
{
for (int j = 0; j < 5; ++j)
{
printf("%d                  ", ar[i][j]);
}
printf("\n");
}
}



/*转置数组
void reverse( int ar[],int n)
{
int a;
for (int i = 0; i < n/2; ++i)
{

a = ar[n - i - 1];
ar[n - i - 1] = ar[i];
ar[i] = a;
}
}

void main()
{
int ar[] = { 1251, 2, 412, 5, 32, 34, 6, 4236, 2346, 23,6 };
int n = sizeof(ar) / sizeof(int);
reverse(ar, n);
for (int b = 0; b < n;
++b)
{

printf("%d\n", ar[b]);
}
}



/*最大值
int Max(int ar[], int n)
{
int max;
for (i = 1; i < n; i++)
{
if (a[i] < a[i + 1])
max = a[i + 1];
max = a[i];
}
return max;

}


void main()
{
int ar[] = { 12, 412, 412, 5, 15, 123, 124, 1, 51 }
n = sizeof(ar)\sinzeof(int);
max = Max(, );
printf ....
}


/* 字母
void main()
{
char ar[10];
for (int i = 0; i < 5; i++)
{
ar[i] = 'g' + i;
}
ar[5] = '\0';
printf("%s\n", ar);
}

/* 斐波那契
size_t Fib(int n)
{
size_t c;
if (n < 3)
return 1;
else{
size_t a = 1, b = 1, i = 2;
while ( i < n)
{
c = a + b;
a = b;
b = c;
i++;
}
}
return c;

}

void main()
{
int n;
while (1)
{
printf("input n:>");
scanf_s("%d", &n);
size_t result = Fib(n);
printf("第%d项的值为  %u\n", n, result);
}

}*/