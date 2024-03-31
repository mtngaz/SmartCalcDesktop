package edu.school.smartcalc.view;

import edu.school.smartcalc.enity.Graph;
import edu.school.smartcalc.model.ModelCalculator;
import edu.school.smartcalc.presenter.SmartCalcPresenter;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class GraphView {

    public void graph(Graph graph) {
        ModelCalculator modelCalculator = new ModelCalculator();
        Stage stage = new Stage();

        double xMax = Double.parseDouble(graph.getValueXMax().getText());
        double xMin = Double.parseDouble(graph.getValueXMin().getText());
        double yMax = Double.parseDouble(graph.getValueYMax().getText());
        double yMin = Double.parseDouble(graph.getValueYMin().getText());
        double x;

        final NumberAxis xAxis = new NumberAxis(xMin, xMax, 1);
        final NumberAxis yAxis = new NumberAxis(yMin, yMax, 1);
        xAxis.setLabel("Ось x");
        yAxis.setLabel("Ось y");
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("График функции");
        XYChart.Series series = new XYChart.Series();
        series.setName(graph.getInput().getText());
        for (double i = xMin; i <= xMax; i += 0.1) {
            if (graph.getXInput().getText().isEmpty()) {
                x = i;
            } else {
                x = Double.parseDouble(graph.getXInput().getText());
            }
            series.getData().add(new XYChart.Data<>(i, modelCalculator.calcExpr(graph.getInput().getText(), x)));
        }
        lineChart.getData().add(series);

        lineChart.setPrefSize(600, 600);
        Scene scene = new Scene(lineChart);

        stage.setScene(scene);
        stage.setTitle("Graph");
        stage.show();
    }
}
