package edu.school.smartcalc.enity;

import java.io.Serializable;

public class MathExpress implements Serializable {
    private String express;

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public MathExpress(String express) {
        this.express = express;
    }
}
