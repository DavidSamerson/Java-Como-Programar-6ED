package arquivos.Fluxos;

import java.io.File;

public class FileDemonstration {

	public void analizePath(String path) {

		File name = new File(path);

		if (name.exists()) {

			System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", name.getName(), "Exists",
					(name.isFile() ? "Is a file" : "is not a file"),
					(name.isDirectory() ? "Is a directory" : "Is not a directory"),
					(name.isAbsolute() ? "Is a absolute path" : "Is not a absolute path"), "Last Modified: ",
					name.lastModified(), "Length: ", name.getAbsolutePath(), "Parent: ", name.getParent());

			if (name.isDirectory()) {

				String directory[] = name.list();
				System.out.println("\n\nDirectory Contents: \n");

				for (String string : directory) {

					System.out.printf("%s\n", string);

				}

			}
		}else {
			System.out.printf("%s %s",path,"Does not exist.");
		}

	}

}
