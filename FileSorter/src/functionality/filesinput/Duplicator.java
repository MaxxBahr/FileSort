package functionality.filesinput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Duplicator extends CreateFolder{
	File f1;

	public Duplicator(String dupfile) {
		this(dupfile, "C:\\Users\\bahr-\\Desktop\\folder", "Standardordner");
	}
	public Duplicator(String dupfile, String folderName) {
		this(dupfile, "C:\\Users\\bahr-\\Desktop\\folder", folderName);
	}
	public Duplicator(String dupfile, String rootpath, String folderName) {
		super(rootpath, folderName);
		duplicate(dupfile);
	}

	private void duplicate(String s) {
		setFile(s);
		File f2 = getFile();
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		for (int i = 0; i < j; i++) {
			String name = f2.getName() + i;
			File f3 = new File(f2, name);
			try {
				f3.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Could not create file.");
			} finally {
				scanner.close();
			}
		}

	}

	public File getFile() {
		return f1;
	}

	public void setFile(String s) {
		f1 = new File(s);
	}
}
