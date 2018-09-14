package com.sahakari.api.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
import javax.xml.bind.DatatypeConverter;

import org.springframework.web.multipart.MultipartFile;

public class ImageConverter {
	
	public String byteToBase64(byte[] image) {
		String encoded = null;
		try {
		  encoded = DatatypeConverter.printBase64Binary(image);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(encoded);
		return encoded;
		
	}
	
	public SerialBlob multipartToBlob(MultipartFile file) {
		SerialBlob sBlob = null;
		try {
			byte[] picBytes = file.getBytes();
			 sBlob = new SerialBlob(picBytes);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return sBlob;
	}
	
	public static byte[] getImage(String filename) {
	      File file =new File(filename);
	      if(file.exists()){
	         try {
	            BufferedImage bufferedImage=ImageIO.read(file);
	            ByteArrayOutputStream byteOutStream=new ByteArrayOutputStream();
	            ImageIO.write(bufferedImage, "png", byteOutStream);
	            return byteOutStream.toByteArray();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	      return null;
	   }

}