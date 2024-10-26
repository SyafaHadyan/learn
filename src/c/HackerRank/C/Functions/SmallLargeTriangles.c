#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

double calculateArea(triangle tr)
{
    double area = sqrt((tr.a * tr.b * tr.c) / 2);
    printf("%.3f",area * (area - tr.a) * (area - tr.b) * (area - tr.c));
    return area * (area - tr.a) * (area - tr.b) * (area - tr.c);
}

//int sort()

void sort_by_area(triangle* tr, int n)
{
	/**
	* Sort an array a of the length n
	*/
    for (int i = 0; i < n; i++)
    {
        /* code */
    }
    //qsort(tr, n, sizeof(triangle));
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}