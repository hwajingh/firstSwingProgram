package Triangle;

import javax.swing.*;
import java.awt.*;

    public class Triangle extends JPanel {
        private static int LEVEL;

        public Triangle(int level) {
            LEVEL = level;
        }

        @Override
        public void paintComponent(Graphics Screen) {
            super.paintComponent(Screen);
            Point top = new Point(250, 50);
            Point left = new Point(50, 450);
            Point right = new Point(450, 450);
            drawTri(Screen, LEVEL, top, left, right);
        }

        public static void drawTri(Graphics graph, int level, Point top, Point left, Point right) {
            if (level < 0) {
                return;
            }

            graph.setColor(Color.BLACK);

            Polygon Tri = new Polygon();
            Tri.addPoint(top.x, top.y);
            Tri.addPoint(left.x, left.y);
            Tri.addPoint(right.x, right.y);

            graph.drawPolygon(Tri);

            Point TL = MidPoint(top, left);
            Point LR = MidPoint(left, right);
            Point RT = MidPoint(right, top);

            drawTri(graph, level - 1, top, TL, RT);
            drawTri(graph, level - 1, TL, left, LR);
            drawTri(graph, level - 1, RT, LR, right);
        }

        public static Point MidPoint(Point p1, Point p2) {
            return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        }
    }





