package cn.wp.utils;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;

import cn.wp.window.RootWindow;
import sun.net.util.URLUtil;
import sun.net.www.content.audio.x_aiff;
import sun.tools.tree.ThisExpression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;  

/*
 * XML文件操作类，用于读取XML文件和修改XML文件
**/

public class XMLUtils {
	//读取xml文件，并根据指定标签名返回对应的文本,读取使用sax
	public static void getInfo(InputStream filepath,String name){
		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
            XMLReader xr = parser.getXMLReader();
            xr.setContentHandler(new BeanLisrHandler(name));
           
            if (filepath!=null) {
				xr.parse(new InputSource(new InputStreamReader(filepath)));
			}
		} catch (ParserConfigurationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
		
	}

}
class BeanLisrHandler extends DefaultHandler{
	private String tagName;
	private String tagString;
	public BeanLisrHandler(String name){
		this.tagName = name;
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tagString = qName;
		//System.out.println(123);
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println(456);
		if (tagName.equals(tagString)) {
			//输出
			//System.out.println(789);
			RootWindow.getTishi().setText(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		tagString = null;
	}

}