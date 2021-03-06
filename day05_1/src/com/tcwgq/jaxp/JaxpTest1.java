package com.tcwgq.jaxp;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 查询某一节点
 * 
 * @author lenovo
 * 
 */
public class JaxpTest1 {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		File file = new File("people.xml");
		Document doc = db.parse(file);
		NodeList nl = doc.getElementsByTagName("name");
		Node node = nl.item(0);
		System.out.println(node.getTextContent());
	}
}
