package com.ibm.wsdl;

import javax.wsdl.BindingPolicyReference;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lahiru
 * Date: Nov 8, 2010
 * Time: 2:04:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class BindingPolicyReferenceImpl extends AbstractWSDLElement implements BindingPolicyReference {

    protected String uri = null;

    protected List nativeAttributeNames =
            Arrays.asList(Constants.BINDING_OPERATION_ATTR_NAMES);
    /**
     * Set the name of this operation binding.
     *
     * @param uri the desired name
     */
    public void setURI(String uri)
    {
        this.uri = uri;
    }

    /**
     * Get the name of this operation binding.
     *
     * @return the operation binding name
     */
    public String getURI()
    {
        return uri;
    }

    /**
     * Get the list of local attribute names defined for this element in
     * the WSDL specification.
     *
     * @return a List of Strings, one for each local attribute name
     */
    public List getNativeAttributeNames()
    {
        return nativeAttributeNames;
    }
}
