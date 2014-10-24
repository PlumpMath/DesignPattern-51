package test;
import java.io.File;
import java.io.IOException;
import org.junit.Test;
import temp.ModifyFile;


public class ModifyFileTest {
	
	@Test
	public void walkFile() throws IOException{
		ModifyFile modifyFile = new ModifyFile();
		File file = new File("C:\\workspace\\DesignPattern\\src\\com\\headfirst\\observer\\WeatherStationObservable");
//		File file = new File("C:\\Users\\fanluo\\Desktop\\test.txt");
		modifyFile.walkFile(file);
		
	}
}
