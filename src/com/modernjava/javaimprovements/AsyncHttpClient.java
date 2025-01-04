package com.modernjava.javaimprovements;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClient {
	public static void main(String arg[]) {
		try {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest requst = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/todos/1")).build();
		
		CompletableFuture<Void> response = client.sendAsync(requst, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println);
		response.get();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
