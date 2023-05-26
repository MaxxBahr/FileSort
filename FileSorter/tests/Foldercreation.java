import static org.junit.Assert.*;

import org.junit.Test;

import functionality.filesinput.CreateFolder;

public class Foldercreation {

	@Test
	public void test() {
		CreateFolder folder = new CreateFolder("new_folder", "C:/Users\\bahr-\\Desktop\\folder");
		folder.creation();
	}

}
