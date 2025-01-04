package com.modernjava.javaimprovements;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
	/*
	 * Java 11+
	 * 
	 */

	public static void main(String arg[]) {
		try {
			// http instance
			HttpClient client = HttpClient.newHttpClient();

			// Build HttpRequest
			HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
					.build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("Status Code " + response.statusCode());
			System.out.println("Status Code " + response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
