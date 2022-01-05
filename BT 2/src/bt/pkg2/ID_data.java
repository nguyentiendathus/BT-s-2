package bt.pkg2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ID_data {
    
    public String id;
    
    public void write(String s) throws IOException
    {
        FileOutputStream file = null;

        byte[] a = s.getBytes();
        try{
            file = new FileOutputStream("data.txt");
            file.write(a); //ghi mang byte vao file
 
        }
        catch (Exception e){
            System.out.print(e);// In lỗi ra màn hình
        }
        finally {
            file.close();//Nếu chương trình lỗi thì đóng file lại
        }
    }
    
    public String read() throws FileNotFoundException, IOException
    {
        File file = new File("data.txt");
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        while((line = reader.readLine()) != null){
            id = line;
        }
        return id;
    }
}
