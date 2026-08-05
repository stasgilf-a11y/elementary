package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to35then2dot8() {
        double expected = 2.8;
        int x1 = 1;
        int y1 = 3;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.03));
    }

    @Test
    void when78to69then1dot4() {
        double expected = 1.4;
        int x1 = 7;
        int y1 = 8;
        int x2 = 6;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.015));
    }

}