package com.parth.testing;

import lombok.Value;

@Value
class TestClassLombok {
    // This variable does not get translated correctly.
    int xPosition;

    // This variable does get translated correctly.
    int abPosition;
}

class TestClassGetterDifference {
    private int xPosition;
    private int yPosition;

    public int getxPosition() {
        return this.xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }
}
