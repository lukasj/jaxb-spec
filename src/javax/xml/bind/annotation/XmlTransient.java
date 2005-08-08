/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package javax.xml.bind.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * <p>
 * Prevents the mapping of a JavaBean property to XML representation.
 * <p>
 * The <tt>@XmlTransient</tt> annotation is useful for resolving name
 * collisions between a JavaBean property name and a field name or
 * preventing the mapping of a field/property. A name collision can
 * occur when the decapitalized JavaBean property name and a field
 * name are the same. If the JavaBean property refers to the field,
 * then the name collision can be resolved by preventing the
 * mapping of either the field or the JavaBean property using the
 * <tt>@XmlTransient</tt> annotation. 
 * <p><b>Usage</b></p>
 * <p> The <tt>@XmlTransient</tt> annotation can be used with the following
 *     program elements: 
 * <ul> 
 *   <li> a JavaBean property </li>
 *   <li> field </li>
 * </ul>
 * 
 * <p>See "Package Specification" in javax.xml.bind.package javadoc for
 * additional common information.</p>
 *
 * <p><b>Example:</b> Resolve name collision between JavaBean property and
 *     field name </p>
 * 
 * <pre>
 *   // Example: Code fragment
 *   public class USAddress {
 *
 *       // The field name "name" collides with the property name 
 *       // obtained by bean decapitalization of getName() below
 *       &#64;XmlTransient public String name;
 *
 *       String getName() {..};
 *       String setName() {..};
 *   }
 *
 *    
 *   &lt;!-- Example: XML Schema fragment -->
 *   &lt;xs:complexType name="USAddress">
 *     &lt;xs:sequence>
 *       &lt;xs:element name="name" type="xs:string"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * </pre>
 *
 * @author Sekhar Vajjhala, Sun Microsystems, Inc.
 * @since JAXB2.0
 * @version $Revision: 1.5 $
 */

@Retention(RUNTIME) @Target({FIELD, METHOD})
public @interface XmlTransient {}
   
