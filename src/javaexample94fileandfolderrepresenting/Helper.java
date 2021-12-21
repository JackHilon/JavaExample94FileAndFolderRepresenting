
package javaexample94fileandfolderrepresenting;

import java.io.*;


public class Helper {
    
    public static void ShowPaths(PrintWriter out, String... paths)
            throws IOException
    {
        for (int i = 0; i < paths.length; i++) {
            out.println(paths[i]);
        }
    }
    
    public static void ShowPathsUsingFileObjs(PrintWriter out, File... filesAndFolders)
            throws IOException
    {
        for (int i = 0; i < filesAndFolders.length; i++) {
            out.println(filesAndFolders[i].getCanonicalPath());
        }
    }
    
    
}
