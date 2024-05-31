package org.example.UnitTest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class E1Test {

    @Test
    void sumShouldReturnAddedValue() {
//        given
        int a =4;
        int b = 5;
        E1 exercise1Test = new E1();

//        when
        int result = exercise1Test.sum(a,b);
//        then

        assertThat(result, equalTo(9));
    }
}