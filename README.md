# Testing Typescript Generator Plugin

## How to run
After cloning the repo, please run:

```
./gradlew generateTypeScript
```

## Problems
If a private variable name starts with a single lower case letter followed by an uppercase letter, typescript
generator fails to preserve the case. Note that I'm using Lombok here, which automatically generates the getters:

```
@Value
class TestClassLombok {
    int xPosition;
    int aLongerVariableName;
    int abPosition;
}
```

produces

```
interface TestClassLombok {
    abPosition: number;
    xposition: number;
    alongerVariableName: number;
}
```

where I would expect

```
interface TestClassLombok {
    abPosition: number;
    xPosition: number;
    aLongerVariableName: number;
}
```

Note that if the variables are public, or we make the getter name slightly different, it seems to work
okay (please see the other test classes).
