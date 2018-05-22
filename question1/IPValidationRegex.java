package tpgproject.question1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	
	private Pattern pattern;
	private Matcher matcher;
	
	private final static String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + 
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public IPValidationRegex() {
		pattern = Pattern.compile(IP_PATTERN);
	}
	
	/*
	 * Main method to validate IP
	 */
	public void validateIP(String filePath) {
		String validIps = this.readFile(filePath);
		this.createValidFile(filePath, validIps);		
	}
	
	private String readFile(String filePath) {

		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			String line = bufferedReader.readLine();
			while (line!=null) {
				if(this.validate(line)) {
					sb.append(line);
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		}catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}
	
	private void createValidFile(String filePath, String validIps) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(validIps.getBytes());
			fos.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private boolean validate(String ip) {
		matcher = pattern.matcher(ip);
		return matcher.matches();
	}
	/*
	 * Getters and Setters
	 */
	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public Matcher getMatcher() {
		return matcher;
	}

	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}
}
