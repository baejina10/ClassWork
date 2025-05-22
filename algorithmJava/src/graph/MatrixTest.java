package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 5 3
 * 1 2
 * 2 3
 * 3 1
 */

//인접행렬을 이용해서 그래프 표현
public class MatrixTest {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//노드의 갯수와 엣지가 표시된 정보를 읽기
		String[] line = br.readLine().split(" ");
		int nodeCount = Integer.parseInt(line[0]);
		int edgeCount = Integer.parseInt(line[1]);
		//노드가 1부터 시작하므로 노드와 엣지정보를 담은 2차원배열을 1개씩 더 만들어준다.
		//그래프의 2번 노드와 3번 노드의 관계를 알고 싶다.(엣지유무)
		//=> 이차원배열[2][3]
		int[][] matrixArr = new int[nodeCount+1][edgeCount+1];
		for(int i=1;i<=edgeCount;i++) {
			String[] edgeline = br.readLine().split(" ");
			int node1 = Integer.parseInt(edgeline[0]);
			int node2 = Integer.parseInt(edgeline[1]);
			matrixArr[node1][node2] = 1;//방향그래프
			//무방향
			//matrixArr[node2][node2] = 1;
		
		}
		show(matrixArr);
	}
	public static void show(int[][] matrix) {
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
