package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(999);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(5);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();

        int expected = 0;

        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(999);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(5);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(5, actual);
    }



    @Test
    public void testIncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.increaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(9);
        radio.increaseStation();
        expected = 0;
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.decreaseStation();
        expected = 8;
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(0, actual);

        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(4, actual);
    }


    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(1, actual);

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(10, actual);
    }
}
