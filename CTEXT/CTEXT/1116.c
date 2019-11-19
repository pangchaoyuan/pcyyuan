#include<stdio.h> 

void Find(int ar[], int n)//非排序
{
	int i;
	int j;
	int c[100],b[100];

	for (i = 0; i < n; ++i)
	{
		c[i] = 0;
		for (j = 1; j < n; ++j)
		{ 
			if (ar[i] == ar[j])
				c[i]++;
		}
	}//将数组ar中的每个数字的出现次数赋值到对应位置的c数组
	b[0] = ar[0];	
	for (i = 1; i<n; ++i)
	{
		j = 0;
		while (b[j] != a[i])
		{
			j++;
		}
		break;
    }
}

void main()
{
	int ar[] = {1,2,4,5,6,7,7,7,7,7,7,7,7};
	int n = sizeof(ar) / sizeof(int);
	Find(ar, n);
}


/*  //找一个数组里的数，找到返回下标，妹找到说妹找到
int find(int ar[], int n,int a)
{
	for (int i = 0; i < n; ++i)
	{
		if (ar[i] == a)
			return i;
	}
	return -1;
}


void main()
{
	int ar[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 15};

	int a;
	scanf("%d", &a);
	int n = sizeof(ar) / sizeof(int);
	int c=find(ar, n,a);
	if(c !=-1)
		printf("所寻找数字下标为%d", c);
	else
	    printf("未找到\n");
	return 0;
		
}*/