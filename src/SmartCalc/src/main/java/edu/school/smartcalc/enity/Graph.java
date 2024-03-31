package edu.school.smartcalc.enity;

import javafx.scene.control.TextField;

public class Graph {
    private final TextField valueXMax;
    private final TextField valueXMin;
    private final TextField valueYMax;
    private final TextField valueYMin;
    private final TextField input;
    private final TextField xInput;

    public Graph(TextField valueXMax, TextField valueXMin, TextField valueYMax, TextField valueYMin, TextField input, TextField xInput) {
        this.valueXMax = valueXMax;
        this.valueXMin = valueXMin;
        this.valueYMax = valueYMax;
        this.valueYMin = valueYMin;
        this.input = input;
        this.xInput = xInput;
    }

    public TextField getValueXMax() {
        return valueXMax;
    }

    public TextField getValueXMin() {
        return valueXMin;
    }

    public TextField getValueYMax() {
        return valueYMax;
    }

    public TextField getValueYMin() {
        return valueYMin;
    }

    public TextField getInput() {
        return input;
    }

    public TextField getXInput() {
        return xInput;
    }
}
