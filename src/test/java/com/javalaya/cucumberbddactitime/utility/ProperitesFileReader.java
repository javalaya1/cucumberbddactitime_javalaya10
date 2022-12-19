package com.javalaya.cucumberbddactitime.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class ProperitesFileReader {
	private static HashMap<Object, Object> allProperties = new HashMap<>();

	static {
		if (allProperties.isEmpty()) {
			readProperites();
			readProperites("actitimetestconfig");
		}
	}

	private static void readProperites(String fileName) {
		try (FileInputStream fis = new FileInputStream("actitimetestdata/" + fileName + ".properites")) {
			Properties p = new Properties();
			p.load(fis);
			allProperties.putAll(p);
		} catch (Exception e) {

		}
	}

	private static void readProperites() {
		String location = "actitimetestdata";
		File f = new File(location);
		if (f.isDirectory()) {
			List<File> allFiles = Arrays.asList(f.listFiles());
			for (File eachFile : allFiles) {
				if (eachFile.getName().endsWith(".properties")) {
					try (FileInputStream fis = new FileInputStream(eachFile)) {
						Properties p = new Properties();
						p.load(fis);
						allProperties.putAll(p);
					} catch (Exception e) {

					}
				}
			}
		}
	}

	public static String getProp(String key) {
		return allProperties.get(key).toString();
	}
	
}
