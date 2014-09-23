/*
 * An XML document type.
 * Localname: Query
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.QueryDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * A document containing one Query(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public class QueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.QueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public com.a9.spec.opensearch.x11.QueryType getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType target = null;
            target = (com.a9.spec.opensearch.x11.QueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(com.a9.spec.opensearch.x11.QueryType query)
    {
        generatedSetterHelperImpl(query, QUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public com.a9.spec.opensearch.x11.QueryType addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType target = null;
            target = (com.a9.spec.opensearch.x11.QueryType)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
}
