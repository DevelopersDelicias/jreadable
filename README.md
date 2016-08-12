# JReadable

Provides an API to create a sequence of functions that improve readability of common constructions.

## Introduction

We consider writting clean and readable code matters!

For example, if you want to verify if a number is between to 5 and 10, you could write something like this:

```
if (number >= 5 && number <= 10) {
    // do something
}
```

With JReadable you can rewrite it as:

```
if (valueOf(number).isBetween(5).and(10)) {
    // do something
}

```
Both code do the same, but for a the first example takes a little bit more time to have and idea what is intended on the if statement.

Another example can be:

```
import static java.lang.Objects.isNull;

class Test {
    void stuff() {
    
        // With Objects.isNull method
	if (isNull(foo)) {
	    // do something
	}

	// With JReadable
	if (object(foo).isNull()) {
	}
    }
}
```

## License
To be defined

## How to contribute
To be defined


