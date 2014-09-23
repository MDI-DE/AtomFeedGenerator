/*
 * An XML document type.
 * Localname: itemsPerPage
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.ItemsPerPageDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * A document containing one itemsPerPage(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public class ItemsPerPageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.ItemsPerPageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemsPerPageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMSPERPAGE$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "itemsPerPage");
    
    
    /**
     * Gets the "itemsPerPage" element
     */
    public long getItemsPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMSPERPAGE$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemsPerPage" element
     */
    public org.apache.xmlbeans.XmlLong xgetItemsPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ITEMSPERPAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "itemsPerPage" element
     */
    public void setItemsPerPage(long itemsPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMSPERPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMSPERPAGE$0);
            }
            target.setLongValue(itemsPerPage);
        }
    }
    
    /**
     * Sets (as xml) the "itemsPerPage" element
     */
    public void xsetItemsPerPage(org.apache.xmlbeans.XmlLong itemsPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ITEMSPERPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ITEMSPERPAGE$0);
            }
            target.set(itemsPerPage);
        }
    }
}
