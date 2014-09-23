/*
 * XML Type:  QueryType
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.QueryType
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11;


/**
 * An XML QueryType(@http://a9.com/-/spec/opensearch/1.1/).
 *
 * This is a complex type.
 */
public interface QueryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("querytypef21ftype");
    
    /**
     * Gets the "role" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.Role.Enum getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.Role xgetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(com.a9.spec.opensearch.x11.QueryType.Role.Enum role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(com.a9.spec.opensearch.x11.QueryType.Role role);
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.Title xgetTitle();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(com.a9.spec.opensearch.x11.QueryType.Title title);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();
    
    /**
     * Gets the "totalResults" attribute
     */
    java.math.BigInteger getTotalResults();
    
    /**
     * Gets (as xml) the "totalResults" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.TotalResults xgetTotalResults();
    
    /**
     * True if has "totalResults" attribute
     */
    boolean isSetTotalResults();
    
    /**
     * Sets the "totalResults" attribute
     */
    void setTotalResults(java.math.BigInteger totalResults);
    
    /**
     * Sets (as xml) the "totalResults" attribute
     */
    void xsetTotalResults(com.a9.spec.opensearch.x11.QueryType.TotalResults totalResults);
    
    /**
     * Unsets the "totalResults" attribute
     */
    void unsetTotalResults();
    
    /**
     * Gets the "searchTerms" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getSearchTerms();
    
    /**
     * True if has "searchTerms" attribute
     */
    boolean isSetSearchTerms();
    
    /**
     * Sets the "searchTerms" attribute
     */
    void setSearchTerms(org.apache.xmlbeans.XmlAnySimpleType searchTerms);
    
    /**
     * Appends and returns a new empty "searchTerms" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewSearchTerms();
    
    /**
     * Unsets the "searchTerms" attribute
     */
    void unsetSearchTerms();
    
    /**
     * Gets the "count" attribute
     */
    java.math.BigInteger getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.Count xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(java.math.BigInteger count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(com.a9.spec.opensearch.x11.QueryType.Count count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * Gets the "startIndex" attribute
     */
    java.math.BigInteger getStartIndex();
    
    /**
     * Gets (as xml) the "startIndex" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.StartIndex xgetStartIndex();
    
    /**
     * True if has "startIndex" attribute
     */
    boolean isSetStartIndex();
    
    /**
     * Sets the "startIndex" attribute
     */
    void setStartIndex(java.math.BigInteger startIndex);
    
    /**
     * Sets (as xml) the "startIndex" attribute
     */
    void xsetStartIndex(com.a9.spec.opensearch.x11.QueryType.StartIndex startIndex);
    
    /**
     * Unsets the "startIndex" attribute
     */
    void unsetStartIndex();
    
    /**
     * Gets the "startPage" attribute
     */
    java.math.BigInteger getStartPage();
    
    /**
     * Gets (as xml) the "startPage" attribute
     */
    com.a9.spec.opensearch.x11.QueryType.StartPage xgetStartPage();
    
    /**
     * True if has "startPage" attribute
     */
    boolean isSetStartPage();
    
    /**
     * Sets the "startPage" attribute
     */
    void setStartPage(java.math.BigInteger startPage);
    
    /**
     * Sets (as xml) the "startPage" attribute
     */
    void xsetStartPage(com.a9.spec.opensearch.x11.QueryType.StartPage startPage);
    
    /**
     * Unsets the "startPage" attribute
     */
    void unsetStartPage();
    
    /**
     * Gets the "language" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getLanguage();
    
    /**
     * True if has "language" attribute
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" attribute
     */
    void setLanguage(org.apache.xmlbeans.XmlAnySimpleType language);
    
    /**
     * Appends and returns a new empty "language" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewLanguage();
    
    /**
     * Unsets the "language" attribute
     */
    void unsetLanguage();
    
    /**
     * Gets the "inputEncoding" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getInputEncoding();
    
    /**
     * True if has "inputEncoding" attribute
     */
    boolean isSetInputEncoding();
    
    /**
     * Sets the "inputEncoding" attribute
     */
    void setInputEncoding(org.apache.xmlbeans.XmlAnySimpleType inputEncoding);
    
    /**
     * Appends and returns a new empty "inputEncoding" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewInputEncoding();
    
    /**
     * Unsets the "inputEncoding" attribute
     */
    void unsetInputEncoding();
    
    /**
     * Gets the "outputEncoding" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getOutputEncoding();
    
    /**
     * True if has "outputEncoding" attribute
     */
    boolean isSetOutputEncoding();
    
    /**
     * Sets the "outputEncoding" attribute
     */
    void setOutputEncoding(org.apache.xmlbeans.XmlAnySimpleType outputEncoding);
    
    /**
     * Appends and returns a new empty "outputEncoding" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewOutputEncoding();
    
    /**
     * Unsets the "outputEncoding" attribute
     */
    void unsetOutputEncoding();
    
    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Role.
     */
    public interface Role extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Role.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("role6e49attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum REQUEST = Enum.forString("request");
        static final Enum EXAMPLE = Enum.forString("example");
        static final Enum RELATED = Enum.forString("related");
        static final Enum CORRECTION = Enum.forString("correction");
        static final Enum SUBSET = Enum.forString("subset");
        static final Enum SUPERSET = Enum.forString("superset");
        
        static final int INT_REQUEST = Enum.INT_REQUEST;
        static final int INT_EXAMPLE = Enum.INT_EXAMPLE;
        static final int INT_RELATED = Enum.INT_RELATED;
        static final int INT_CORRECTION = Enum.INT_CORRECTION;
        static final int INT_SUBSET = Enum.INT_SUBSET;
        static final int INT_SUPERSET = Enum.INT_SUPERSET;
        
        /**
         * Enumeration value class for com.a9.spec.opensearch.x11.QueryType$Role.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_REQUEST
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
            
            static final int INT_REQUEST = 1;
            static final int INT_EXAMPLE = 2;
            static final int INT_RELATED = 3;
            static final int INT_CORRECTION = 4;
            static final int INT_SUBSET = 5;
            static final int INT_SUPERSET = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("request", INT_REQUEST),
                    new Enum("example", INT_EXAMPLE),
                    new Enum("related", INT_RELATED),
                    new Enum("correction", INT_CORRECTION),
                    new Enum("subset", INT_SUBSET),
                    new Enum("superset", INT_SUPERSET),
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
            public static com.a9.spec.opensearch.x11.QueryType.Role newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.Role) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Role newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Role newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML title(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Title.
     */
    public interface Title extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Title.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("title1e5fattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.QueryType.Title newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.Title) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Title newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Title newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML totalResults(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$TotalResults.
     */
    public interface TotalResults extends org.apache.xmlbeans.XmlNonNegativeInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("totalresults622dattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.QueryType.TotalResults newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.TotalResults) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.TotalResults newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.TotalResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.TotalResults newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.TotalResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML count(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$Count.
     */
    public interface Count extends org.apache.xmlbeans.XmlNonNegativeInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Count.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("count7088attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.QueryType.Count newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.Count) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Count newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.Count) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.Count newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.Count) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML startIndex(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$StartIndex.
     */
    public interface StartIndex extends org.apache.xmlbeans.XmlInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartIndex.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("startindex716fattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.QueryType.StartIndex newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.StartIndex) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.StartIndex newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.StartIndex) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.StartIndex newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.StartIndex) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML startPage(@).
     *
     * This is an atomic type that is a restriction of com.a9.spec.opensearch.x11.QueryType$StartPage.
     */
    public interface StartPage extends org.apache.xmlbeans.XmlInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartPage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("startpagea5c6attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.a9.spec.opensearch.x11.QueryType.StartPage newValue(java.lang.Object obj) {
              return (com.a9.spec.opensearch.x11.QueryType.StartPage) type.newValue( obj ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.StartPage newInstance() {
              return (com.a9.spec.opensearch.x11.QueryType.StartPage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.a9.spec.opensearch.x11.QueryType.StartPage newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.a9.spec.opensearch.x11.QueryType.StartPage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.a9.spec.opensearch.x11.QueryType newInstance() {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.a9.spec.opensearch.x11.QueryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.a9.spec.opensearch.x11.QueryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.QueryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.QueryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.QueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
