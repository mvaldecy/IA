package HistogramaTeste;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class HistogramExample extends ApplicationFrame {
    public HistogramExample(String title) {
        super(title);
        double[] values = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Histogram", values, 5);
        
        JFreeChart histogram = ChartFactory.createHistogram(
                "Histograma",
                "Valores",
                "Frequência",
                dataset,
                PlotOrientation.VERTICAL,
                true,
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
        HistogramExample demo = new HistogramExample("Histograma com JFreeChart");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
