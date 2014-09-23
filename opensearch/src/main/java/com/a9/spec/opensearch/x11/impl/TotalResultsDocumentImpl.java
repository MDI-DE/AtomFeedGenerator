/*
 * An XML document type.
 * Localname: totalResults
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.TotalResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * A document containing one totalResults(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public class TotalResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.TotalResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TotalResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALRESULTS$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "totalResults");
    
    
    /**
     * Gets the "totalResults" element
     */
    public long getTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalResults" element
     */
    public org.apache.xmlbeans.XmlLong xgetTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALRESULTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalResults" element
     */
    public void setTotalResults(long totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRESULTS$0);
            }
            target.setLongValue(totalResults);
        }
    }
    
    /**
     * Sets (as xml) the "totalResults" element
     */
    public void xsetTotalResults(org.apache.xmlbeans.XmlLong totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TOTALRESULTS$0);
            }
            target.set(totalResults);
        }
    }
}
