package ex6;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class BicicletaOutputStream extends ObjectOutputStream{

    public BicicletaOutputStream(OutputStream out) throws IOException{
        super(out);
    }
    @Override
    public void writeStreamHeader() throws IOException{
    }
    
}