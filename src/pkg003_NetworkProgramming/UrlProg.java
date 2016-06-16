package pkg003_NetworkProgramming;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlProg {
	public static void main(String[] args) throws Exception {

		URL theURL = new URL("http://www.infiniteskils.com");
		System.out.println("Basic Information");
		System.out.println();
		System.out.println("Protocol : " + theURL.getProtocol());
		System.out.println("Port : " + theURL.getPort());
		System.out.println("Host : " + theURL.getHost());

		URLConnection theConn = theURL.openConnection();
		int contentLen = theConn.getContentLength();
		int c;

		if (contentLen != 0) {

			System.out.println("Content : ");
			System.out.println();
			InputStream urlInput = theConn.getInputStream();

			while (((c = urlInput.read()) != -1)) {
				System.out.print((char) c);
			}
			urlInput.close();	
		}
	}

}
