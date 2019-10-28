package swingBar;

import javax.swing.*;
import java.awt.*;

public class BarChart extends JFrame{

    public BarChart()
    {
        super("BarChart");
        setSize(1000,700);
    }

    public void paint(Graphics graph)
    {
        super.paint(graph);

        int arr[] = {20,200,800,1000};
        int yAxis = 500;

        graph.setColor(Color.BLACK);

        graph.drawString("Population Comparison", 400,100);

        graph.drawLine(100,600,800,600);
        graph.drawString("X", 820,600);
        graph.drawLine(100,600, 100, 100);
        graph.drawString("Y",100,80);

        int yRange = 1;
        for (int i = 0; i < yAxis; i += 30)
        {
            graph.drawLine(100,600-i,110,600-i);
            String scale = "";
            scale += yRange * 100;
            graph.drawString(scale,75,600-i);
            yRange++;
        }

        for (int i = 0; i < arr.length; i++)
        {
            switch(i){
                case 0: graph.setColor(Color.RED);
                    break;
                case 1: graph.setColor(Color.YELLOW);
                    break;
                case 2: graph.setColor(Color.BLUE);
                    break;
                case 3: graph.setColor(Color.GREEN);
                    break;
            }
            for (int j = 0; j < arr[i]/4; j++)
            {
                graph.drawLine(150*(i+1),600-j, 150*(i+1)+100, 600-j);
            }

            graph.setColor(Color.BLACK);
            graph.drawRect(150*(i+1),600-arr[i]/4,100,arr[i]/4);
            String number = "";
            number += arr[i];
            graph.drawString(number,150*(i+1)+40,625);
        }


    }

    public static void main(String[] args) {
        BarChart window = new BarChart();
        window.setVisible(true);
    }






}
