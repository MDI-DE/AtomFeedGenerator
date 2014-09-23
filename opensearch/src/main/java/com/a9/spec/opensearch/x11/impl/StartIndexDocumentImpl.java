/*
 * An XML document type.
 * Localname: startIndex
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.StartIndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * A document containing one startIndex(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public class StartIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.StartIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTINDEX$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "startIndex");
    
    
    /**
     * Gets the "startIndex" element
     */
    public long getStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINDEX$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "startIndex" element
     */
    public org.apache.xmlbeans.XmlLong xgetStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(STARTINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startIndex" element
     */
    public void setStartIndex(long startIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTINDEX$0);
            }
            target.setLongValue(startIndex);
        }
    }
    
    /**
     * Sets (as xml) the "startIndex" element
     */
    public void xsetStartIndex(org.apache.xmlbeans.XmlLong startIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(STARTINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(STARTINDEX$0);
            }
            target.set(startIndex);
        }
    }
}
