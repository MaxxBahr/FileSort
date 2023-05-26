package functionality.filesinput;

import java.io.File;

public class CreateFolder {
	private String name, root, slash;

	public CreateFolder(String s, String rootdir) {
		setroot(rootdir);
		setName(s);
		creation();

	}

	private void setroot(String rootdir) {
		root = rootdir;

	}

	private void setName(String s) {
		name = s;

	}

	public void creation() {
		String temp = getName();
		String rootd = getRootdir();
		String sys = System.getProperty("os.name").toLowerCase();
		String rooted = parseToOS(sys, rootd);
		String newFolderroot = rooted + getSlash()+ temp;
		File newFolder = new File(newFolderroot);
		if (!newFolder.exists()) {
			newFolder.mkdirs();
		}else {
			System.out.println("Folder already exists!");
		}
	}

	private String getSlash() {
		return slash;
	}

	public String parseToOS(String sys, String rootd) {
		String newroot = null;
		if (sys.contains("win")) {
			newroot = rootd.replaceAll("/+", "\\\\");
			setSlash("\\\\");
			setroot(newroot);
		} else {
			newroot = rootd.replaceAll("/+", "/");
			setSlash("/");
			setroot(newroot);
		}
		return newroot;

	}

	private void setSlash(String string) {
		slash = string;
		
	}

	public String getRootdir() {
		return root;
	}

	public String getName() {
		return name;
	}
}
