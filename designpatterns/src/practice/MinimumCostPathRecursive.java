package practice;

public class MinimumCostPathRecursive {
	private static int min(int x, int y,int z){
	
		if(x<y)
			return x<z ? x:z;
		else
			return y<z ? y:z;
	}
		
private  static int minCost(int costMat[][],int m,int n){
	int totalCost[][] = new int[m+1][n+1];
	totalCost[0][0] = costMat[0][0]; 
	for(int i=1;i<=m;i++){
		totalCost[0][i] = totalCost[0][i-1]+costMat[0][i];
	}
	for(int j=1;j<=n;j++){
		totalCost[j][0] = totalCost[j-1][0]+costMat[j][0] ;
	}
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
			totalCost[i][j] = min(totalCost[i-1][j-1],totalCost[i-1][j],totalCost[i][j-1])+costMat[i][j]; 
		}
	}
	return totalCost[m][n];
		
	}
public static void main(String args[]){
	int cost[][] = {{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}};
	System.out.println(minCost(cost,2,2));
}
}
