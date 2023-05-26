package functionality.filesinput;

import java.io.File;

public class Duplicator {
	File f1;
	
	Duplicator(String s){
		duplicate(s);
	}
	
	
	
	private void duplicate(String s) {
		setFile(s);
		File f2 = getFile();
		
		
	}



	public File getFile() {
		return f1;
	}
	
	public void setFile(String s) {
		f1 = new File(s);
	}
}
