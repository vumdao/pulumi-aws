// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultNetworkAclIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultNetworkAclIngressArgs Empty = new DefaultNetworkAclIngressArgs();

    /**
     * The action to take.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to take.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The CIDR block to match. This must be a valid network mask.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The CIDR block to match. This must be a valid network mask.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * The from port to match.
     * 
     */
    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    /**
     * @return The from port to match.
     * 
     */
    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * The ICMP type code to be used. Default 0.
     * 
     */
    @Import(name="icmpCode")
    private @Nullable Output<Integer> icmpCode;

    /**
     * @return The ICMP type code to be used. Default 0.
     * 
     */
    public Optional<Output<Integer>> icmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }

    /**
     * The ICMP type to be used. Default 0.
     * 
     */
    @Import(name="icmpType")
    private @Nullable Output<Integer> icmpType;

    /**
     * @return The ICMP type to be used. Default 0.
     * 
     */
    public Optional<Output<Integer>> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }

    /**
     * The IPv6 CIDR block.
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block.
     * 
     */
    public Optional<Output<String>> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    /**
     * The protocol to match. If using the -1 &#39;all&#39; protocol, you must specify a from and to port of 0.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol to match. If using the -1 &#39;all&#39; protocol, you must specify a from and to port of 0.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The rule number. Used for ordering.
     * 
     */
    @Import(name="ruleNo", required=true)
    private Output<Integer> ruleNo;

    /**
     * @return The rule number. Used for ordering.
     * 
     */
    public Output<Integer> ruleNo() {
        return this.ruleNo;
    }

    /**
     * The to port to match.
     * 
     */
    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    /**
     * @return The to port to match.
     * 
     */
    public Output<Integer> toPort() {
        return this.toPort;
    }

    private DefaultNetworkAclIngressArgs() {}

    private DefaultNetworkAclIngressArgs(DefaultNetworkAclIngressArgs $) {
        this.action = $.action;
        this.cidrBlock = $.cidrBlock;
        this.fromPort = $.fromPort;
        this.icmpCode = $.icmpCode;
        this.icmpType = $.icmpType;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.protocol = $.protocol;
        this.ruleNo = $.ruleNo;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultNetworkAclIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultNetworkAclIngressArgs $;

        public Builder() {
            $ = new DefaultNetworkAclIngressArgs();
        }

        public Builder(DefaultNetworkAclIngressArgs defaults) {
            $ = new DefaultNetworkAclIngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param cidrBlock The CIDR block to match. This must be a valid network mask.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block to match. This must be a valid network mask.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param fromPort The from port to match.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        /**
         * @param fromPort The from port to match.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        /**
         * @param icmpCode The ICMP type code to be used. Default 0.
         * 
         * @return builder
         * 
         */
        public Builder icmpCode(@Nullable Output<Integer> icmpCode) {
            $.icmpCode = icmpCode;
            return this;
        }

        /**
         * @param icmpCode The ICMP type code to be used. Default 0.
         * 
         * @return builder
         * 
         */
        public Builder icmpCode(Integer icmpCode) {
            return icmpCode(Output.of(icmpCode));
        }

        /**
         * @param icmpType The ICMP type to be used. Default 0.
         * 
         * @return builder
         * 
         */
        public Builder icmpType(@Nullable Output<Integer> icmpType) {
            $.icmpType = icmpType;
            return this;
        }

        /**
         * @param icmpType The ICMP type to be used. Default 0.
         * 
         * @return builder
         * 
         */
        public Builder icmpType(Integer icmpType) {
            return icmpType(Output.of(icmpType));
        }

        /**
         * @param ipv6CidrBlock The IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * @param ipv6CidrBlock The IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            return ipv6CidrBlock(Output.of(ipv6CidrBlock));
        }

        /**
         * @param protocol The protocol to match. If using the -1 &#39;all&#39; protocol, you must specify a from and to port of 0.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol to match. If using the -1 &#39;all&#39; protocol, you must specify a from and to port of 0.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param ruleNo The rule number. Used for ordering.
         * 
         * @return builder
         * 
         */
        public Builder ruleNo(Output<Integer> ruleNo) {
            $.ruleNo = ruleNo;
            return this;
        }

        /**
         * @param ruleNo The rule number. Used for ordering.
         * 
         * @return builder
         * 
         */
        public Builder ruleNo(Integer ruleNo) {
            return ruleNo(Output.of(ruleNo));
        }

        /**
         * @param toPort The to port to match.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        /**
         * @param toPort The to port to match.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public DefaultNetworkAclIngressArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.ruleNo = Objects.requireNonNull($.ruleNo, "expected parameter 'ruleNo' to be non-null");
            $.toPort = Objects.requireNonNull($.toPort, "expected parameter 'toPort' to be non-null");
            return $;
        }
    }

}