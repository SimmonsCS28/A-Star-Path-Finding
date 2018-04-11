import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Path {
	
	/**
	 * Print the waypoints of the path taken to get to the destination node.
	 * 
	 * @param target the destination set by the user
	 * @return
	 */
	public static List<Node> printPath(Node target) {
		List<Node> path = new ArrayList<Node>();

		for (Node node = target; node != null; node = node.parent) {
			path.add(node);
		}

		Collections.reverse(path);

		return path;
	}
}
