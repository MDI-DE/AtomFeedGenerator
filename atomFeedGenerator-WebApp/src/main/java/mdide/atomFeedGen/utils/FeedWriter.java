package mdide.atomFeedGen.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * Schreibt einen String in eine Datei.
 * 
 * @author Mathias Luecker
 *
 */
public class FeedWriter {
	
	private BufferedWriter out;
	
	/**
	 * Initialisiert einen BufferedWriter
	 * 
	 * @param file
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException
	 */
	public FeedWriter(File file) throws UnsupportedEncodingException, FileNotFoundException{
		
		out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF8"));
		
	}
	
	/**
	 * Schreibt den uebergebenen String
	 * 
	 * @param line
	 * @throws IOException
	 */
	public void write(String line) throws IOException{
		
		this.out.write(line);

	}
	
	/**
	 * BufferedWriter wird geschlossen.
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException{
		
		this.out.close();
	}
	
}
