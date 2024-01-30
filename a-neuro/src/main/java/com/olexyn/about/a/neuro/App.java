package com.olexyn.about.a.neuro;


import lombok.experimental.UtilityClass;

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class App 
{
    public static void main( String[] args )
    {

        Set<Node> outputLayer = new HashSet<>();
        outputLayer.add(new HiddenNode());
        Set<Node> hiddenLayer = new HashSet<>();
        hiddenLayer.add(new HiddenNode());
        hiddenLayer.add(new HiddenNode());
        Set<Node> inputLayer = new HashSet<>();
        inputLayer.add(new InputNode(1.0));


        for (Node outputNode : outputLayer) {
            for (Node hiddenNode : hiddenLayer) {
                outputNode.getInputs().put(hiddenNode, new LinFun(2.0, 3.0));
            }
        }
        for (Node hiddenNode : hiddenLayer) {
            for (Node inputNode : inputLayer) {
                hiddenNode.getInputs().put(inputNode, new LinFun(1.0, 2.0));
            }
        }

        var result = outputLayer.stream().findAny().get().calculateOutput();

        System.out.println("RESULT: " + result );
    }
}
