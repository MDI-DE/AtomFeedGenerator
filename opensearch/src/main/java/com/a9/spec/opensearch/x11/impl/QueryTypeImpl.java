/*
 * XML Type:  QueryType
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.QueryType
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * An XML QueryType(@http://a9.com/-/spec/opensearch/1.1/).
 *
 * This is a complex type.
 */
public class QueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.QueryType
{
    private static final long serialVersionUID = 1L;
    
    public QueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("", "role");
    private static final javax.xml.namespace.QName TITLE$2 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName TOTALRESULTS$4 = 
        new javax.xml.namespace.QName("", "totalResults");
    private static final javax.xml.namespace.QName SEARCHTERMS$6 = 
        new javax.xml.namespace.QName("", "searchTerms");
    private static final javax.xml.namespace.QName COUNT$8 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName STARTINDEX$10 = 
        new javax.xml.namespace.QName("", "startIndex");
    private static final javax.xml.namespace.QName STARTPAGE$12 = 
        new javax.xml.namespace.QName("", "startPage");
    private static final javax.xml.namespace.QName LANGUAGE$14 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName INPUTENCODING$16 = 
        new javax.xml.namespace.QName("", "inputEncoding");
    private static final javax.xml.namespace.QName OUTPUTENCODING$18 = 
        new javax.xml.namespace.QName("", "outputEncoding");
    
    
    /**
     * Gets the "role" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.Role.Enum getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                return null;
            }
            return (com.a9.spec.opensearch.x11.QueryType.Role.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.Role xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Role target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Role)get_store().find_attribute_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    public void setRole(com.a9.spec.opensearch.x11.QueryType.Role.Enum role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$0);
            }
            target.setEnumValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(com.a9.spec.opensearch.x11.QueryType.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Role target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Role)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.Role)get_store().add_attribute_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.Title xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Title target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Title)get_store().find_attribute_user(TITLE$2);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$2) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$2);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(com.a9.spec.opensearch.x11.QueryType.Title title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Title target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Title)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.Title)get_store().add_attribute_user(TITLE$2);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$2);
        }
    }
    
    /**
     * Gets the "totalResults" attribute
     */
    public java.math.BigInteger getTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALRESULTS$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalResults" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.TotalResults xgetTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.TotalResults target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.TotalResults)get_store().find_attribute_user(TOTALRESULTS$4);
            return target;
        }
    }
    
    /**
     * True if has "totalResults" attribute
     */
    public boolean isSetTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALRESULTS$4) != null;
        }
    }
    
    /**
     * Sets the "totalResults" attribute
     */
    public void setTotalResults(java.math.BigInteger totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALRESULTS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALRESULTS$4);
            }
            target.setBigIntegerValue(totalResults);
        }
    }
    
    /**
     * Sets (as xml) the "totalResults" attribute
     */
    public void xsetTotalResults(com.a9.spec.opensearch.x11.QueryType.TotalResults totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.TotalResults target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.TotalResults)get_store().find_attribute_user(TOTALRESULTS$4);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.TotalResults)get_store().add_attribute_user(TOTALRESULTS$4);
            }
            target.set(totalResults);
        }
    }
    
    /**
     * Unsets the "totalResults" attribute
     */
    public void unsetTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALRESULTS$4);
        }
    }
    
    /**
     * Gets the "searchTerms" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getSearchTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(SEARCHTERMS$6);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "searchTerms" attribute
     */
    public boolean isSetSearchTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEARCHTERMS$6) != null;
        }
    }
    
    /**
     * Sets the "searchTerms" attribute
     */
    public void setSearchTerms(org.apache.xmlbeans.XmlAnySimpleType searchTerms)
    {
        generatedSetterHelperImpl(searchTerms, SEARCHTERMS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "searchTerms" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewSearchTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(SEARCHTERMS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "searchTerms" attribute
     */
    public void unsetSearchTerms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEARCHTERMS$6);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.Count xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Count target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Count)get_store().find_attribute_user(COUNT$8);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$8) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$8);
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(com.a9.spec.opensearch.x11.QueryType.Count count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.Count target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.Count)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.Count)get_store().add_attribute_user(COUNT$8);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$8);
        }
    }
    
    /**
     * Gets the "startIndex" attribute
     */
    public java.math.BigInteger getStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTINDEX$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "startIndex" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.StartIndex xgetStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.StartIndex target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.StartIndex)get_store().find_attribute_user(STARTINDEX$10);
            return target;
        }
    }
    
    /**
     * True if has "startIndex" attribute
     */
    public boolean isSetStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTINDEX$10) != null;
        }
    }
    
    /**
     * Sets the "startIndex" attribute
     */
    public void setStartIndex(java.math.BigInteger startIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTINDEX$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTINDEX$10);
            }
            target.setBigIntegerValue(startIndex);
        }
    }
    
    /**
     * Sets (as xml) the "startIndex" attribute
     */
    public void xsetStartIndex(com.a9.spec.opensearch.x11.QueryType.StartIndex startIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.StartIndex target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.StartIndex)get_store().find_attribute_user(STARTINDEX$10);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.StartIndex)get_store().add_attribute_user(STARTINDEX$10);
            }
            target.set(startIndex);
        }
    }
    
    /**
     * Unsets the "startIndex" attribute
     */
    public void unsetStartIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTINDEX$10);
        }
    }
    
    /**
     * Gets the "startPage" attribute
     */
    public java.math.BigInteger getStartPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTPAGE$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "startPage" attribute
     */
    public com.a9.spec.opensearch.x11.QueryType.StartPage xgetStartPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.StartPage target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.StartPage)get_store().find_attribute_user(STARTPAGE$12);
            return target;
        }
    }
    
    /**
     * True if has "startPage" attribute
     */
    public boolean isSetStartPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTPAGE$12) != null;
        }
    }
    
    /**
     * Sets the "startPage" attribute
     */
    public void setStartPage(java.math.BigInteger startPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTPAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTPAGE$12);
            }
            target.setBigIntegerValue(startPage);
        }
    }
    
    /**
     * Sets (as xml) the "startPage" attribute
     */
    public void xsetStartPage(com.a9.spec.opensearch.x11.QueryType.StartPage startPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.QueryType.StartPage target = null;
            target = (com.a9.spec.opensearch.x11.QueryType.StartPage)get_store().find_attribute_user(STARTPAGE$12);
            if (target == null)
            {
                target = (com.a9.spec.opensearch.x11.QueryType.StartPage)get_store().add_attribute_user(STARTPAGE$12);
            }
            target.set(startPage);
        }
    }
    
    /**
     * Unsets the "startPage" attribute
     */
    public void unsetStartPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTPAGE$12);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(LANGUAGE$14);
            }
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$14) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(org.apache.xmlbeans.XmlAnySimpleType language)
    {
        generatedSetterHelperImpl(language, LANGUAGE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "language" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LANGUAGE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$14);
        }
    }
    
    /**
     * Gets the "inputEncoding" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getInputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(INPUTENCODING$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(INPUTENCODING$16);
            }
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inputEncoding" attribute
     */
    public boolean isSetInputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INPUTENCODING$16) != null;
        }
    }
    
    /**
     * Sets the "inputEncoding" attribute
     */
    public void setInputEncoding(org.apache.xmlbeans.XmlAnySimpleType inputEncoding)
    {
        generatedSetterHelperImpl(inputEncoding, INPUTENCODING$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inputEncoding" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewInputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(INPUTENCODING$16);
            return target;
        }
    }
    
    /**
     * Unsets the "inputEncoding" attribute
     */
    public void unsetInputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INPUTENCODING$16);
        }
    }
    
    /**
     * Gets the "outputEncoding" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getOutputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(OUTPUTENCODING$18);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outputEncoding" attribute
     */
    public boolean isSetOutputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTPUTENCODING$18) != null;
        }
    }
    
    /**
     * Sets the "outputEncoding" attribute
     */
    public void setOutputEncoding(org.apache.xmlbeans.XmlAnySimpleType outputEncoding)
    {
        generatedSetterHelperImpl(outputEncoding, OUTPUTENCODING$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outputEncoding" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewOutputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(OUTPUTENCODING$18);
            return target;
        }
    }
    
    /**
     * Unsets the "outputEncoding" attribute
     */
    public void unsetOutputEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTPUTENCODING$18);
        }
    }
    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Role.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.a9.spec.opensearch.x11.QueryType.Role
    {
        private static final long serialVersionUID = 1L;
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML title(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Title.
     */
    public static class TitleImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.QueryType.Title
    {
        private static final long serialVersionUID = 1L;
        
        public TitleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TitleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML totalResults(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$TotalResults.
     */
    public static class TotalResultsImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.QueryType.TotalResults
    {
        private static final long serialVersionUID = 1L;
        
        public TotalResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TotalResultsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML count(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Count.
     */
    public static class CountImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.QueryType.Count
    {
        private static final long serialVersionUID = 1L;
        
        public CountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML startIndex(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$StartIndex.
     */
    public static class StartIndexImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.QueryType.StartIndex
    {
        private static final long serialVersionUID = 1L;
        
        public StartIndexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StartIndexImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML startPage(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$StartPage.
     */
    public static class StartPageImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.QueryType.StartPage
    {
        private static final long serialVersionUID = 1L;
        
        public StartPageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StartPageImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
