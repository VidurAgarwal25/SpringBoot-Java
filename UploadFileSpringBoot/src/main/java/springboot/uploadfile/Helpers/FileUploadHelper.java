package springboot.uploadfile.Helpers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String uploadDirectoryPath = new ClassPathResource("static/images/").getFile().getPath();
	public FileUploadHelper() throws IOException{
		
	} 

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
