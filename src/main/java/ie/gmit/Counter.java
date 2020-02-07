package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Counter {

    private int count;
    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public Counter(int starting) {
        if (starting < 0)
            throw new IllegalArgumentException("Must be greater than 0");
        else
            this.count = starting;
    }

    public int increment() {
        return ++this.count;
    }

    public int decrement() {
        return --this.count;
    }
}
