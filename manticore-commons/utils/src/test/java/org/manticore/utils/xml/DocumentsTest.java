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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author gdeignacio
 */
public class DocumentsTest {
    
    public DocumentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public static boolean isJDK7OrLower() {
        boolean jdk7OrLower = true;
        try {
            Class.class.getDeclaredField("annotations");
        } catch (NoSuchFieldException e) {
            //Willfully ignore all exceptions
            jdk7OrLower = false;
        }
        return jdk7OrLower;
    }

    
    /**
     * Test of dummy method, of class AEAT103Iv3Client.
     */
    @Test
    public void testElement() {
        System.out.println("dummy");
        
    }
    
    

    /**
     * Test of stringToElement method, of class XmlUtils.
     */
    @Test
    public void testStringToElement() {
        
        System.out.println("Is 7 OR LESS: " + isJDK7OrLower());
      
    }
    
}
