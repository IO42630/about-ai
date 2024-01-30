package com.olexyn.about.a.neuro;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LinFun {


    public LinFun(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    private Double a = 0.0;
    private Double b = 0.0;
}
