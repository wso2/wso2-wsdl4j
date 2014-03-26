package javax.wsdl;

/**
 * This interface represents a WSDL Policy Rererence.
 * That is, it holds the information that would be
 * This contains the information of the policy Reference of the
 * Given binding.
 *
 * @author Lahiru Gunathilake (lahiru@wso2.com)
 */
public interface BindingPolicyReference {
    /**
       * Set the URI of the policy Reference for Binding.
       *
       * @param uri the desired name
       */
      public void setURI(String uri);

      /**
       * Get the URI of this operation binding.
       *
       * @return the operation binding name
       */
    public String getURI();

      /**
       * Get the URI of this operation binding.
       *
       * @return the operation binding name
       */
}
