package Graph;

import java.util.HashSet;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Graph g=new Graph(3);
		Graph g = new Graph(7);

		g.addEdge(1, 4, 7);
		g.addEdge(4, 5, 2);
		g.addEdge(5, 7, 11);
		g.addEdge(7, 6, 9);
		g.addEdge(6, 5, 8);
		g.addEdge(4, 3, 3);
		g.addEdge(3, 2, 4);
		g.addEdge(1, 2, 5);
//		g.prims();
		g.dijkstra();
//		System.out.println(g.isCyclic());
//		System.out.println(g.hasPath(1, 4,new HashSet<>()));
//		g.removeEdge(4, 5);
//		g.display();
//		System.out.println(g.hasPath(3,6,new HashSet<>()));
		
//		g.printAll_paths(1 ,2 ,new HashSet<>() , "");
//		System.out.println(g.dfs(4, 5));

//		System.out.println(g.No_of_edges());
		//g.removeEdge(4, 5);
		//g.removevertex(4);
//		g.display();
		
	}

}
