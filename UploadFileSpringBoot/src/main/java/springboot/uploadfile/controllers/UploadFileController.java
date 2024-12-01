package springboot.uploadfile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import springboot.uploadfile.Helpers.FileUploadHelper;

@RestController
public class UploadFileController {

	@Autowired
	public FileUploadHelper fileUploadHelper;

	@PostMapping("/uploadfile")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			if (file.isEmpty()) {
				return ResponseEntity.internalServerError().body("Please upload file of size atleast 1KB");
			}
			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.internalServerError().body("Please upload size in .jpeg format");
			}
			boolean isUpload = fileUploadHelper.uploadFile(file);
			if (isUpload)
//				return ResponseEntity.ok("Upload Successful");
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ResponseEntity.internalServerError().body("Something went wrong!!Please try again.");
	}

}
