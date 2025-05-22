package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 입력데이터를 읽어서 인접행렬을 만든 후 셋팅
 */
public class Baek_1260_DFS_BFS {
	private static int n;//노드갯수
	private static int m;//엣지정보갯수
	private static boolean[] visitesNode;//방문했던 노드 정보를 기록하는 배열
	private static int[][] matrix;//노드와 엣지에 대한 정보를 담고 있는 인접행렬
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//노드의 갯수와 엣지가 표시된 정보를 읽기
		String[] line = br.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		m = Integer.parseInt(line[1]);
		visitesNode = new boolean[n+1];
		matrix = new int[n+1][n+1];
		for(int i=0;i<m;i++) {
			String[] edgeline = br.readLine().split(" ");
			int start = Integer.parseInt(edgeline[0]);
			int end = Integer.parseInt(edgeline[1]);
			matrix[start][end] = 1;//방향그래프
			matrix[end][start] = 1;
		}
		//show(matrix);
		dfs(1);
	}
	public static void show(int[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	//재귀를 이용해서 깊이우선 탐색
	public static void dfs(int node) {
		visitesNode[node]=true;//방문기록남기기
		System.out.print(node+" ");
		//모든 노드의 번호를 다 탐색해야 하므로
		for(int i=1;i<=n;i++) {
			//연결되어 있는 엣지정보가 있고 방문한 적이 없으면 방문하도록 처리
			if(matrix[node][i]==1 && !visitesNode[i]) {
				//연결된 노드를 계속 타고 들어가면서 탐색
				dfs(i);
			}
		}
	}
	public static void bfs(int node) {
		
	}

}




