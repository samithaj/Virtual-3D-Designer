/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.MultiColorScatter;

/**
 *
 * @author Amila
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coord3d[] points = new Coord3d[5];
        points[0] = new Coord3d(1, 1, 1);
        points[1] = new Coord3d(2, 2, 2);
        points[2] = new Coord3d(3, 3, 3);
        points[3] = new Coord3d(4, 4, 4);
        points[4] = new Coord3d(5, 5, 5);

        
        
        MultiColorScatter scatter = new MultiColorScatter( points, new ColorMapper( new ColorMapRainbow(), 0, 0 ) );
        scatter.setWidth(4.5f);
        //Scatter scatter = new Scatter(points, colors);
        Chart chart = new Chart();
        chart.getAxeLayout().setMainColor(Color.RED);
        chart.getView().setBackgroundColor(Color.WHITE);
        chart.getScene().add(scatter);
        ChartLauncher.openChart(chart);
    }
}
