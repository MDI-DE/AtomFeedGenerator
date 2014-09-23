/*
 * An XML document type.
 * Localname: startIndex
 * Namespace: http://a9.com/-/spec/opensearch/1.1/
 * Java type: com.a9.spec.opensearch.x11.StartIndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.spec.opensearch.x11;


/**
 * A document containing one startIndex(@http://a9.com/-/spec/opensearch/1.1/) element.
 *
 * This is a complex type.
 */
public interface StartIndexDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartIndexDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE96C8DBEAFDB76016FB069EF9B81A6CD").resolveHandle("startindex690fdoctype");
    
    /**
     * Gets the "startIndex" element
     */
    long getStartIndex();
    
    /**
     * Gets (as xml) the "startIndex" element
     */
    org.apache.xmlbeans.XmlLong xgetStartIndex();
    
    /**
     * Sets the "startIndex" element
     */
    void setStartIndex(long startIndex);
    
    /**
     * Sets (as xml) the "startIndex" element
     */
    void xsetStartIndex(org.apache.xmlbeans.XmlLong startIndex);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.a9.spec.opensearch.x11.StartIndexDocument newInstance() {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.spec.opensearch.x11.StartIndexDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.spec.opensearch.x11.StartIndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
