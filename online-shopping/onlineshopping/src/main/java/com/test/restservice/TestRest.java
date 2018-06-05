package com.test.restservice;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class TestRest {
	// ClientsService s = new ClientsService();
	//
	// public static boolean authenticate(String authCredentials) {
	// if (null == authCredentials)
	// return false;
	// // header value format will be "Basic encodedstring" for Basic
	// // authentication. Example "Basic YWRtaW46YWRtaW4="
	// final String encodedUserPassword = authCredentials.replaceFirst("Basic" + "
	// ", "");
	// String usernameAndPassword = null;
	// try {
	// byte[] decodedBytes = Base64.decode(encodedUserPassword);
	// usernameAndPassword = new String(decodedBytes, "UTF-8");
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword,
	// ":");
	// final String username = tokenizer.nextToken();
	// final String password = tokenizer.nextToken();
	// boolean authenticationStatus = s.auth(username, password);
	//
	// return authenticationStatus;
	// }

	public static void callRestService() {
		// authenticate();
		// Authenticator myAuth = new Authenticator()
		// {
		// @Override
		// protected PasswordAuthentication getPasswordAuthentication()
		// {
		// return new PasswordAuthentication("sanjaysingh8959@gmail.com",
		// "faraday005".toCharArray());
		// }
		// };
		//
		// Authenticator.setDefault(myAuth);

		DefaultHttpClient client = new DefaultHttpClient();
		HttpResponse response = null;
		try {
			HttpGet request = new HttpGet(
					"https://jira005.atlassian.net/rest/api/2/issue/Test-1.json");
			//String encoding = Base64.encodeBase64String("&lt;myuser&gt;:&lt;mypassword&gt;".getBytes());
			String encoding = new String(Base64.encodeBase64("sanjaysingh8959@gmail.com:faraday005".getBytes()));
			request.setHeader("Authorization", "Basic " + encoding);
			System.out.println("request: " + request.getRequestLine());
			for (Header header : request.getAllHeaders()) {
				System.out.println(header);
			}
			response = client.execute(request);
			
			String json = EntityUtils.toString(response.getEntity());
			System.out.println("Printing json ");
			System.out.println(json);
			System.out.println("printing json ");
			
			System.out.println(response.toString());
			System.out.println(response.getEntity());
			System.out.println("status code: " + response.getStatusLine().getStatusCode());
			for (Header header : response.getAllHeaders()) {
				System.out.println(header);
			}
		} catch (Exception e) {
			System.out.println("-&gt; request problem: " + e.getMessage());
		} finally {
			client.getConnectionManager().shutdown();
		}

		// CredentialsProvider credsProvider = new BasicCredentialsProvider();
		// credsProvider.setCredentials(
		// new AuthScope("jira005.atlassian.net", AuthScope.ANY_PORT),
		// new UsernamePasswordCredentials("sanjaysingh8959@gmail.com", "faraday005"));
		//
		//
		// DefaultHttpClient client = new DefaultHttpClient();
		// client.setCredentialsProvider(credsProvider);
		//
		// //String url = "https://jira005.atlassian.net/browse/TEST-7";
		// String url = "https://jira005.atlassian.net/rest/api/2/issue/TEST-7.json";
		//
		// HttpGet get = new HttpGet(url);
		// get.addHeader("accept", "application/json");
		// ResponseHandler<String> handler = new BasicResponseHandler();
		// String resp="";
		// try {
		// resp = client.execute(get, handler);
		// } catch (ClientProtocolException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// System.out.println(resp);

		// RestTemplate restTemplate = new RestTemplate();
		// String url = "https://jira005.atlassian.net/rest/api/2/issue/Test-1.json";
		// ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
		// System.out.println(result);

	}

}
