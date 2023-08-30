package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenImg extends BaseClass{

	public static void main(String[] args) throws IOException {
		launchChrome();
		launchUrl("https://www.irctc.co.in/nget/train-search");
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		
		for (WebElement images : image) {
			String a = images.getAttribute("src");
			
			if (a!=null && (a.contains(".png") ||a.contains(".jpg"))) {
				URL u=new URL(a);
				URLConnection openConnection = u.openConnection();
				HttpURLConnection h=(HttpURLConnection) openConnection;
				int responseCode = h.getResponseCode();
				if (responseCode!=200) {
					
					System.out.println("image "+a+"\nresponse code "+responseCode);
				}else {
					System.out.println("Else --"+a);
				}
				
			}
			
		}

	}

}
