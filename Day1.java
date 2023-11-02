HackEarth problem : Number of Steps

url=https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/



import java.util.*;
public class Main{
static void minimumSteps(int ar1[], int ar2[], int n)
{

int ans = 0;
boolean flag = true;
while (Arrays.stream(ar1).min().getAsInt() > -1)
{
	int a = Arrays.stream(ar1).min().getAsInt();
	for(int i = 0; i < n; i++)
	{
	if (ar1[i] != a)
	{
		ar1[i] -= ar2[i];
		ans += 1;
	}
	}

	HashSet<Integer> s1 = new HashSet<>();
	for(int i = 0; i < n; i++) 
	{
	s1.add(ar1[i]);
	}
	if (s1.size() == 1)
	{
	flag = false;
	System.out.print(ans + "\n");
	break;
	}
}

if (flag)
{
	System.out.print(-1 + "\n");
}
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

int n = sc.nextInt();
int ar1[] = new int[n];
int ar2[] = new int[n];
for(int i=0;i<n;i++)
   ar1[i]=sc.nextInt();
for(int i=0;i<n;i++)
   ar2[i]=sc.nextInt();
minimumSteps(ar1, ar2, n);
}
}

I/p :
5
5 7 10 5 15
2 2 1 3 5

O/P:
8
