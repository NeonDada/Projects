package org.academiadecodigo.bootcamp.glass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Memory {

    MagicGrid grid;

    FileInputStream inputStream;


    {
        try {
            inputStream = new FileInputStream("src/org/academiadecodigo/bootcamp/glass/MagicGrid.java");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

}



