package co.id.kconk.abstractclasses.application;

import co.id.kconk.abstractclasses.filereaders.BaseFileReader;
import co.id.kconk.abstractclasses.filereaders.LowercaseFileReader;
import co.id.kconk.abstractclasses.filereaders.UppercaseFileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws IOException, URISyntaxException {

        Application application = new Application();
        Path path = application.getPathFromResourcesFile("files/test.txt");
        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);
        lowercaseFileReader.readFile().forEach(line -> System.out.println(line));
        
        BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);
        uppercaseFileReader.readFile().forEach(line -> System.out.println(line));

    }
    
    private Path getPathFromResourcesFile(String filePath) throws URISyntaxException {
        return Paths.get(getClass().getClassLoader().getResource(filePath).toURI());
         
    }
}
