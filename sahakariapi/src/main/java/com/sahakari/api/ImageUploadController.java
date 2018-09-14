package com.sahakari.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sahakari.api.entities.Signatures;
import com.sahakari.api.service.SignatureService;
import com.sahakari.api.utils.ImageConverter;


@RestController
@RequestMapping("/media")
public class ImageUploadController {
	
	@Autowired
	SignatureService signatureService;
	
	ImageConverter i = new ImageConverter();
	
	
	
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public Map<String, Object> uploadmedia(@RequestParam("file") MultipartFile file, @ModelAttribute Signatures signatures, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
//blob conversion
		
		try {
			InputStream is = file.getInputStream();
			byte[] targetArray = IOUtils.toByteArray(is);
			signatures.setImage(targetArray);
			System.out.println(targetArray);
			
			int save_status = 0;
			          save_status = signatureService.saveSignature(signatures);
			          if(save_status>0) {
							map.put("status", HttpStatus.OK);
						}
						else {
							map.put("status", HttpStatus.NOT_ACCEPTABLE);
						}

		}
		catch(Exception e) {
			System.out.println(e);
			map.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return map;
	}

	
	@RequestMapping(value = "/displayImage/{id}", method = RequestMethod.GET)
	public void displayImage(@PathVariable("id") String signatureid, HttpServletResponse response) {
		try {
			
			Signatures signatures= signatureService.findById(signatureid);
			byte[] image = signatures.getImage();
		
			response.setHeader("expires", "0");
            response.setContentType("image/jpg");

            OutputStream os = response.getOutputStream(); // output with the help of outputStream 
            os.write(image);
            os.flush();
            os.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		System.out.println("reached here");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Signatures> list = signatureService.findAll();
		map.put("data", list);
		return map;
	}

}
