package com;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class DeleteFile {

	public static void main(String[] args) {

		File file = null;
		List<String> pathNames = getprepareData();

		for (String pathName : pathNames) {
			file = new File(pathName);
			try {
				FileUtils.deleteDirectory(file);
				System.out.println(pathName + "Done ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static private List<String> getprepareData() {
		String temp = "C:\\Users\\papisit\\AppData\\Local\\Temp";
		String vfs = "D:\\server\\jboss\\jboss-as-7.1.1.Final\\standalone\\tmp\\vfs";
		String logPhoenix = "D:\\var\\log\\phoenix";

		List<String> listPathName = new ArrayList<String>();
		listPathName.add(temp);
		listPathName.add(vfs);
		listPathName.add(logPhoenix);
		

		return listPathName;
	}
}

