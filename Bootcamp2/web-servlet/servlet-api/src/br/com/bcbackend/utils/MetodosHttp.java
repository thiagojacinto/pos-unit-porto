package br.com.bcbackend.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MetodosHttp {
	
	public static void delete(String deleteEndpoint) throws Exception {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create(deleteEndpoint))
				.POST(null)
				.build();
		
		try {
			var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		
			System.out.println("[REMOVER] " + response.statusCode());
			System.out.println("[REMOVER] " + response.body());
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new Exception("[REMOVER] Erro: " + e.getMessage());
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			throw new Exception("[REMOVER] Erro: " + e.getMessage());
		}
		
	}
}
