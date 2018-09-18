package com.sahakari.api;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sahakari.api.entities.MemberDocument;
import com.sahakari.api.service.SignatureService;
import com.sahakari.api.utils.ImageConverter;

@RestController
@RequestMapping("memberdocument")
public class MemberDocumentUpload {

	@Autowired
	SignatureService signatureService;

	ImageConverter i = new ImageConverter();

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public Map<String, Object> uploadmedia(@RequestParam("file") MultipartFile[] file,
			@ModelAttribute MemberDocument memberDocument, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
//blob conversion
		if (file != null && file.length > 0) {
			for (int i = 0; i < file.length; i++) {
				try {
					InputStream is = file[i].getInputStream();
					byte[] targetArray = IOUtils.toByteArray(is);
					memberDocument.setImage(targetArray);
					System.out.println(targetArray);

					int save_status = 0;
					// save_status = save query here
					save_status = signatureService.saveDocument(memberDocument, i);
					if (save_status > 0) {
						map.put("status", HttpStatus.OK);
					} else {
						map.put("status", HttpStatus.NOT_ACCEPTABLE);
					}

				} catch (Exception e) {
					System.out.println(e);
					map.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}
		else {
			map.put("status", "no files found!");
		}
		return map;
	}

}
