package org.example;


import jssc.SerialPort;

public class Main {
    public static void main(String[] args) {
        try {
            SerialPort serialPort = new SerialPort("COM30");
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
