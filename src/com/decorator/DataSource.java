package com.decorator;

/**
 * Uma interface de dados comum, que define as operações ler e escrever.
 */
public interface DataSource {
    
    void writeData(String data);

    String readData();
}
