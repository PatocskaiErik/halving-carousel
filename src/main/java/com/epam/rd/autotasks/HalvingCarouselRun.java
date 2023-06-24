package com.epam.rd.autotasks;

public class HalvingCarouselRun extends CarouselRun {
    public  int decrement;

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] = array[position] / 2;
            position++;
        }
        return beforeDecreasing;
    }
}
