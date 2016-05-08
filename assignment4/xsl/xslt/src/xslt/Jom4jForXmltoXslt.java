package xslt;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.UnsupportedEncodingException;  
import java.net.URL;  
import java.net.URLDecoder;  
  
import javax.xml.transform.Transformer;  
import javax.xml.transform.TransformerException;  
import javax.xml.transform.TransformerFactory;  
import javax.xml.transform.stream.StreamSource;  
  
import org.dom4j.Document;  
import org.dom4j.DocumentException;  
import org.dom4j.io.DocumentResult;  
import org.dom4j.io.DocumentSource;  
import org.dom4j.io.OutputFormat;  
import org.dom4j.io.SAXReader;  
import org.dom4j.io.XMLWriter;  
  
  
public class Jom4jForXmltoXslt {  
/** 
 * ����xslt�ļ�ת��xml 
 * @author Administrator 
 * @parame document,styleSheet 
 */  
  public static Document transformDocument(Document document,File styleSheet)  
    throws TransformerException  
  {  
    TransformerFactory factory = TransformerFactory.newInstance();  
    Transformer transformer = factory.newTransformer(new StreamSource(styleSheet));  
  
    DocumentSource source = new DocumentSource(document);  
    DocumentResult result = new DocumentResult();  
    transformer.transform(source, result);  
  
    Document transformedDoc = result.getDocument();  
  
    return transformedDoc;  
  }  
/** 
 * ��ȡ��Ҫת����xml�ļ� 
 * @return Document 
 * @throws UnsupportedEncodingException 
 * @throws FileNotFoundException 
 */   
  public Document getRoleXML() throws UnsupportedEncodingException, FileNotFoundException   
  {  
	  
        InputStream is=null;  
        //URL url=this.getClass().getClassLoader().getResource("text.xml");  

        //if(url==null) return null;  
        //String path = url.getFile();  
        //path = URLDecoder.decode(path,"UTF-8");  
        is = new FileInputStream(new File("text.xml"));  
       // System.out.println("������menuConfig.xmlλ���ڣ�"+path);  
        SAXReader reader = new SAXReader();  
          
        try {  
            return reader.read(is);  
        } catch (DocumentException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
            
            return null;  
        }     
    }  
  public static void main(String args[]) throws IOException  
  {  
    try {  
        Document doc = new Jom4jForXmltoXslt().getRoleXML();          
        Document resultDoc = Jom4jForXmltoXslt.transformDocument(doc, new File("xslt.xsl"));  
          
        OutputFormat format = OutputFormat.createPrettyPrint();                                           
        format.setEncoding("UTF-8");   
          
        XMLWriter writer = new XMLWriter(new FileWriter(new File("output.xml")),format);  
        writer.write(resultDoc);   
        writer.close();   
        
  
          
    } catch (UnsupportedEncodingException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
    } catch (FileNotFoundException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
    } catch (TransformerException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
    }    
    }  
}  
