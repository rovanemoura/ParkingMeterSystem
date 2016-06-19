package OperationModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BankDAODerby implements BankDAO { //OK
    private File keepFile;
    
    public BankDAODerby(){ keepFile = new File("bank.txt"); }

    @Override
    public void update(Bank bank) {
        String arquivoTmp = "ARQUIVO-tmp";
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp));
        BufferedReader reader = new BufferedReader(new FileReader(arquivoTmp));
        
        writer.write(bank.toString());
        
        writer.close();        
        reader.close();

        keepFile.delete();
        new File(arquivoTmp).renameTo(keepFile);
    }catch(IOException e){
        
    }
    }
    
    
    
}
  
