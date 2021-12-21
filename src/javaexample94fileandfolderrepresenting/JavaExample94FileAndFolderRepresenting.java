
package javaexample94fileandfolderrepresenting;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class JavaExample94FileAndFolderRepresenting {

    
    public static void main(String[] args) {
        
        
        
        try(PrintWriter pw = new PrintWriter(System.out, true);){
            /*
            The system-dependent default name-separator character. 
            This field is initialized to contain the first character of 
            the value of the system property file.separator. 
            On UNIX systems the value of this field is '/'; 
            on Microsoft Windows systems it is '\\'.
            */
            pw.println(File.separatorChar);
            
            pw.println();
            
            // ---- representing files and folders using strings ---------------
            
            // root folder
            String root = "/.";
            
            // actual folder
            String actual1 = ".";
            
            // user-working-folder
            String actual2 = System.getProperty("user.dir");
            
            // user-home-folder
            String home = System.getProperty("user.home");
            
            // Java-home-folder
            String homeJava = System.getProperty("java.home");
            
            // relative-path of a folder
            String classes = homeJava + File.separatorChar + "classes";
            String path1 = actual1 + File.separatorChar + "enKatalog" +
                    File.separatorChar + "fil.txt";
            String path2 = root + File.separatorChar + "student" +
                    File.separatorChar + "Java";
            
            // path depends on plattform
            String path3 = "C:\\student\\Java";
            
            // show these pathes
            Helper.ShowPaths(pw, root, actual1, actual2, home, homeJava, 
                    classes, path1, path2, path3);
            
            pw.println();
            pw.println();
            
            // ---- representing files and folders using obj of type File ------
            
            File rootFolder = new File(root);
            File actualFolder1 = new File(actual1);
            File actualFolder2 = new File(actual2);
            File homeFolder = new File(home);
            File homeJavaFolder = new File(homeJava);
            File classesFolder = new File(classes);
            File fil = new File(path1);
            File folder2 = new File(path2);
            File folder3 = new File(path3);
            
            // show paths in the actual file-system
            Helper.ShowPathsUsingFileObjs(pw, rootFolder, actualFolder1,
                    actualFolder2, homeFolder, homeJavaFolder, classesFolder,
                    fil, folder2, folder3);
            
            pw.println();
            pw.println();
            
            // a file in the actual folder
            File fil1 = new File("fil1.txt");
            
            // a file in a given folder
            File fil2 = new File(folder2, "fil2.txt");
            File fil3 = new File(folder3, "fil3.txt");

            Helper.ShowPathsUsingFileObjs(pw, fil1, fil2, fil3);
                        
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
