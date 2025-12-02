package coding101days.day23;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    TreeNode left, right;
    // Constructor and other methods
    public TreeNode(int value){
        this.value = value;
    }
}

public class TreeVisualizer extends JPanel {
    private TreeNode root;
    private List<Point> nodePositions = new ArrayList<>(); // Store calculated positions

    public TreeVisualizer(TreeNode root) {
        this.root = root;
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        nodePositions.clear(); // Clear old positions
        drawTree(g2d, root, getWidth() / 2, 50, getWidth() / 4); // Start drawing from root

        // Draw nodes and connections based on nodePositions
        // ... (Logic to iterate nodePositions and draw circles/text)
    }

    private void drawTree(Graphics2D g2d, TreeNode node, int x, int y, int xOffset) {
        if (node == null) return;

        // Store node position
        nodePositions.add(new Point(x, y));

        // Draw node (circle and text)
        g2d.drawOval(x - 15, y - 15, 30, 30);
        g2d.drawString(String.valueOf(node.value), x - 5, y + 5);

        // Recursively draw children and connect them
        if (node.left != null) {
            int childX = x - xOffset;
            int childY = y + 70;
            g2d.drawLine(x, y + 15, childX, childY - 15); // Connect to child
            drawTree(g2d, node.left, childX, childY, xOffset / 2);
        }
        if (node.right != null) {
            int childX = x + xOffset;
            int childY = y + 70;
            g2d.drawLine(x, y + 15, childX, childY - 15); // Connect to child
            drawTree(g2d, node.right, childX, childY, xOffset / 2);
        }
    }

    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);

        JFrame frame = new JFrame("Tree Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TreeVisualizer(root));
        frame.pack();
        frame.setVisible(true);
    }
}
