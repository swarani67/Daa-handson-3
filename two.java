import org.knowm.xchart.XYChart;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.knowm.xchart.SwingWrapper;

public class Main {

    public static void main(String[] args) {
        List<Integer> n_v = new ArrayList<>();
        List<Double> q_v = new ArrayList<>();

        IntStream.rangeClosed(1, 65).forEach(n -> {
            n_v.add(n);
            q_v.add(Math.pow(n, 2));
        });

        XYChart chart = new XYChart(700, 500);
        chart.addSeries("Quadratic_eq", n_v, q_v);

        chart.setTitle("The Quadratic Equation of n square");
        chart.setXAxisTitle("values of n");
        chart.setYAxisTitle("square of n");


        new SwingWrapper<>(chart).displayChart();
    }
}
