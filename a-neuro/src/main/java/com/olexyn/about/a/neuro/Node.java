package com.olexyn.about.a.neuro;

import java.util.Map;

public interface Node {


    Map<Node, LinFun> getInputs();

    Double getOutput();

    Double calculateOutput();

}
