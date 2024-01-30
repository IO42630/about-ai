package com.olexyn.about.a.neuro;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class HiddenNode implements Node {

    private Double output = null;
    private final Map<Node, LinFun> inputs = new HashMap<>();



    @Override
    public Double calculateOutput() {

        var lin = inputs.entrySet()
            .stream().map(entry -> entry.getKey().calculateOutput() * entry.getValue().getA() + entry.getValue().getB())
            .reduce(0.0, Double::sum);
        output = Math.max(0, lin);
        return output;

    }
}
