package org.jboss.as.quickstarts.jaxrsclient;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchCep")
public class SearchServlet extends HttpServlet {

	final String WS_URL = "http://correiosapi.apphb.com/cep/{cep}";	

	final String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";
	final String PAGE_FOOTER = "</body></html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String cep = req.getParameter("cep");
		String content = "";
		if(cep == null){
			content = "<h1> You must inform a query parameter named \"cep\"</h1>";	
		} else {
			content = getContent(cep);
		}
		PrintWriter writer = resp.getWriter();
		writer.println(PAGE_HEADER);
		writer.println(content);
		writer.println(PAGE_FOOTER);
		writer.close();
	}
	
	public String getContent(String cep){
		CepResponse cepResponse = getCepData(cep);
		String content = "";
		if(cepResponse == null){
			content =  "<h1>Cep " + cep + " not found</h1>";
		} else {
			content += "<h1>Information for CEP \"" + cep + "\":</h1>";
			content += "<b>Logradouro:</b> " + cepResponse.getLogradouro() + "<br />";
			content += "<b>Tipo Logradouro:</b> " + cepResponse.getTipoDeLogradouro() + "<br />";
			content += "<b>Bairro:</b> " + cepResponse.getBairro() + "<br />";
			content += "<b>Cidade:</b> " + cepResponse.getCidade() + "<br />";
		}
		return content;


	}

	public CepResponse getCepData(String cep){
		try{
			ClientRequest request = new ClientRequest(WS_URL);
			request.accept("application/json");
			request.pathParameter("cep", cep);
			ClientResponse<CepResponse> response = request.get(CepResponse.class);
			return response.getEntity();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
