package reader;

import java.io.*;

public class Reader {
    private String input;


    public Reader(File file){
        StringBuilder returnString = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String st;
            while((st = bufferedReader.readLine())  != null ){
                returnString.append(st + "\n");


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        input = returnString.toString();

    }

    public String getInput(){
        return this.input;
    }
}
