package cn.edu.nju.jw.exception;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Endpoint;

import cn.edu.nju.jw.wsdl.ScoreManageSOAPImpl;

public class StudentServicePublisher {
	public static void main(String[] args) {
		System.out.println("Publishing Student Service...");
		String location = "http://localhost:1231/SFWsdl";
		Endpoint getEndpoint = Endpoint.create(new ScoreManageSOAPImpl());
		StudentServicePublisher s = new StudentServicePublisher();
		s.addWSDLAsset(getEndpoint);
		getEndpoint.publish(location);
		System.out.println("OK");
		System.out.println();
		System.out.println("Location: " + location);
	}

	public void addWSDLAsset(Endpoint endpoint) {
		ArrayList<Source> metadata = new ArrayList<Source>();
		addWsdlSource(metadata,"/wsdl/scoreManageSOAP.wsdl");
		addWsdlSource(metadata,"Course.xsd");
		addWsdlSource(metadata,"Department.xsd");
		addWsdlSource(metadata,"PersonInfo.xsd");
		addWsdlSource(metadata,"Score.xsd");
		addWsdlSource(metadata,"ScoreList.xsd");
		addWsdlSource(metadata,"Student.xsd");
		endpoint.setMetadata(metadata);
	}
	
	public static void addWsdlSource(ArrayList<Source> metadata,String path) {
		InputStream wsdlStream = StudentServicePublisher.class.getClassLoader().getResourceAsStream(path);
		URL wsdlURL = StudentServicePublisher.class.getClassLoader().getResource(path);
		if (wsdlStream == null) {
			throw new RuntimeException("Cannont find WSDL resouce file.");
		}
		Source wsdlSource = new StreamSource(wsdlStream);
		String wsdlId = wsdlURL.toExternalForm();
		wsdlSource.setSystemId(wsdlId);
		metadata.add(wsdlSource);
	}
}
