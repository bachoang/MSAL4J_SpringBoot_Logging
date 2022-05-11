// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.msalwebsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class MsalB2CWebSampleApplication {

	static { System.setProperty("logging.config", "C:\\Users\\bachoang\\OneDrive - Microsoft\\Documents\\customer\\Alastair0424\\ms-identity-java-webapp\\msal-b2c-web-sample\\src\\main\\resources\\logback.xml");}
	public static void main(String[] args) {
		// Console.log("main");
		// System.console().printf("hello");
		// System.out.printf("Hello %s!%n", "World");
		System.out.printf("%s%n", "Hello World");
		SpringApplication.run(MsalB2CWebSampleApplication.class, args);
	}
}
