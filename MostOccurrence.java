package string;

public class MostOccurrence
{

	public static void main(String[] args) 
	{
		/*
		String s="jaMocha Tech PVT LTD";
		char c[]=s.toCharArray();
		int max=0,cnt;
		char temp=0;
		for(int i=0;i<c.length;i++)
		{
			cnt=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]!=' ')
				{
					if(c[i]==c[j])
					{
						cnt++;
					}
				}
			}
			if(cnt>max)
			{
				max=cnt;
				temp=c[i];
			}
		}
		System.out.println(temp);
		*/
		
		
		String s="jamochatechpvt";
		char c[]=s.toCharArray();
		int a[]=new int[256];
		int n,max=0,temp=0;
		for(int i=0;i<c.length;i++)
		{
			n=c[i];
			a[n]=a[n]+1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(i!=' ')
			{
				if(a[i]>max)
				{
					max=a[i];
					temp=i;
				}
			}
			
		}
		System.out.println((char)temp);
		//System.out.println((char)temp+" "+max);
		
		
	}

}
