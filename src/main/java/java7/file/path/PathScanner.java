package java7.file.path;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathScanner {
	
	public void scan(String uri){
		
		Path root = Paths.get(uri);
		
		Path subDir = Paths.get("\\testTemp\\");
		
		FileSystem fs = root.getFileSystem();
		
		System.out.println(root.toString());
		System.out.println(root.getParent());
		
		
		System.out.println(subDir.toString());
		
				
		
	}

}
