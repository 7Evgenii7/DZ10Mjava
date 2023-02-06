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

        radio.setCurrentStation(10);
        actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);

        radio.setCurrentStation(0);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSetCurrentStation2() {
        Radio radio = new Radio(50);

        int expected = 0;

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(50);
        actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);

        radio.setCurrentStation(0);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(0, actual);
    }



    @Test
    public void testIncreaseStation2() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(49);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseStation2() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();

        int expected = 0;

        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(101);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(99);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(99, actual);
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

        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(0, actual);

        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(34, actual);


    }


    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(100, actual);

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(100, actual);

        radio.setCurrentVolume(63);
        radio.increaseVolume();
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(64, actual);

    }
}
