package com.olexyn.about.a.neuro;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class InputNode implements Node {





    private final Double output;
    private final Map<Node, LinFun> inputs = new HashMap<>();



    public InputNode(Double output) {
        this.output = output;
    }


    @Override
    public Double calculateOutput() {

        return getOutput();

    }
}
