// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAttachmentState Empty = new PolicyAttachmentState();

    /**
     * The name of the policy to attach.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The name of the policy to attach.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The identity to which the policy is attached.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The identity to which the policy is attached.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private PolicyAttachmentState() {}

    private PolicyAttachmentState(PolicyAttachmentState $) {
        this.policy = $.policy;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAttachmentState $;

        public Builder() {
            $ = new PolicyAttachmentState();
        }

        public Builder(PolicyAttachmentState defaults) {
            $ = new PolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param policy The name of the policy to attach.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The name of the policy to attach.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param target The identity to which the policy is attached.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The identity to which the policy is attached.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public PolicyAttachmentState build() {
            return $;
        }
    }

}