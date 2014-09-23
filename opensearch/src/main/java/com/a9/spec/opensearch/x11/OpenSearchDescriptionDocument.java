/*
 * An XML document type.
 * Localname: OpenSearchDescription
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11;


/**
 * A document containing one OpenSearchDescription(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public interface OpenSearchDescriptionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenSearchDescriptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("opensearchdescription3bc7doctype");
    
    /**
     * Gets the "OpenSearchDescription" element
     */
    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription getOpenSearchDescription();
    
    /**
     * Sets the "OpenSearchDescription" element
     */
    void setOpenSearchDescription(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription openSearchDescription);
    
    /**
     * Appends and returns a new empty "OpenSearchDescription" element
     */
    com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription addNewOpenSearchDescription();
    
    /**
     * An XML OpenSearchDescription(@http://a9.com/-/spec/opensearch/1.1/).
     *
     * This is a complex type.
     */
    public interface OpenSearchDescription extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenSearchDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("opensearchdescription8131elemtype");
        
        /**
         * Gets the "ShortName" element
         */
        java.lang.String getShortName();
        
        /**
         * Gets (as xml) the "ShortName" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName xgetShortName();
        
        /**
         * Sets the "ShortName" element
         */
        void setShortName(java.lang.String shortName);
        
        /**
         * Sets (as xml) the "ShortName" element
         */
        void xsetShortName(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName shortName);
        
        /**
         * Gets the "Description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description xgetDescription();
        
        /**
         * Sets the "Description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" element
         */
        void xsetDescription(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description description);
        
        /**
         * Gets the "Url" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url getUrl();
        
        /**
         * Sets the "Url" element
         */
        void setUrl(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url url);
        
        /**
         * Appends and returns a new empty "Url" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url addNewUrl();
        
        /**
         * Gets the "Contact" element
         */
        java.lang.String getContact();
        
        /**
         * Gets (as xml) the "Contact" element
         */
        org.apache.xmlbeans.XmlString xgetContact();
        
        /**
         * True if has "Contact" element
         */
        boolean isSetContact();
        
        /**
         * Sets the "Contact" element
         */
        void setContact(java.lang.String contact);
        
        /**
         * Sets (as xml) the "Contact" element
         */
        void xsetContact(org.apache.xmlbeans.XmlString contact);
        
        /**
         * Unsets the "Contact" element
         */
        void unsetContact();
        
        /**
         * Gets the "Tags" element
         */
        java.lang.String getTags();
        
        /**
         * Gets (as xml) the "Tags" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags xgetTags();
        
        /**
         * True if has "Tags" element
         */
        boolean isSetTags();
        
        /**
         * Sets the "Tags" element
         */
        void setTags(java.lang.String tags);
        
        /**
         * Sets (as xml) the "Tags" element
         */
        void xsetTags(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags tags);
        
        /**
         * Unsets the "Tags" element
         */
        void unsetTags();
        
        /**
         * Gets the "LongName" element
         */
        java.lang.String getLongName();
        
        /**
         * Gets (as xml) the "LongName" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName xgetLongName();
        
        /**
         * True if has "LongName" element
         */
        boolean isSetLongName();
        
        /**
         * Sets the "LongName" element
         */
        void setLongName(java.lang.String longName);
        
        /**
         * Sets (as xml) the "LongName" element
         */
        void xsetLongName(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName longName);
        
        /**
         * Unsets the "LongName" element
         */
        void unsetLongName();
        
        /**
         * Gets the "Image" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image getImage();
        
        /**
         * True if has "Image" element
         */
        boolean isSetImage();
        
        /**
         * Sets the "Image" element
         */
        void setImage(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image image);
        
        /**
         * Appends and returns a new empty "Image" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image addNewImage();
        
        /**
         * Unsets the "Image" element
         */
        void unsetImage();
        
        /**
         * Gets the "Query" element
         */
        com.a9.spec.opensearch.x11.QueryType getQuery();
        
        /**
         * True if has "Query" element
         */
        boolean isSetQuery();
        
        /**
         * Sets the "Query" element
         */
        void setQuery(com.a9.spec.opensearch.x11.QueryType query);
        
        /**
         * Appends and returns a new empty "Query" element
         */
        com.a9.spec.opensearch.x11.QueryType addNewQuery();
        
        /**
         * Unsets the "Query" element
         */
        void unsetQuery();
        
        /**
         * Gets the "Developer" element
         */
        java.lang.String getDeveloper();
        
        /**
         * Gets (as xml) the "Developer" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer xgetDeveloper();
        
        /**
         * True if has "Developer" element
         */
        boolean isSetDeveloper();
        
        /**
         * Sets the "Developer" element
         */
        void setDeveloper(java.lang.String developer);
        
        /**
         * Sets (as xml) the "Developer" element
         */
        void xsetDeveloper(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer developer);
        
        /**
         * Unsets the "Developer" element
         */
        void unsetDeveloper();
        
        /**
         * Gets the "Attribution" element
         */
        java.lang.String getAttribution();
        
        /**
         * Gets (as xml) the "Attribution" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution xgetAttribution();
        
        /**
         * True if has "Attribution" element
         */
        boolean isSetAttribution();
        
        /**
         * Sets the "Attribution" element
         */
        void setAttribution(java.lang.String attribution);
        
        /**
         * Sets (as xml) the "Attribution" element
         */
        void xsetAttribution(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution attribution);
        
        /**
         * Unsets the "Attribution" element
         */
        void unsetAttribution();
        
        /**
         * Gets the "SyndicationRight" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight.Enum getSyndicationRight();
        
        /**
         * Gets (as xml) the "SyndicationRight" element
         */
        com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight xgetSyndicationRight();
        
        /**
         * True if has "SyndicationRight" element
         */
        boolean isSetSyndicationRight();
        
        /**
         * Sets the "SyndicationRight" element
         */
        void setSyndicationRight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight.Enum syndicationRight);
        
        /**
         * Sets (as xml) the "SyndicationRight" element
         */
        void xsetSyndicationRight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight syndicationRight);
        
        /**
         * Unsets the "SyndicationRight" element
         */
        void unsetSyndicationRight();
        
        /**
         * Gets the "AdultContent" element
         */
        java.lang.String getAdultContent();
        
        /**
         * Gets (as xml) the "AdultContent" element
         */
        org.apache.xmlbeans.XmlString xgetAdultContent();
        
        /**
         * True if has "AdultContent" element
         */
        boolean isSetAdultContent();
        
        /**
         * Sets the "AdultContent" element
         */
        void setAdultContent(java.lang.String adultContent);
        
        /**
         * Sets (as xml) the "AdultContent" element
         */
        void xsetAdultContent(org.apache.xmlbeans.XmlString adultContent);
        
        /**
         * Unsets the "AdultContent" element
         */
        void unsetAdultContent();
        
        /**
         * Gets the "Language" element
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "Language" element
         */
        org.apache.xmlbeans.XmlString xgetLanguage();
        
        /**
         * True if has "Language" element
         */
        boolean isSetLanguage();
        
        /**
         * Sets the "Language" element
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "Language" element
         */
        void xsetLanguage(org.apache.xmlbeans.XmlString language);
        
        /**
         * Unsets the "Language" element
         */
        void unsetLanguage();
        
        /**
         * Gets the "InputEncoding" element
         */
        java.lang.String getInputEncoding();
        
        /**
         * Gets (as xml) the "InputEncoding" element
         */
        org.apache.xmlbeans.XmlString xgetInputEncoding();
        
        /**
         * True if has "InputEncoding" element
         */
        boolean isSetInputEncoding();
        
        /**
         * Sets the "InputEncoding" element
         */
        void setInputEncoding(java.lang.String inputEncoding);
        
        /**
         * Sets (as xml) the "InputEncoding" element
         */
        void xsetInputEncoding(org.apache.xmlbeans.XmlString inputEncoding);
        
        /**
         * Unsets the "InputEncoding" element
         */
        void unsetInputEncoding();
        
        /**
         * Gets the "OutputEncoding" element
         */
        java.lang.String getOutputEncoding();
        
        /**
         * Gets (as xml) the "OutputEncoding" element
         */
        org.apache.xmlbeans.XmlString xgetOutputEncoding();
        
        /**
         * True if has "OutputEncoding" element
         */
        boolean isSetOutputEncoding();
        
        /**
         * Sets the "OutputEncoding" element
         */
        void setOutputEncoding(java.lang.String outputEncoding);
        
        /**
         * Sets (as xml) the "OutputEncoding" element
         */
        void xsetOutputEncoding(org.apache.xmlbeans.XmlString outputEncoding);
        
        /**
         * Unsets the "OutputEncoding" element
         */
        void unsetOutputEncoding();
        
        /**
         * An XML ShortName(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$ShortName.
         */
        public interface ShortName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShortName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("shortnameb79eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.ShortName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Description(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Description.
         */
        public interface Description extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("description69e9elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Url(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is a complex type.
         */
        public interface Url extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Url.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("urlee56elemtype");
            
            /**
             * Gets the "template" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getTemplate();
            
            /**
             * Sets the "template" attribute
             */
            void setTemplate(org.apache.xmlbeans.XmlAnySimpleType template);
            
            /**
             * Appends and returns a new empty "template" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewTemplate();
            
            /**
             * Gets the "type" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getType();
            
            /**
             * Sets the "type" attribute
             */
            void setType(org.apache.xmlbeans.XmlAnySimpleType type);
            
            /**
             * Appends and returns a new empty "type" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewType();
            
            /**
             * Gets the "rel" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getRel();
            
            /**
             * Sets the "rel" attribute
             */
            void setRel(org.apache.xmlbeans.XmlAnySimpleType rel);
            
            /**
             * Appends and returns a new empty "rel" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewRel();
            
            /**
             * Gets the "indexOffset" attribute
             */
            java.math.BigInteger getIndexOffset();
            
            /**
             * Gets (as xml) the "indexOffset" attribute
             */
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset xgetIndexOffset();
            
            /**
             * True if has "indexOffset" attribute
             */
            boolean isSetIndexOffset();
            
            /**
             * Sets the "indexOffset" attribute
             */
            void setIndexOffset(java.math.BigInteger indexOffset);
            
            /**
             * Sets (as xml) the "indexOffset" attribute
             */
            void xsetIndexOffset(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset indexOffset);
            
            /**
             * Unsets the "indexOffset" attribute
             */
            void unsetIndexOffset();
            
            /**
             * Gets the "pageOffset" attribute
             */
            java.math.BigInteger getPageOffset();
            
            /**
             * Gets (as xml) the "pageOffset" attribute
             */
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset xgetPageOffset();
            
            /**
             * True if has "pageOffset" attribute
             */
            boolean isSetPageOffset();
            
            /**
             * Sets the "pageOffset" attribute
             */
            void setPageOffset(java.math.BigInteger pageOffset);
            
            /**
             * Sets (as xml) the "pageOffset" attribute
             */
            void xsetPageOffset(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset pageOffset);
            
            /**
             * Unsets the "pageOffset" attribute
             */
            void unsetPageOffset();
            
            /**
             * An XML indexOffset(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Url$IndexOffset.
             */
            public interface IndexOffset extends org.apache.xmlbeans.XmlInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexOffset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("indexoffset97c9attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset newValue(java.lang.Object obj) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset) type.newValue( obj ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset newInstance() {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.IndexOffset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML pageOffset(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Url$PageOffset.
             */
            public interface PageOffset extends org.apache.xmlbeans.XmlInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PageOffset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("pageoffset77f4attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset newValue(java.lang.Object obj) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset) type.newValue( obj ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset newInstance() {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url.PageOffset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Url) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Tags(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Tags.
         */
        public interface Tags extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("tagscb7celemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Tags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML LongName(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$LongName.
         */
        public interface LongName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LongName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("longname092eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.LongName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Image(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is a complex type.
         */
        public interface Image extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Image.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("image07eaelemtype");
            
            /**
             * Gets the "height" attribute
             */
            java.math.BigInteger getHeight();
            
            /**
             * Gets (as xml) the "height" attribute
             */
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height xgetHeight();
            
            /**
             * True if has "height" attribute
             */
            boolean isSetHeight();
            
            /**
             * Sets the "height" attribute
             */
            void setHeight(java.math.BigInteger height);
            
            /**
             * Sets (as xml) the "height" attribute
             */
            void xsetHeight(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height height);
            
            /**
             * Unsets the "height" attribute
             */
            void unsetHeight();
            
            /**
             * Gets the "width" attribute
             */
            java.math.BigInteger getWidth();
            
            /**
             * Gets (as xml) the "width" attribute
             */
            com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width xgetWidth();
            
            /**
             * True if has "width" attribute
             */
            boolean isSetWidth();
            
            /**
             * Sets the "width" attribute
             */
            void setWidth(java.math.BigInteger width);
            
            /**
             * Sets (as xml) the "width" attribute
             */
            void xsetWidth(com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width width);
            
            /**
             * Unsets the "width" attribute
             */
            void unsetWidth();
            
            /**
             * Gets the "type" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getType();
            
            /**
             * True if has "type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "type" attribute
             */
            void setType(org.apache.xmlbeans.XmlAnySimpleType type);
            
            /**
             * Appends and returns a new empty "type" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewType();
            
            /**
             * Unsets the "type" attribute
             */
            void unsetType();
            
            /**
             * An XML height(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Image$Height.
             */
            public interface Height extends org.apache.xmlbeans.XmlNegativeInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Height.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("heightc503attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height newValue(java.lang.Object obj) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height) type.newValue( obj ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height newInstance() {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Height) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML width(@).
             *
             * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Image$Width.
             */
            public interface Width extends org.apache.xmlbeans.XmlNonNegativeInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Width.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("widthd77cattrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width newValue(java.lang.Object obj) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width) type.newValue( obj ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width newInstance() {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image.Width) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Image) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Developer(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Developer.
         */
        public interface Developer extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Developer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("developer50dbelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Attribution(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$Attribution.
         */
        public interface Attribution extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attribution.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("attributionf546elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.Attribution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SyndicationRight(@http://a9.com/-/spec/opensearch/1.1/).
         *
         * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$SyndicationRight.
         */
        public interface SyndicationRight extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SyndicationRight.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("syndicationrightf8b8elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum OPEN = Enum.forString("open");
            static final Enum LIMITED = Enum.forString("limited");
            static final Enum PRIVATE = Enum.forString("private");
            static final Enum CLOSED = Enum.forString("closed");
            
            static final int INT_OPEN = Enum.INT_OPEN;
            static final int INT_LIMITED = Enum.INT_LIMITED;
            static final int INT_PRIVATE = Enum.INT_PRIVATE;
            static final int INT_CLOSED = Enum.INT_CLOSED;
            
            /**
             * Enumeration value class for com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument$OpenSearchDescription$SyndicationRight.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_OPEN
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_OPEN = 1;
                static final int INT_LIMITED = 2;
                static final int INT_PRIVATE = 3;
                static final int INT_CLOSED = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("open", INT_OPEN),
                      new Enum("limited", INT_LIMITED),
                      new Enum("private", INT_PRIVATE),
                      new Enum("closed", INT_CLOSED),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight newValue(java.lang.Object obj) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight) type.newValue( obj ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight newInstance() {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription.SyndicationRight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription newInstance() {
              return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument.OpenSearchDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument newInstance() {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.OpenSearchDescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
