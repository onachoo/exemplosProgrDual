package ex6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.InputStream;

public class BicicletaInputStream extends ObjectInputStream{

    public BicicletaInputStream(InputStream input) throws IOException{
        super(input);
    }
    @Override
    public void readStreamHeader() throws IOException{
    }
    
}