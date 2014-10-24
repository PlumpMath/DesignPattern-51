package temp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ModifyFile {
	
	private final int MODIFY_LINE_NUMBER = 1;
	
	public void walkFile(File file) throws IOException
	{
		if(file.exists()&&file.isDirectory())
		{
			File[] fileArray = file.listFiles();
			for(int i = 0 ; i < fileArray.length ; i++)
			{
				walkFile(fileArray[i]);
			}
		}
		if(file.exists()&&file.isFile())
		{
			readFileToTemp(file,new File("C:\\Users\\fanluo\\Desktop\\temp.java"));
	        copyFile(new File("C:\\Users\\fanluo\\Desktop\\temp.java"),file);
		}
	}
	
	private void readFileToTemp(File src,File dest) throws IOException
	{
		String line;
		BufferedReader in = new BufferedReader(new FileReader(src));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(dest)));
		int count = 1;
		while((line = in.readLine()) != null)
		{
			//修改指定行
			 if(count == MODIFY_LINE_NUMBER){
	                out.println(modifyLine(line,"com.headfirst.observer.weatherobservable","com.headfirst.observer.WeatherStationObservable"));  
	         }else{
	                out.println(line);
	         }
	         count++;
		}
        in.close();
        out.close();
	}
	
	//修改行
	private String modifyLine(String line,String src,String dest)
	{
		return line.replace(src, dest);
	}
	
	// 复制文件
    private void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            // 新建文件输入流并对它进行缓冲
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }
}
