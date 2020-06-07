package com.admiral.web;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	
	public static AppiumDriverLocalService StartAppium(){
	AppiumDriverLocalService service = AppiumDriverLocalService
			                           .buildService(new AppiumServiceBuilder()
			                           .usingDriverExecutable(new File("c:/Program Files/nodejs/nodejs.exe"))
			                           .withAppiumJS(new File("C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js"))
			                           .withLogFile(new File("C:/AppiumLogs/logs.txt")));
 service.start();
 service.stop();
 return service;
	}
}
