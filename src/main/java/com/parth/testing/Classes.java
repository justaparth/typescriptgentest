package com.parth.testing;

import lombok.Value;

@Value
class TestClassLombok {
    // This variable does not get translated correctly.
    int xPosition;

    // This variable translates correctly starting from the 2nd word.
    int aLongerVariableName;

    // This variable does get translated correctly.
    int abPosition;
}

class TestClassPublic {
    // Public variables all get translated correctly
    public int xPosition;
    public int abPosition;
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
