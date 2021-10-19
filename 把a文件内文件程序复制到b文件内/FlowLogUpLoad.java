package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FlowLogUpLoad {
	public static void copyDir(String sourcePathDir,String newPathDir) {
		File start=new File(sourcePathDir);
		File end=new File(newPathDir);
		String[] filePath=start.list();
		if(!end.exists()) {
			end.mkdir();
		}
		boolean flag=false;
		for(String temp:filePath) {
			if(new File(sourcePathDir+File.separator+temp).isFile()&&temp.endsWith(".dat")) {
				flag=copyFile(sourcePathDir+File.separator+temp.newPathDir+File.separator+temp);
			}
			if(flag) {
				System.out.println("文件："+temp+"复制成功！");
			}else {
				System.out.println("文件："+temp+"复制失败！");
			}
		}
	}
	public static boolean copyFile(String sourcePath, String newPath) {
        boolean flag = false;
        File readfile = new File(sourcePath);
        File newFile = new File(newPath);
        BufferedWriter bufferedWriter = null;
        Writer writer = null;
        FileOutputStream fileOutputStream = null;
        BufferedReader bufferedReader = null;
        try{
            fileOutputStream = new FileOutputStream(newFile, true);
            writer = new OutputStreamWriter(fileOutputStream,"UTF-8");
            bufferedWriter = new BufferedWriter(writer);
            
            bufferedReader = new BufferedReader(new FileReader(readfile));
            
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            flag = true;    
        } catch(IOException e) {
            flag = false;
            e.printStackTrace();
        } finally {
            try {
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(writer != null){
                    writer.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        
        String sourcePath = "D:\\home\\before\\20200120";
        String newPath = "E:\\home\\after\\20200120";
        System.out.print("From：" + sourcePath);
        System.out.print("To：" + newPath);
        copyDir(sourcePath, newPath);
    }

}


