
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	// h scores is the straight-line distance from the current node to the
	// destination node
	public static void main(String[] args) {
		int xCoord = 0;
		int yCoord = 0;
		boolean validNode = false;
		Node startNode = null;
		Node destNode = null;

		// initialize the graph

		// initialize the edges
		Map.setEdgesMap1();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your starting location on the map and your distination. \n");

		while (!validNode) {
			System.out.print("Choose a number between 0 and 9 for starting x coordinate: ");

			xCoord = Main.validateCoordinate(input.nextInt(), input, "x");

			System.out.print("\nChoose a number between 0 and 6 for starting y coordinate: ");

			yCoord = Main.validateCoordinate(input.nextInt(), input, "y");

			startNode = Map.getNode("(" + Integer.toString(xCoord) + "," + Integer.toString(yCoord) + ")");
			
			// Check if the node has any neighbors. If not, it is not an existing waypoint on the map.
			validNode = Main.validNode(startNode);
			if (!validNode) {
				System.out
						.println("The starting position you entered does not exist on a valid road. Please try again.");
			}
		}
		System.out.println("Starting position set: " + startNode);

		validNode = false;
		while (!validNode) {
			System.out.print("\nChoose a number between 0 and 9 for destination x coordinate: ");

			xCoord = Main.validateCoordinate(input.nextInt(), input, "x");

			System.out.print("\nChoose a number between 0 and 6 for destination y coordinate: ");

			yCoord = Main.validateCoordinate(input.nextInt(), input, "y");

			destNode = Map.getNode("(" + Integer.toString(xCoord) + "," + Integer.toString(yCoord) + ")");
			validNode = Main.validNode(destNode);
			
			// Check if the node has any neighbors. If not, it is not an existing waypoint on the map.
			if (!validNode) {
				System.out
						.println("The starting position you entered does not exist on a valid road. Please try again.");
			}
			
			// Check if destination is the same as the start position.
			if (destNode.equals(startNode)){
				System.out.println("The destination cannot be the same as the starting position. Please try again.");
			}
		}
		
		System.out.println("Destination position set: " + destNode);

		AstarSearch.aStarSearch(startNode, destNode);

		List<Node> path = Path.printPath(destNode);

		System.out.println("Path: " + path);
	}

	/**
	 * Check that the coordinates entered for the x and y positions fall
	 * within the given map. If they do not, keep asking the user for a
	 * a valid input.
	 * 
	 * @param i the number for the x or y coordinate.
	 * @param input a scanner object passed into the method.
	 * @param xOry a string to determine whether the method should use x coordinate range or y coordinate range.
	 * @return the number for the x or y coordinate.
	 */
	public static int validateCoordinate(int i, Scanner input, String xOry) {
		int rtnInt = i;

		// x coordinates should be between 0 and 9
		if (xOry.equals("x")) {
			while (i < 0 || i > 9) {
				System.out.print("Invalid input. Please enter a number for the x coordinate between 0 and 9.");
				rtnInt = i = input.nextInt();
			}
		}

		// y coordinates should be between 0 and 6
		if (xOry.equals("y")) {
			while (i < 0 || i > 6) {
				System.out.print("Invalid input. Please enter a number for the y coordinate between 0 and 6.");
				rtnInt = i = input.nextInt();
			}
		}

		return rtnInt;
	}

	/**
	 * Check whether the node exists on the map or not.
	 * 
	 * @param node the given node based on user input.
	 * @return a boolean.
	 */
	public static boolean validNode(Node node) {
		if (node.adjacencies.length == 0) {
			return false;
		} else
			return true;
	}
}
