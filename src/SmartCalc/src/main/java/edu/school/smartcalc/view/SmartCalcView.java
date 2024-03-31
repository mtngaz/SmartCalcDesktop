package edu.school.smartcalc.view;

import edu.school.smartcalc.enity.Graph;
import edu.school.smartcalc.presenter.SmartCalcPresenter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SmartCalcView {

    private SmartCalcPresenter smartCalcPresenter;

    @FXML
    private Button ac;

    @FXML
    private Button ac1;

    @FXML
    private Button acos;

    @FXML
    private Button asin;

    @FXML
    private Button atan;

    @FXML
    private Button bracketL;

    @FXML
    private Button bracketR;

    @FXML
    private Button cos;

    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button graph;


    @FXML
    private TextField input;

    @FXML
    private Button ln;

    @FXML
    private Button log;

    @FXML
    private Button minus;

    @FXML
    private Button mod;

    @FXML
    private Button equal;

    @FXML
    private Button mult;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button pow;

    @FXML
    private Button seven;

    @FXML
    private Button sin;

    @FXML
    private Button six;

    @FXML
    private Button sqrt;

    @FXML
    private Button tan;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private TextField valueXMax;

    @FXML
    private TextField valueXMin;

    @FXML
    private TextField valueYMax;

    @FXML
    private TextField valueYMin;

    @FXML
    private Button x;

    @FXML
    private TextField xInput;

    @FXML
    private Button zero;

    @FXML
    void onButtonAC(ActionEvent event) {
        input.setText("");
    }

    @FXML
    void onButtonAC1(ActionEvent event) {
        StringBuilder stringBuilder = new StringBuilder(input.getText());
        stringBuilder.deleteCharAt(input.getText().length() - 1);
        input.setText(stringBuilder.toString());
    }

    @FXML
    void onButtonAcos(ActionEvent event) {
        input.setText(input.getText() + acos.getText());
    }

    @FXML
    void onButtonAsin(ActionEvent event) {
        input.setText(input.getText() + asin.getText());
    }

    @FXML
    void onButtonAtan(ActionEvent event) {
        input.setText(input.getText() + atan.getText());
    }

    @FXML
    void onButtonBracketL(ActionEvent event) {
        input.setText(input.getText() + bracketL.getText());
    }

    @FXML
    void onButtonBracketR(ActionEvent event) {
        input.setText(input.getText() + bracketR.getText());
    }

    @FXML
    void onButtonCos(ActionEvent event) {
        input.setText(input.getText() + cos.getText());
    }

    @FXML
    void onButtonClear(ActionEvent event) {

    }

    @FXML
    void onButtonDiv(ActionEvent event) {
        input.setText(input.getText() + div.getText());
    }

    @FXML
    void onButtonEight(ActionEvent event) {
        input.setText(input.getText() + eight.getText());
    }

    @FXML
    void onButtonEquals(ActionEvent event) {
        smartCalcPresenter = new SmartCalcPresenter(this);
//        HistoryExpressView.write(input);
        input.setText(smartCalcPresenter.evalExpress());
    }

    @FXML
    void onButtonFive(ActionEvent event) {
        input.setText(input.getText() + five.getText());
    }

    @FXML
    void onButtonFour(ActionEvent event) {
        input.setText(input.getText() + four.getText());
    }

    @FXML
    void onButtonGraph(ActionEvent event) throws IOException {
        GraphView graphApplication = new GraphView();
        graphApplication.graph(new Graph(valueXMax, valueXMin, valueYMax, valueYMin, input, xInput));
    }

    @FXML
    void onButtonHistory(ActionEvent event) {
//        HistoryExpressView.historyRead();
    }

    @FXML
    void onButtonLn(ActionEvent event) {
        input.setText(input.getText() + ln.getText());
    }

    @FXML
    void onButtonLog(ActionEvent event) {
        input.setText(input.getText() + log.getText());
    }

    @FXML
    void onButtonMinus(ActionEvent event) {
        input.setText(input.getText() + minus.getText());
    }

    @FXML
    void onButtonMod(ActionEvent event) {
        input.setText(input.getText() + mod.getText());
    }

    @FXML
    void onButtonMult(ActionEvent event) {
        input.setText(input.getText() + mult.getText());
    }

    @FXML
    void onButtonNine(ActionEvent event) {
        input.setText(input.getText() + nine.getText());
    }

    @FXML
    void onButtonOne(ActionEvent event) {
        input.setText(input.getText() + one.getText());
    }

    @FXML
    void onButtonPlus(ActionEvent event) {
        input.setText(input.getText() + plus.getText());
    }

    @FXML
    void onButtonPoint(ActionEvent event) {
        input.setText(input.getText() + point.getText());
    }

    @FXML
    void onButtonPow(ActionEvent event) {
        input.setText(input.getText() + pow.getText());
    }

    @FXML
    void onButtonSeven(ActionEvent event) {
        input.setText(input.getText() + seven.getText());
    }

    @FXML
    void onButtonSin(ActionEvent event) {
        input.setText(input.getText() + sin.getText());
    }

    @FXML
    void onButtonSix(ActionEvent event) {
        input.setText(input.getText() + six.getText());
    }

    @FXML
    void onButtonSqrt(ActionEvent event) {
        input.setText(input.getText() + sqrt.getText());
    }

    @FXML
    void onButtonTan(ActionEvent event) {
        input.setText(input.getText() + tan.getText());
    }

    @FXML
    void onButtonThree(ActionEvent event) {
        input.setText(input.getText() + three.getText());
    }

    @FXML
    void onButtonTwo(ActionEvent event) {
        input.setText(input.getText() + two.getText());
    }

    @FXML
    void onButtonX(ActionEvent event) {
        input.setText(input.getText() + x.getText());
    }

    @FXML
    void onButtonZero(ActionEvent event) {
        input.setText(input.getText() + zero.getText());
    }

    public TextField getInput() {
        return input;
    }

    public TextField getXInput() {
        return xInput;
    }
}
