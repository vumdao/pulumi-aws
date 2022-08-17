// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IpSetIpSetDescriptor {
    /**
     * @return Type of the IP address - `IPV4` or `IPV6`.
     * 
     */
    private final String type;
    /**
     * @return An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
     */
    private final String value;

    @CustomType.Constructor
    private IpSetIpSetDescriptor(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return Type of the IP address - `IPV4` or `IPV6`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetIpSetDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetIpSetDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public IpSetIpSetDescriptor build() {
            return new IpSetIpSetDescriptor(type, value);
        }
    }
}