package functionality.filesinput;

import java.io.File;

public class FileReader {

	File sourceFile;

	public FileReader(String s) {
		setFilePath(s);
	}

	public void sort() {
		File[] fileList = sourceFile.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			File destFolder = new File(sourceFile, fileList[i].getName().substring(0, 5));
			if (!destFolder.exists()) {
				destFolder.mkdirs();
			}
			File destFile = new File(destFolder, fileList[i].getName());
			fileList[i].renameTo(destFile);
		}
	}

	private void setFilePath(String s) {
		sourceFile = new File(s);
	}

}
