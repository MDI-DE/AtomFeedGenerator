/*
 * An XML document type.
 * Localname: OpenSearchDescription
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11.impl;
/**
 * A document containing one OpenSearchDescription(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public class OpenSearchDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpenSearchDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENSEARCHDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "OpenSearchDescription");
    
    
    /**
     * Gets the "OpenSearchDescription" element
     */
    public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription getOpenSearchDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription target = null;
            target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription)get_store().find_element_user(OPENSEARCHDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OpenSearchDescription" element
     */
    public void setOpenSearchDescription(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription openSearchDescription)
    {
        generatedSetterHelperImpl(openSearchDescription, OPENSEARCHDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OpenSearchDescription" element
     */
    public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription addNewOpenSearchDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription target = null;
            target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription)get_store().add_element_user(OPENSEARCHDESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML OpenSearchDescription(@http://a9.com/-/spec/opensearch/1.1/).
     *
     * This is a complex type.
     */
    public static class OpenSearchDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription
    {
        private static final long serialVersionUID = 1L;
        
        public OpenSearchDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SHORTNAME$0 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "ShortName");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Description");
        private static final javax.xml.namespace.QName URL$4 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Url");
        private static final javax.xml.namespace.QName CONTACT$6 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Contact");
        private static final javax.xml.namespace.QName TAGS$8 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Tags");
        private static final javax.xml.namespace.QName LONGNAME$10 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "LongName");
        private static final javax.xml.namespace.QName IMAGE$12 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Image");
        private static final javax.xml.namespace.QName QUERY$14 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Query");
        private static final javax.xml.namespace.QName DEVELOPER$16 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Developer");
        private static final javax.xml.namespace.QName ATTRIBUTION$18 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Attribution");
        private static final javax.xml.namespace.QName SYNDICATIONRIGHT$20 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "SyndicationRight");
        private static final javax.xml.namespace.QName ADULTCONTENT$22 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "AdultContent");
        private static final javax.xml.namespace.QName LANGUAGE$24 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "Language");
        private static final javax.xml.namespace.QName INPUTENCODING$26 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "InputEncoding");
        private static final javax.xml.namespace.QName OUTPUTENCODING$28 = 
            new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "OutputEncoding");
        
        
        /**
         * Gets the "ShortName" element
         */
        public java.lang.String getShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ShortName" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName xgetShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName)get_store().find_element_user(SHORTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ShortName" element
         */
        public void setShortName(java.lang.String shortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTNAME$0);
                }
                target.setStringValue(shortName);
            }
        }
        
        /**
         * Sets (as xml) the "ShortName" element
         */
        public void xsetShortName(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName shortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName)get_store().find_element_user(SHORTNAME$0, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName)get_store().add_element_user(SHORTNAME$0);
                }
                target.set(shortName);
            }
        }
        
        /**
         * Gets the "Description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Description" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "Description" element
         */
        public void xsetDescription(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "Url" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Url" element
         */
        public void setUrl(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url url)
        {
            generatedSetterHelperImpl(url, URL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Url" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url addNewUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url)get_store().add_element_user(URL$4);
                return target;
            }
        }
        
        /**
         * Gets the "Contact" element
         */
        public java.lang.String getContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Contact" element
         */
        public org.apache.xmlbeans.XmlString xgetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Contact" element
         */
        public boolean isSetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT$6) != 0;
            }
        }
        
        /**
         * Sets the "Contact" element
         */
        public void setContact(java.lang.String contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT$6);
                }
                target.setStringValue(contact);
            }
        }
        
        /**
         * Sets (as xml) the "Contact" element
         */
        public void xsetContact(org.apache.xmlbeans.XmlString contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT$6);
                }
                target.set(contact);
            }
        }
        
        /**
         * Unsets the "Contact" element
         */
        public void unsetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT$6, 0);
            }
        }
        
        /**
         * Gets the "Tags" element
         */
        public java.lang.String getTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAGS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Tags" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags xgetTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags)get_store().find_element_user(TAGS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Tags" element
         */
        public boolean isSetTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAGS$8) != 0;
            }
        }
        
        /**
         * Sets the "Tags" element
         */
        public void setTags(java.lang.String tags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAGS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAGS$8);
                }
                target.setStringValue(tags);
            }
        }
        
        /**
         * Sets (as xml) the "Tags" element
         */
        public void xsetTags(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags tags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags)get_store().find_element_user(TAGS$8, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags)get_store().add_element_user(TAGS$8);
                }
                target.set(tags);
            }
        }
        
        /**
         * Unsets the "Tags" element
         */
        public void unsetTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAGS$8, 0);
            }
        }
        
        /**
         * Gets the "LongName" element
         */
        public java.lang.String getLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGNAME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LongName" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName xgetLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName)get_store().find_element_user(LONGNAME$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "LongName" element
         */
        public boolean isSetLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONGNAME$10) != 0;
            }
        }
        
        /**
         * Sets the "LongName" element
         */
        public void setLongName(java.lang.String longName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGNAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGNAME$10);
                }
                target.setStringValue(longName);
            }
        }
        
        /**
         * Sets (as xml) the "LongName" element
         */
        public void xsetLongName(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName longName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName)get_store().find_element_user(LONGNAME$10, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName)get_store().add_element_user(LONGNAME$10);
                }
                target.set(longName);
            }
        }
        
        /**
         * Unsets the "LongName" element
         */
        public void unsetLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONGNAME$10, 0);
            }
        }
        
        /**
         * Gets the "Image" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image getImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image)get_store().find_element_user(IMAGE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Image" element
         */
        public boolean isSetImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMAGE$12) != 0;
            }
        }
        
        /**
         * Sets the "Image" element
         */
        public void setImage(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image image)
        {
            generatedSetterHelperImpl(image, IMAGE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Image" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image addNewImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image)get_store().add_element_user(IMAGE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Image" element
         */
        public void unsetImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMAGE$12, 0);
            }
        }
        
        /**
         * Gets the "Query" element
         */
        public com.a9.spec.opensearch.x11.QueryType getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.QueryType target = null;
                target = (com.a9.spec.opensearch.x11.QueryType)get_store().find_element_user(QUERY$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Query" element
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERY$14) != 0;
            }
        }
        
        /**
         * Sets the "Query" element
         */
        public void setQuery(com.a9.spec.opensearch.x11.QueryType query)
        {
            generatedSetterHelperImpl(query, QUERY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.a9.spec.opensearch.x11.QueryType)get_store().add_element_user(QUERY$14);
                return target;
            }
        }
        
        /**
         * Unsets the "Query" element
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERY$14, 0);
            }
        }
        
        /**
         * Gets the "Developer" element
         */
        public java.lang.String getDeveloper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Developer" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer xgetDeveloper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer)get_store().find_element_user(DEVELOPER$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "Developer" element
         */
        public boolean isSetDeveloper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEVELOPER$16) != 0;
            }
        }
        
        /**
         * Sets the "Developer" element
         */
        public void setDeveloper(java.lang.String developer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEVELOPER$16);
                }
                target.setStringValue(developer);
            }
        }
        
        /**
         * Sets (as xml) the "Developer" element
         */
        public void xsetDeveloper(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer developer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer)get_store().find_element_user(DEVELOPER$16, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer)get_store().add_element_user(DEVELOPER$16);
                }
                target.set(developer);
            }
        }
        
        /**
         * Unsets the "Developer" element
         */
        public void unsetDeveloper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEVELOPER$16, 0);
            }
        }
        
        /**
         * Gets the "Attribution" element
         */
        public java.lang.String getAttribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTION$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Attribution" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution xgetAttribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution)get_store().find_element_user(ATTRIBUTION$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "Attribution" element
         */
        public boolean isSetAttribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTION$18) != 0;
            }
        }
        
        /**
         * Sets the "Attribution" element
         */
        public void setAttribution(java.lang.String attribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTION$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTION$18);
                }
                target.setStringValue(attribution);
            }
        }
        
        /**
         * Sets (as xml) the "Attribution" element
         */
        public void xsetAttribution(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution attribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution)get_store().find_element_user(ATTRIBUTION$18, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution)get_store().add_element_user(ATTRIBUTION$18);
                }
                target.set(attribution);
            }
        }
        
        /**
         * Unsets the "Attribution" element
         */
        public void unsetAttribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTION$18, 0);
            }
        }
        
        /**
         * Gets the "SyndicationRight" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight.Enum getSyndicationRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNDICATIONRIGHT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SyndicationRight" element
         */
        public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight xgetSyndicationRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight)get_store().find_element_user(SYNDICATIONRIGHT$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "SyndicationRight" element
         */
        public boolean isSetSyndicationRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYNDICATIONRIGHT$20) != 0;
            }
        }
        
        /**
         * Sets the "SyndicationRight" element
         */
        public void setSyndicationRight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight.Enum syndicationRight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNDICATIONRIGHT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNDICATIONRIGHT$20);
                }
                target.setEnumValue(syndicationRight);
            }
        }
        
        /**
         * Sets (as xml) the "SyndicationRight" element
         */
        public void xsetSyndicationRight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight syndicationRight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight target = null;
                target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight)get_store().find_element_user(SYNDICATIONRIGHT$20, 0);
                if (target == null)
                {
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight)get_store().add_element_user(SYNDICATIONRIGHT$20);
                }
                target.set(syndicationRight);
            }
        }
        
        /**
         * Unsets the "SyndicationRight" element
         */
        public void unsetSyndicationRight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYNDICATIONRIGHT$20, 0);
            }
        }
        
        /**
         * Gets the "AdultContent" element
         */
        public java.lang.String getAdultContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTCONTENT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdultContent" element
         */
        public org.apache.xmlbeans.XmlString xgetAdultContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTCONTENT$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdultContent" element
         */
        public boolean isSetAdultContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADULTCONTENT$22) != 0;
            }
        }
        
        /**
         * Sets the "AdultContent" element
         */
        public void setAdultContent(java.lang.String adultContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTCONTENT$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADULTCONTENT$22);
                }
                target.setStringValue(adultContent);
            }
        }
        
        /**
         * Sets (as xml) the "AdultContent" element
         */
        public void xsetAdultContent(org.apache.xmlbeans.XmlString adultContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTCONTENT$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADULTCONTENT$22);
                }
                target.set(adultContent);
            }
        }
        
        /**
         * Unsets the "AdultContent" element
         */
        public void unsetAdultContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADULTCONTENT$22, 0);
            }
        }
        
        /**
         * Gets the "Language" element
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Language" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "Language" element
         */
        public boolean isSetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGE$24) != 0;
            }
        }
        
        /**
         * Sets the "Language" element
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$24);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "Language" element
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlString language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$24);
                }
                target.set(language);
            }
        }
        
        /**
         * Unsets the "Language" element
         */
        public void unsetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGE$24, 0);
            }
        }
        
        /**
         * Gets the "InputEncoding" element
         */
        public java.lang.String getInputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTENCODING$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InputEncoding" element
         */
        public org.apache.xmlbeans.XmlString xgetInputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INPUTENCODING$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "InputEncoding" element
         */
        public boolean isSetInputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INPUTENCODING$26) != 0;
            }
        }
        
        /**
         * Sets the "InputEncoding" element
         */
        public void setInputEncoding(java.lang.String inputEncoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTENCODING$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPUTENCODING$26);
                }
                target.setStringValue(inputEncoding);
            }
        }
        
        /**
         * Sets (as xml) the "InputEncoding" element
         */
        public void xsetInputEncoding(org.apache.xmlbeans.XmlString inputEncoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INPUTENCODING$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INPUTENCODING$26);
                }
                target.set(inputEncoding);
            }
        }
        
        /**
         * Unsets the "InputEncoding" element
         */
        public void unsetInputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INPUTENCODING$26, 0);
            }
        }
        
        /**
         * Gets the "OutputEncoding" element
         */
        public java.lang.String getOutputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTENCODING$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OutputEncoding" element
         */
        public org.apache.xmlbeans.XmlString xgetOutputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTENCODING$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "OutputEncoding" element
         */
        public boolean isSetOutputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTPUTENCODING$28) != 0;
            }
        }
        
        /**
         * Sets the "OutputEncoding" element
         */
        public void setOutputEncoding(java.lang.String outputEncoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTENCODING$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUTENCODING$28);
                }
                target.setStringValue(outputEncoding);
            }
        }
        
        /**
         * Sets (as xml) the "OutputEncoding" element
         */
        public void xsetOutputEncoding(org.apache.xmlbeans.XmlString outputEncoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTENCODING$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTPUTENCODING$28);
                }
                target.set(outputEncoding);
            }
        }
        
        /**
         * Unsets the "OutputEncoding" element
         */
        public void unsetOutputEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTPUTENCODING$28, 0);
            }
        }
        /**
         * An XML ShortName(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$ShortName.
         */
        public static class ShortNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName
        {
            private static final long serialVersionUID = 1L;
            
            public ShortNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ShortNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Description(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Description.
         */
        public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description
        {
            private static final long serialVersionUID = 1L;
            
            public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Url(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is a complex type.
         */
        public static class UrlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url
        {
            private static final long serialVersionUID = 1L;
            
            public UrlImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEMPLATE$0 = 
                new javax.xml.namespace.QName("", "template");
            private static final javax.xml.namespace.QName TYPE$2 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName REL$4 = 
                new javax.xml.namespace.QName("", "rel");
            private static final javax.xml.namespace.QName INDEXOFFSET$6 = 
                new javax.xml.namespace.QName("", "indexOffset");
            private static final javax.xml.namespace.QName PAGEOFFSET$8 = 
                new javax.xml.namespace.QName("", "pageOffset");
            
            
            /**
             * Gets the "template" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getTemplate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TEMPLATE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "template" attribute
             */
            public void setTemplate(org.apache.xmlbeans.XmlAnySimpleType template)
            {
                generatedSetterHelperImpl(template, TEMPLATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "template" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewTemplate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TEMPLATE$0);
                    return target;
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(org.apache.xmlbeans.XmlAnySimpleType type)
            {
                generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "type" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TYPE$2);
                    return target;
                }
            }
            
            /**
             * Gets the "rel" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(REL$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "rel" attribute
             */
            public void setRel(org.apache.xmlbeans.XmlAnySimpleType rel)
            {
                generatedSetterHelperImpl(rel, REL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "rel" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(REL$4);
                    return target;
                }
            }
            
            /**
             * Gets the "indexOffset" attribute
             */
            public java.math.BigInteger getIndexOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXOFFSET$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDEXOFFSET$6);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "indexOffset" attribute
             */
            public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset xgetIndexOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset)get_store().find_attribute_user(INDEXOFFSET$6);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset)get_default_attribute_value(INDEXOFFSET$6);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "indexOffset" attribute
             */
            public boolean isSetIndexOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INDEXOFFSET$6) != null;
                }
            }
            
            /**
             * Sets the "indexOffset" attribute
             */
            public void setIndexOffset(java.math.BigInteger indexOffset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXOFFSET$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXOFFSET$6);
                    }
                    target.setBigIntegerValue(indexOffset);
                }
            }
            
            /**
             * Sets (as xml) the "indexOffset" attribute
             */
            public void xsetIndexOffset(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset indexOffset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset)get_store().find_attribute_user(INDEXOFFSET$6);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset)get_store().add_attribute_user(INDEXOFFSET$6);
                    }
                    target.set(indexOffset);
                }
            }
            
            /**
             * Unsets the "indexOffset" attribute
             */
            public void unsetIndexOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INDEXOFFSET$6);
                }
            }
            
            /**
             * Gets the "pageOffset" attribute
             */
            public java.math.BigInteger getPageOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEOFFSET$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGEOFFSET$8);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "pageOffset" attribute
             */
            public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset xgetPageOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset)get_store().find_attribute_user(PAGEOFFSET$8);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset)get_default_attribute_value(PAGEOFFSET$8);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "pageOffset" attribute
             */
            public boolean isSetPageOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PAGEOFFSET$8) != null;
                }
            }
            
            /**
             * Sets the "pageOffset" attribute
             */
            public void setPageOffset(java.math.BigInteger pageOffset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEOFFSET$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEOFFSET$8);
                    }
                    target.setBigIntegerValue(pageOffset);
                }
            }
            
            /**
             * Sets (as xml) the "pageOffset" attribute
             */
            public void xsetPageOffset(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset pageOffset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset)get_store().find_attribute_user(PAGEOFFSET$8);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset)get_store().add_attribute_user(PAGEOFFSET$8);
                    }
                    target.set(pageOffset);
                }
            }
            
            /**
             * Unsets the "pageOffset" attribute
             */
            public void unsetPageOffset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PAGEOFFSET$8);
                }
            }
            /**
             * An XML indexOffset(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Url$IndexOffset.
             */
            public static class IndexOffsetImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset
            {
                private static final long serialVersionUID = 1L;
                
                public IndexOffsetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected IndexOffsetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML pageOffset(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Url$PageOffset.
             */
            public static class PageOffsetImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset
            {
                private static final long serialVersionUID = 1L;
                
                public PageOffsetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PageOffsetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML Tags(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Tags.
         */
        public static class TagsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags
        {
            private static final long serialVersionUID = 1L;
            
            public TagsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TagsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML LongName(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$LongName.
         */
        public static class LongNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName
        {
            private static final long serialVersionUID = 1L;
            
            public LongNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected LongNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Image(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is a complex type.
         */
        public static class ImageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image
        {
            private static final long serialVersionUID = 1L;
            
            public ImageImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName HEIGHT$0 = 
                new javax.xml.namespace.QName("", "height");
            private static final javax.xml.namespace.QName WIDTH$2 = 
                new javax.xml.namespace.QName("", "width");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("", "type");
            
            
            /**
             * Gets the "height" attribute
             */
            public java.math.BigInteger getHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "height" attribute
             */
            public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height xgetHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height)get_store().find_attribute_user(HEIGHT$0);
                    return target;
                }
            }
            
            /**
             * True if has "height" attribute
             */
            public boolean isSetHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HEIGHT$0) != null;
                }
            }
            
            /**
             * Sets the "height" attribute
             */
            public void setHeight(java.math.BigInteger height)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$0);
                    }
                    target.setBigIntegerValue(height);
                }
            }
            
            /**
             * Sets (as xml) the "height" attribute
             */
            public void xsetHeight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height height)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height)get_store().find_attribute_user(HEIGHT$0);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height)get_store().add_attribute_user(HEIGHT$0);
                    }
                    target.set(height);
                }
            }
            
            /**
             * Unsets the "height" attribute
             */
            public void unsetHeight()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HEIGHT$0);
                }
            }
            
            /**
             * Gets the "width" attribute
             */
            public java.math.BigInteger getWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "width" attribute
             */
            public com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width xgetWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width)get_store().find_attribute_user(WIDTH$2);
                    return target;
                }
            }
            
            /**
             * True if has "width" attribute
             */
            public boolean isSetWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(WIDTH$2) != null;
                }
            }
            
            /**
             * Sets the "width" attribute
             */
            public void setWidth(java.math.BigInteger width)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$2);
                    }
                    target.setBigIntegerValue(width);
                }
            }
            
            /**
             * Sets (as xml) the "width" attribute
             */
            public void xsetWidth(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width width)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width target = null;
                    target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width)get_store().find_attribute_user(WIDTH$2);
                    if (target == null)
                    {
                      target = (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width)get_store().add_attribute_user(WIDTH$2);
                    }
                    target.set(width);
                }
            }
            
            /**
             * Unsets the "width" attribute
             */
            public void unsetWidth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(WIDTH$2);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$4) != null;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(org.apache.xmlbeans.XmlAnySimpleType type)
            {
                generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "type" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TYPE$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$4);
                }
            }
            /**
             * An XML height(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Image$Height.
             */
            public static class HeightImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height
            {
                private static final long serialVersionUID = 1L;
                
                public HeightImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected HeightImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML width(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Image$Width.
             */
            public static class WidthImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width
            {
                private static final long serialVersionUID = 1L;
                
                public WidthImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected WidthImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML Developer(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Developer.
         */
        public static class DeveloperImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer
        {
            private static final long serialVersionUID = 1L;
            
            public DeveloperImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DeveloperImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Attribution(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Attribution.
         */
        public static class AttributionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution
        {
            private static final long serialVersionUID = 1L;
            
            public AttributionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AttributionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML SyndicationRight(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$SyndicationRight.
         */
        public static class SyndicationRightImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight
        {
            private static final long serialVersionUID = 1L;
            
            public SyndicationRightImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SyndicationRightImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
