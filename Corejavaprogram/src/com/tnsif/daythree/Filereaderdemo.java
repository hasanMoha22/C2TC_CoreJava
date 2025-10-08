package com.tnsif.daythree;

import java.io.*;
public class Filereaderdemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/com/tnsif/daythree/ifet.txt");
		BufferedReader br = new BufferedReader(fr);
		String content = br.readLine();
		System.out.println(content);
	}

}
