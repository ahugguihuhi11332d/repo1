package test;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
public class TextSearchFile {
	static int countFiles=0;
	static int countFolders=0;
	public static void main(String[] args) {
		File folder=new File("E:/logs");
		String keyword="x";
		if(!folder.exists()) {
			System.out.println("目录不存在："+folder.getAbsolutePath());
			return;
		}
		File[] result=searchFile(folder,keyword);
		System.out.println("在"+folder+"以及所有子文件时查找对象"+keyword);
		System.out.println("查找了"+countFiles+"个文件"+countFolders+"个文件夹，共找到"+result.length+"个符合条件的文件：");
		for(int i=0;i<result.length;i++) {
			File file=result[i];
			System.out.println(file.getAbsolutePath()+"");
	}
	

}
public static File[] searchFile(File folder,final String keyWord) {
	public boolean accept(File pathname) 
		if(pathname.isFile())
			countFiles++;
		else
			countFolders++;
		if(pathname.isDirectory()||(pathname.isFile()&&pathname.getName().toLowerCase().contains(keyWord.toLowerCase())))
			return true;
		return false;
	


List<File> result=new ArrayList<File>();
if(subFolders[i].isFile()) {
	result.add(subFolders[i]);
	File[] foldResult=searchFile(subFolders[i],keyWord);
	for(int j=0;j<foldResult.length;j++) {
		result.add(foldResult[j]);
	}
}

File files[]=new File[result.size()];
result.toArray(files);
return files;
}
}

