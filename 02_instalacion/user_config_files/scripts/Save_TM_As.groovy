/* :name=Save TM As		:description=Provides Save As function for output TMs
 * 
 * Save TM As
 */

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import static java.nio.file.StandardCopyOption.*
import javax.swing.JFileChooser
 
def prop = project.projectProperties

def project_root = prop.projectRoot
def project_name = prop.projectName


JFileChooser chooser = new JFileChooser() 
chooser.setCurrentDirectory(new java.io.File("."))
chooser.setDialogTitle("Select TM repository folder")
chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY)
int returnVal = chooser.showOpenDialog()
if(returnVal == JFileChooser.APPROVE_OPTION) {
   File selectedDirectory = chooser.getSelectedFile()

String tm_name = project_name + '-omegat.tmx'
String output_tm = new File(project_root, tm_name)

String dest_folder = selectedDirectory
String repo_tm = new File(dest_folder, tm_name)   

Files.copy(Paths.get(output_tm), Paths.get(repo_tm), REPLACE_EXISTING)

}
 
