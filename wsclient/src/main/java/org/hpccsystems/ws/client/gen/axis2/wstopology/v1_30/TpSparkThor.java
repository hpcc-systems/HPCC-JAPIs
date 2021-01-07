/**
 * TpSparkThor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30;


/**
 *  TpSparkThor bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class TpSparkThor implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = TpSparkThor
       Namespace URI = urn:hpccsystems:ws:wstopology
       Namespace Prefix = ns5
     */

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for Build
     */
    protected java.lang.String localBuild;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBuildTracker = false;

    /**
     * field for ThorClusterName
     */
    protected java.lang.String localThorClusterName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localThorClusterNameTracker = false;

    /**
     * field for ThorPath
     */
    protected java.lang.String localThorPath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localThorPathTracker = false;

    /**
     * field for SparkExecutorCores
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localSparkExecutorCores;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkExecutorCoresTracker = false;

    /**
     * field for SparkExecutorMemory
     */
    protected long localSparkExecutorMemory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkExecutorMemoryTracker = false;

    /**
     * field for SparkMasterPort
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localSparkMasterPort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkMasterPortTracker = false;

    /**
     * field for SparkMasterWebUIPort
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localSparkMasterWebUIPort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkMasterWebUIPortTracker = false;

    /**
     * field for SparkWorkerCores
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localSparkWorkerCores;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkWorkerCoresTracker = false;

    /**
     * field for SparkWorkerMemory
     */
    protected long localSparkWorkerMemory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkWorkerMemoryTracker = false;

    /**
     * field for SparkWorkerPort
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localSparkWorkerPort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSparkWorkerPortTracker = false;

    /**
     * field for LogDirectory
     */
    protected java.lang.String localLogDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLogDirectoryTracker = false;

    /**
     * field for Path
     */
    protected java.lang.String localPath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPathTracker = false;

    /**
     * field for TpMachines
     */
    protected org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpMachine localTpMachines;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTpMachinesTracker = false;

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isBuildSpecified() {
        return localBuildTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBuild() {
        return localBuild;
    }

    /**
     * Auto generated setter method
     * @param param Build
     */
    public void setBuild(java.lang.String param) {
        localBuildTracker = param != null;

        this.localBuild = param;
    }

    public boolean isThorClusterNameSpecified() {
        return localThorClusterNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getThorClusterName() {
        return localThorClusterName;
    }

    /**
     * Auto generated setter method
     * @param param ThorClusterName
     */
    public void setThorClusterName(java.lang.String param) {
        localThorClusterNameTracker = param != null;

        this.localThorClusterName = param;
    }

    public boolean isThorPathSpecified() {
        return localThorPathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getThorPath() {
        return localThorPath;
    }

    /**
     * Auto generated setter method
     * @param param ThorPath
     */
    public void setThorPath(java.lang.String param) {
        localThorPathTracker = param != null;

        this.localThorPath = param;
    }

    public boolean isSparkExecutorCoresSpecified() {
        return localSparkExecutorCoresTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getSparkExecutorCores() {
        return localSparkExecutorCores;
    }

    /**
     * Auto generated setter method
     * @param param SparkExecutorCores
     */
    public void setSparkExecutorCores(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localSparkExecutorCoresTracker = param != null;

        this.localSparkExecutorCores = param;
    }

    public boolean isSparkExecutorMemorySpecified() {
        return localSparkExecutorMemoryTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSparkExecutorMemory() {
        return localSparkExecutorMemory;
    }

    /**
     * Auto generated setter method
     * @param param SparkExecutorMemory
     */
    public void setSparkExecutorMemory(long param) {
        // setting primitive attribute tracker to true
        localSparkExecutorMemoryTracker = param != java.lang.Long.MIN_VALUE;

        this.localSparkExecutorMemory = param;
    }

    public boolean isSparkMasterPortSpecified() {
        return localSparkMasterPortTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getSparkMasterPort() {
        return localSparkMasterPort;
    }

    /**
     * Auto generated setter method
     * @param param SparkMasterPort
     */
    public void setSparkMasterPort(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localSparkMasterPortTracker = param != null;

        this.localSparkMasterPort = param;
    }

    public boolean isSparkMasterWebUIPortSpecified() {
        return localSparkMasterWebUIPortTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getSparkMasterWebUIPort() {
        return localSparkMasterWebUIPort;
    }

    /**
     * Auto generated setter method
     * @param param SparkMasterWebUIPort
     */
    public void setSparkMasterWebUIPort(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localSparkMasterWebUIPortTracker = param != null;

        this.localSparkMasterWebUIPort = param;
    }

    public boolean isSparkWorkerCoresSpecified() {
        return localSparkWorkerCoresTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getSparkWorkerCores() {
        return localSparkWorkerCores;
    }

    /**
     * Auto generated setter method
     * @param param SparkWorkerCores
     */
    public void setSparkWorkerCores(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localSparkWorkerCoresTracker = param != null;

        this.localSparkWorkerCores = param;
    }

    public boolean isSparkWorkerMemorySpecified() {
        return localSparkWorkerMemoryTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSparkWorkerMemory() {
        return localSparkWorkerMemory;
    }

    /**
     * Auto generated setter method
     * @param param SparkWorkerMemory
     */
    public void setSparkWorkerMemory(long param) {
        // setting primitive attribute tracker to true
        localSparkWorkerMemoryTracker = param != java.lang.Long.MIN_VALUE;

        this.localSparkWorkerMemory = param;
    }

    public boolean isSparkWorkerPortSpecified() {
        return localSparkWorkerPortTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getSparkWorkerPort() {
        return localSparkWorkerPort;
    }

    /**
     * Auto generated setter method
     * @param param SparkWorkerPort
     */
    public void setSparkWorkerPort(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localSparkWorkerPortTracker = param != null;

        this.localSparkWorkerPort = param;
    }

    public boolean isLogDirectorySpecified() {
        return localLogDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLogDirectory() {
        return localLogDirectory;
    }

    /**
     * Auto generated setter method
     * @param param LogDirectory
     */
    public void setLogDirectory(java.lang.String param) {
        localLogDirectoryTracker = param != null;

        this.localLogDirectory = param;
    }

    public boolean isPathSpecified() {
        return localPathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPath() {
        return localPath;
    }

    /**
     * Auto generated setter method
     * @param param Path
     */
    public void setPath(java.lang.String param) {
        localPathTracker = param != null;

        this.localPath = param;
    }

    public boolean isTpMachinesSpecified() {
        return localTpMachinesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpMachine
     */
    public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpMachine getTpMachines() {
        return localTpMachines;
    }

    /**
     * Auto generated setter method
     * @param param TpMachines
     */
    public void setTpMachines(
        org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpMachine param) {
        localTpMachinesTracker = param != null;

        this.localTpMachines = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "urn:hpccsystems:ws:wstopology");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":TpSparkThor", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "TpSparkThor", xmlWriter);
            }
        }

        if (localNameTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localBuildTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "Build", xmlWriter);

            if (localBuild == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Build cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBuild);
            }

            xmlWriter.writeEndElement();
        }

        if (localThorClusterNameTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "ThorClusterName", xmlWriter);

            if (localThorClusterName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ThorClusterName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localThorClusterName);
            }

            xmlWriter.writeEndElement();
        }

        if (localThorPathTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "ThorPath", xmlWriter);

            if (localThorPath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ThorPath cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localThorPath);
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkExecutorCoresTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkExecutorCores", xmlWriter);

            if (localSparkExecutorCores == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkExecutorCores cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkExecutorCores));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkExecutorMemoryTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkExecutorMemory", xmlWriter);

            if (localSparkExecutorMemory == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkExecutorMemory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkExecutorMemory));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkMasterPortTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkMasterPort", xmlWriter);

            if (localSparkMasterPort == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkMasterPort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkMasterPort));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkMasterWebUIPortTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkMasterWebUIPort", xmlWriter);

            if (localSparkMasterWebUIPort == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkMasterWebUIPort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkMasterWebUIPort));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkWorkerCoresTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkWorkerCores", xmlWriter);

            if (localSparkWorkerCores == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkWorkerCores cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkWorkerCores));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkWorkerMemoryTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkWorkerMemory", xmlWriter);

            if (localSparkWorkerMemory == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkWorkerMemory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkWorkerMemory));
            }

            xmlWriter.writeEndElement();
        }

        if (localSparkWorkerPortTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "SparkWorkerPort", xmlWriter);

            if (localSparkWorkerPort == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SparkWorkerPort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSparkWorkerPort));
            }

            xmlWriter.writeEndElement();
        }

        if (localLogDirectoryTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "LogDirectory", xmlWriter);

            if (localLogDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "LogDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLogDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localPathTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "Path", xmlWriter);

            if (localPath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Path cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPath);
            }

            xmlWriter.writeEndElement();
        }

        if (localTpMachinesTracker) {
            if (localTpMachines == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TpMachines cannot be null!!");
            }

            localTpMachines.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wstopology", "TpMachines"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wstopology")) {
            return "ns5";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static TpSparkThor parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            TpSparkThor object = new TpSparkThor();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"TpSparkThor".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (TpSparkThor) org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology", "Name").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Name" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology", "Build").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Build" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setBuild(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "ThorClusterName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ThorClusterName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setThorClusterName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology", "ThorPath").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ThorPath" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setThorPath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkExecutorCores").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkExecutorCores" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkExecutorCores(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkExecutorMemory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkExecutorMemory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkExecutorMemory(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkMasterPort").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkMasterPort" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkMasterPort(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkMasterWebUIPort").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkMasterWebUIPort" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkMasterWebUIPort(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkWorkerCores").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkWorkerCores" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkWorkerCores(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkWorkerMemory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkWorkerMemory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkWorkerMemory(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "SparkWorkerPort").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SparkWorkerPort" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSparkWorkerPort(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "LogDirectory").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "LogDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLogDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology", "Path").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Path" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "TpMachines").equals(reader.getName())) {
                            object.setTpMachines(org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpMachine.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}