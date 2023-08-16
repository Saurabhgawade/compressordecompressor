/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author Hp
 */
public class decompressor {
    public static void method(File file)throws IOException{
        String filedirectory=file.getParent();
         FileInputStream fis=new FileInputStream(file);
         GZIPInputStream gzip=new GZIPInputStream(fis);
         FileOutputStream fos=new FileOutputStream(filedirectory+"/DecompressedFile.gz");
         
         byte[] buffer=new byte[1024];
        int len;
        
        while((len=gzip.read(buffer))!=-1){
        fos.write(buffer,0,len);
        }
        gzip.close();
        fos.close();
        fis.close();
    }
     public static void main(String[] arg){
        File path=new File("");
        
    }
}
