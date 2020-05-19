/*
 * Copyright 2020 gdeignacio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.manticore.utils.xml;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Element;

/**
 *
 * @author gdeignacio
 */
public class XmlManagerTest {
    
    
    XmlManager<MessageDescriptionXmlWrapper> manager;
    
    MessageDescriptionXmlWrapper item;
    
    
    
    public XmlManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        try {
            manager = new XmlManager<MessageDescriptionXmlWrapper>(MessageDescriptionXmlWrapper.class);
            
            item = new MessageDescriptionXmlWrapper();
            
            
            
            
        } catch (JAXBException ex) {
            Logger.getLogger(XmlManagerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    @After
    public void tearDown() {
    }

    
   
    
    
    /**
     * Test of getXmlSchemaAnnotation method, of class XmlManager.
     */
    @Test
    public void testGetXmlSchemaAnnotation() {
        
        System.out.println("getXmlSchemaAnnotation");
        
        XmlSchema xmlSchemaAnnotation = manager.getXmlSchemaAnnotation();
  
        System.out.println("SCHEMANAMESPACE: " + xmlSchemaAnnotation.namespace());
        System.out.println("LOCATION: " + xmlSchemaAnnotation.location());
        
    }
    
    /**
     * Test of getXmlSchemaAnnotation method, of class XmlManager.
     */
    @Test
    public void testGetXmlRootElementAnnotation() {
        
        System.out.println("getXmlRootElementAnnotation");
        
        XmlRootElement xmlRootElementAnnotation = manager.getXmlRootElementAnnotation();
  
        System.out.println("ROOTNAMESPACE: " + xmlRootElementAnnotation.namespace());
        System.out.println("NAME: " + xmlRootElementAnnotation.name());
        
    }
    
    

    /**
     * Test of generateElement method, of class XmlManager.
     */
    @Test
    public void testGenerateElement_GenericType() throws Exception {
        System.out.println("generateElement");
        
        Element result = manager.generateElement(item, true);
        System.out.println("ELEMENT: " + result.toString());
        
    }
    
    
    
    /**
     * Test of generateElement method, of class XmlManager.
     */
    @Test
    public void testGetJAXBElement_GenericType() throws Exception {
        System.out.println("getJAXBElement");
        
        JAXBElement<MessageDescriptionXmlWrapper> result = manager.getJAXBElement(item);
        System.out.println("JAXBELEMENT: " + result);
        
    }
    
    
        /**
     * Test of generateElement method, of class XmlManager.
     */
    @Test
    public void testGenerateXmlString_GenericType() throws Exception {
        System.out.println("generateXmlString");
        
        String result = manager.generateXmlString(item);
        System.out.println("STRING: " + result.toString());
        
    }

    

  
    
}
