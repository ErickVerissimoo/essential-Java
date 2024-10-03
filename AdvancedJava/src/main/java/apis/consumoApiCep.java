package apis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class consumoApiCep {

	public static void main(String[] args) throws Exception {
		HttpClient cliente = HttpClient.newHttpClient();
		Scanner entrada = new Scanner(System.in);
		String cep = entrada.next().trim();
		HttpRequest request = HttpRequest.newBuilder(URI.create("https://viacep.com.br/ws/"+cep+"/json/")).build();
		Gson gson = new Gson();
		HttpResponse<String> resposta = cliente.send(request, HttpResponse.BodyHandlers.ofString());
		endereco Endereço = gson.fromJson(resposta.body(), endereco.class);
		System.out.println(Endereço.toString());
	}

}
