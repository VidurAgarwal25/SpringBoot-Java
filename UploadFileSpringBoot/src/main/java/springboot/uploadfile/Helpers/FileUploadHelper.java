package springboot.uploadfile.Helpers;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String uploadDirectoryPath = "C:\\Users\\vidur\\Documents\\workspace-spring-tool-suite-4-4.26.0.RELEASE\\UploadFileSpringBoot\\src\\main\\resources\\static\\images";

	public boolean uploadFile(MultipartFile file) {
		boolean flag = false;
		try {
			Files.copy(file.getInputStream(),
					Paths.get(uploadDirectoryPath + File.separator + file.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			flag = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return flag;
	}
}
