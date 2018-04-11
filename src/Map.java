public class Map {

	static Node n1 = new Node("(0,0)", 12);
	static Node n2 = new Node("(0,1)", 10);
	static Node n3 = new Node("(0,2)", 8);
	static Node n4 = new Node("(0,3)", 6);
	static Node n5 = new Node("(0,4)", 4);
	static Node n6 = new Node("(0,5)", 2);
	static Node n7 = new Node("(0,6)", 4);
	static Node n8 = new Node("(1,0)", 10);
	static Node n9 = new Node("(1,1)", Integer.MAX_VALUE);
	static Node n10 = new Node("(1,2)", 6);
	static Node n11 = new Node("(1,3)", 4);
	static Node n12 = new Node("(1,4)", 2);
	static Node n13 = new Node("(1,5)", 0);
	static Node n14 = new Node("(1,6)", 2);
	static Node n15 = new Node("(2,0)", 12);
	static Node n16 = new Node("(2,1)", Integer.MAX_VALUE);
	static Node n17 = new Node("(2,2)", 8);
	static Node n18 = new Node("(2,3)", 6);
	static Node n19 = new Node("(2,4)", 4);
	static Node n20 = new Node("(2,5)", Integer.MAX_VALUE);
	static Node n21 = new Node("(2,6)", Integer.MAX_VALUE);
	static Node n22 = new Node("(3,0)", 14);
	static Node n23 = new Node("(3,1)", 12);
	static Node n24 = new Node("(3,2)", 10);
	static Node n25 = new Node("(3,3)", 8);
	static Node n26 = new Node("(3,4)", 6);
	static Node n27 = new Node("(3,5)", 4);
	static Node n28 = new Node("(3,6)", Integer.MAX_VALUE);
	static Node n29 = new Node("(4,0)", 16);
	static Node n30 = new Node("(4,1)", Integer.MAX_VALUE);
	static Node n31 = new Node("(4,2)", 12);
	static Node n32 = new Node("(4,3)", 10);
	static Node n33 = new Node("(4,4)", Integer.MAX_VALUE);
	static Node n34 = new Node("(4,5)", 6);
	static Node n35 = new Node("(4,6)", Integer.MAX_VALUE);
	static Node n36 = new Node("(5,0)", 18);
	static Node n37 = new Node("(5,1)", Integer.MAX_VALUE);
	static Node n38 = new Node("(5,2)", 14);
	static Node n39 = new Node("(5,3)", 12);
	static Node n40 = new Node("(5,4)", Integer.MAX_VALUE);
	static Node n41 = new Node("(5,5)", 8);
	static Node n42 = new Node("(5,6)", Integer.MAX_VALUE);
	static Node n43 = new Node("(6,0)", 19);
	static Node n44 = new Node("(6,1)", 17);
	static Node n45 = new Node("(6,2)", 15);
	static Node n46 = new Node("(6,3)", 13);
	static Node n47 = new Node("(6,4)", 11);
	static Node n48 = new Node("(6,5)", 9);
	static Node n49 = new Node("(6,6)", 11);
	static Node n50 = new Node("(7,0)", 22);
	static Node n51 = new Node("(7,1)", 20);
	static Node n52 = new Node("(7,2)", 18);
	static Node n53 = new Node("(7,3)", 16);
	static Node n54 = new Node("(7,4)", 14);
	static Node n55 = new Node("(7,5)", 12);
	static Node n56 = new Node("(7,6)", 14);
	static Node n57 = new Node("(8,0)", 24);
	static Node n58 = new Node("(8,1)", 22);
	static Node n59 = new Node("(8,2)", 20);
	static Node n60 = new Node("(8,3)", 18);
	static Node n61 = new Node("(8,4)", 16);
	static Node n62 = new Node("(8,5)", 14);
	static Node n63 = new Node("(8,6)", Integer.MAX_VALUE);
	static Node n64 = new Node("(9,0)", Integer.MAX_VALUE);
	static Node n65 = new Node("(9,1)", Integer.MAX_VALUE);
	static Node n66 = new Node("(9,2)", 22);
	static Node n67 = new Node("(9,3)", 20);
	static Node n68 = new Node("(9,4)", 18);
	static Node n69 = new Node("(9,5)", Integer.MAX_VALUE);
	static Node n70 = new Node("(9,6)", Integer.MAX_VALUE);
	
	// Initialize an array of all the nodes so that we can find specific nodes later based off user input.
	static Node[] nodes = new Node[]{n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32,n33,n34,n35,n36,
			n37,n38,n39,n40,n41,n42,n43,n44,n45,n46,n47,n48,n49,n50,n51,n52,n53,n54,n55,n56,n57,n58,n59,n60,n61,n62,n63,n64,n65,n66,n67,n68,n69,n70};
	
	/**
	 * Takes the x,y coordinates entered by the user and returns the node
	 * that will be used in the A* search method.
	 * 
	 * @param node a string formated to the value property of a node.
	 * @return the node that matches the input node param.
	 */
	public static Node getNode(String node) {
		Node foundNode = null;
		for(Node n : nodes) {
			if (n.value.equals(node) ) {
				return foundNode = n;
			}
		}
		return foundNode;
		
		 
	}

	/**
	 * Initializes the edges of map nodes.
	 */
	public static void setEdgesMap1() {
		n1.adjacencies = new Edge[] { new Edge(n2, 35), new Edge(n8, 35) };

		n2.adjacencies = new Edge[] { new Edge(n1, 35), new Edge(n3, 35) };

		n3.adjacencies = new Edge[] { new Edge(n4, 35), new Edge(n10, 45) };

		n4.adjacencies = new Edge[] { new Edge(n3, 35), new Edge(n5, 35) };

		n5.adjacencies = new Edge[] { new Edge(n6, 35), new Edge(n12, 35) };

		n6.adjacencies = new Edge[] { new Edge(n5, 35), new Edge(n7, 35) };

		n7.adjacencies = new Edge[] { new Edge(n6, 35) };

		n8.adjacencies = new Edge[] { new Edge(n1, 35), new Edge(n15, 35) };

		n9.adjacencies = new Edge[] {};

		n10.adjacencies = new Edge[] { new Edge(n3, 45), new Edge(n17, 45), new Edge(n11, 35) };

		n11.adjacencies = new Edge[] { new Edge(n10, 35), new Edge(n18, 35), new Edge(n12, 35) };

		n12.adjacencies = new Edge[] { new Edge(n11, 35), new Edge(n19, 35), new Edge(n13, 35) };

		n13.adjacencies = new Edge[] { new Edge(n12, 35), new Edge(n14, 35) };

		n14.adjacencies = new Edge[] { new Edge(n13, 35) };

		n15.adjacencies = new Edge[] { new Edge(n8, 35), new Edge(n22, 35) };

		n16.adjacencies = new Edge[] {};

		n17.adjacencies = new Edge[] { new Edge(n10, 45), new Edge(n24, 45) };

		n18.adjacencies = new Edge[] { new Edge(n11, 35), new Edge(n25, 35) };

		n19.adjacencies = new Edge[] { new Edge(n12, 35), new Edge(n26, 35) };

		n20.adjacencies = new Edge[] {};

		n21.adjacencies = new Edge[] {};

		n22.adjacencies = new Edge[] { new Edge(n15, 35), new Edge(n23, 35), new Edge(n29, 35) };

		n23.adjacencies = new Edge[] { new Edge(n22, 35), new Edge(n24, 35) };

		n24.adjacencies = new Edge[] { new Edge(n23, 35), new Edge(n25, 35), new Edge(n17, 45), new Edge(n31, 45) };

		n25.adjacencies = new Edge[] { new Edge(n24, 35), new Edge(n26, 35), new Edge(n18, 45), new Edge(n32, 45) };

		n26.adjacencies = new Edge[] { new Edge(n25, 35), new Edge(n27, 35), new Edge(n19, 45) };

		n27.adjacencies = new Edge[] { new Edge(n26, 35), new Edge(n33, 35) };

		n28.adjacencies = new Edge[] {};

		n29.adjacencies = new Edge[] { new Edge(n22, 35), new Edge(n36, 35) };

		n30.adjacencies = new Edge[] {};

		n31.adjacencies = new Edge[] { new Edge(n24, 45), new Edge(n38, 45) };

		n32.adjacencies = new Edge[] { new Edge(n25, 35), new Edge(n39, 35) };

		n33.adjacencies = new Edge[] {};

		n34.adjacencies = new Edge[] { new Edge(n27, 35), new Edge(n41, 35) };

		n35.adjacencies = new Edge[] {};

		n36.adjacencies = new Edge[] { new Edge(n29, 35), new Edge(n43, 35) };

		n37.adjacencies = new Edge[] {};

		n38.adjacencies = new Edge[] { new Edge(n31, 45), new Edge(n45, 45) };

		n39.adjacencies = new Edge[] { new Edge(n32, 35), new Edge(n46, 35) };

		n40.adjacencies = new Edge[] {};

		n41.adjacencies = new Edge[] { new Edge(n34, 35), new Edge(n48, 35) };

		n42.adjacencies = new Edge[] {};

		n43.adjacencies = new Edge[] { new Edge(n44, 75), new Edge(n50, 35) };

		n44.adjacencies = new Edge[] { new Edge(n43, 75), new Edge(n55, 75) };

		n45.adjacencies = new Edge[] { new Edge(n44, 75), new Edge(n46, 75), new Edge(n38, 45), new Edge(n52, 45) };

		n46.adjacencies = new Edge[] { new Edge(n45, 75), new Edge(n47, 75), new Edge(n39, 35) };

		n47.adjacencies = new Edge[] { new Edge(n46, 75), new Edge(n48, 75), new Edge(n54, 35) };

		n48.adjacencies = new Edge[] { new Edge(n47, 75), new Edge(n49, 75), new Edge(n41, 35), new Edge(n55, 35) };

		n49.adjacencies = new Edge[] { new Edge(n48, 75) };

		n50.adjacencies = new Edge[] { new Edge(n43, 35), new Edge(n51, 35) };

		n51.adjacencies = new Edge[] { new Edge(n50, 35), new Edge(n52, 35) };

		n52.adjacencies = new Edge[] { new Edge(n51, 35), new Edge(n53, 35), new Edge(n45, 45), new Edge(n59, 45) };

		n53.adjacencies = new Edge[] { new Edge(n52, 35), new Edge(n54, 35) };

		n54.adjacencies = new Edge[] { new Edge(n53, 35), new Edge(n55, 35), new Edge(n47, 35), new Edge(n61, 35) };

		n55.adjacencies = new Edge[] { new Edge(n54, 35), new Edge(n56, 35), new Edge(n48, 35), new Edge(n62, 35) };

		n56.adjacencies = new Edge[] { new Edge(n55, 35) };

		n57.adjacencies = new Edge[] { new Edge(n58, 55) };

		n58.adjacencies = new Edge[] { new Edge(n57, 55), new Edge(n59, 55) };

		n59.adjacencies = new Edge[] { new Edge(n58, 55), new Edge(n60, 55), new Edge(n52, 45), new Edge(n66, 45) };

		n60.adjacencies = new Edge[] { new Edge(n59, 55), new Edge(n61, 55) };

		n61.adjacencies = new Edge[] { new Edge(n60, 55), new Edge(n62, 55), new Edge(n54, 35), new Edge(n68, 35) };

		n62.adjacencies = new Edge[] { new Edge(n61, 55), new Edge(n55, 35) };

		n63.adjacencies = new Edge[] {};

		n64.adjacencies = new Edge[] {};

		n65.adjacencies = new Edge[] {};

		n66.adjacencies = new Edge[] { new Edge(n59, 45), new Edge(n67, 35) };

		n67.adjacencies = new Edge[] { new Edge(n66, 35), new Edge(n68, 35) };

		n68.adjacencies = new Edge[] { new Edge(n67, 35), new Edge(n61, 35) };

		n69.adjacencies = new Edge[] {};

		n70.adjacencies = new Edge[] {};
	}
}
