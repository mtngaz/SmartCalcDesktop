package edu.school.smartcalc.presenter;

import edu.school.smartcalc.model.ModelCalculator;
import edu.school.smartcalc.view.SmartCalcView;

public class SmartCalcPresenter {
    ModelCalculator modelCalculator;
    SmartCalcView smartCalcView;

    public SmartCalcPresenter(SmartCalcView smartCalcView) {
        this.smartCalcView = smartCalcView;
    }

    public String evalExpress() {
        modelCalculator = new ModelCalculator();
        double xNum = 0;
        if (!smartCalcView.getXInput().getText().isEmpty()) {
            xNum = Double.parseDouble(smartCalcView.getXInput().getText());
        }
        String expr = smartCalcView.getInput().getText();
        if (modelCalculator.validator(expr, xNum) == 1) {
            return "Incorrect input";
        } else {
            double result = modelCalculator.calcExpr(expr.replace(".", ","), xNum);
            return String.format("%.6f", result);
        }
    }
}
