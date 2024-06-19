package histogram;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.statistics.HistogramDataset;

public class Histogram extends ApplicationFrame {
    public Histogram(String title) {
        super(title);
        double[] values = {1,1,1,1,1,1,1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Histogram", values, 10);

        JFreeChart histogram = ChartFactory.createHistogram(
            "Histograma",
            "Valores",
            "Frequencia",
            dataset,
            PlotOrientation.VERTICAL,
            false,
            true,
            false
        );

        XYPlot plot = (XYPlot) histogram.getPlot();
        plot.setDomainPannable(true);
        plot.setRangePannable(true);

        ChartPanel chartPanel = new ChartPanel(histogram);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        Histogram demo = new Histogram("Histograma exemplo");
        demo.pack();
        demo.setVisible(true);
    }
}
