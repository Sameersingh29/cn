package exp5;
import java.util.Scanner;
public class bellam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of vertices:");
		int num , source;
		Scanner sc = new Scanner (System.in);
		num=sc.nextInt();
		int adj[][]=new int [num][num];
		System.out.println("Enter vertices:");

		for (int i=0;i<num;i++)
		{
			for (int j=0;j<num;j++)
			{
				System.out.print(i+"-"+j+":");
				adj[i][j]=sc.nextInt();
			}	
		}
		System.out.println("Enter source node:");
		source=sc.nextInt();
		belford(adj,num,source);

	}

	private static void belford(int[][] adj, int num, int source) {
		// TODO Auto-generated method stub
		int d[]= new int[num];
		for (int i=0;i<num;i++) {
			d[i]=999;
		}
		d[source]=0;
		int i,u,v;
		for(i=0;i<num-1;i++)
		{
			for (u=0;u<num;u++)
			{
				for(v=0;v<num;v++)
				{
					if(d[u]!=999) {
						if(d[v]>d[u]+adj[u][v]) {
							d[v]=d[u]+adj[u][v];
						}
					}
				}
			}
		}
		for (i=0;i<num;i++)
		{
			System.out.println("Distance of source"+source + "to"+ i+ "is:"+d[i]);
		}
		
		
	}

}
