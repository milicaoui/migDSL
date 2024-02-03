package xtext.configfile;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public class ConfigInitializer implements IGenerator {

    public static void initializeConfigFile() throws CoreException {
    	
    	
        // Get the current Xtext project
        IProject xtextProject = getXtextProject();
        if (xtextProject == null) {
            System.err.println("Xtext project not found.");
            return;
        }

        // Specify the path and name of the config file
        String configFileName = "config.xml";
        
        if (!configFileExists(configFileName)) {
        // Create the config file with initial settings
        try {
            IFile configFile = xtextProject.getFile(configFileName);
            FileWriter writer = new FileWriter(configFile.getLocation().toFile());

            // Write initial settings to the config file
            writer.write("<config>\n");
            writer.write("<source>\n");
            writer.write("\t<host>localhost</host>\n");
            writer.write("\t<port>1521</port>\n");
            writer.write("\t<db>xe</db>\n");
            writer.write("\t<username>milica</username>\n");
            writer.write("\t<password>milica</password>\n");
            writer.write("</source>\n");
            
            writer.write("<target>\n");
            writer.write("\t<host>localhost</host>\n");
            writer.write("\t<port>27017</port>\n");
            writer.write("\t<db>domij</db>\n");
            writer.write("\t<username>true</username>\n");
            writer.write("\t<password>default_value</password>\n");
            writer.write("</target>\n");
            writer.write("<options>\n");
            writer.write("\t<MigrateDataTypes>true</MigrateDataTypes>\n");
            writer.write("\t<AdditionalFieldsAllowed>false</AdditionalFieldsAllowed>\n");
            writer.write("</options>\n");
            writer.write("</config>");

            writer.close();
            System.err.println("GENERATED AGAIN.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }else {
        	System.err.println("CONFIG FILE ALREADY EXISTS.");
        }
    }
    
    private static boolean configFileExists(String configFileName) {
        IProject xtextProject = getXtextProject();
        if (xtextProject == null) {
            System.err.println("Xtext project not found.");
            return false;
        }

        IFile configFile = xtextProject.getFile(configFileName);
        return configFile.exists();
    }

    private static IProject getXtextProject() {
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject[] projects = workspaceRoot.getProjects();
        for (IProject project : projects) {
            if (project.isOpen() && hasXtextNature(project)) {
                return project;
            }
        }
        return null;
    }

    private static boolean hasXtextNature(IProject project) {
        try {
            return project.hasNature("org.eclipse.xtext.ui.shared.xtextNature")
                    && project.hasNature("org.eclipse.xtext.ui.shared.xtextNature");
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return false;
    }

    //ova se nikada ne pozove, pa u sustini i ne mora biti generator
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		
		String initialContent = "Source:"
				+ "host:\n"
				+ "port:\n"
				+ "db:\n"
				+"username:\n"
				+"password:\n"
				+"Target:"
				+ "host:\n"
				+ "port:\n"
				+ "db:\n"
				+"username:\n"
				+"password:\n"
				;
		
		
		fsa.generateFile("connection.config",initialContent);
		
	}
}