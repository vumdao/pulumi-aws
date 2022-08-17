// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResolverRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverRulesArgs Empty = new GetResolverRulesArgs();

    /**
     * A regex string to filter resolver rule names.
     * The filtering is done locally, so could have a performance impact if the result is large.
     * This argument should be used along with other arguments to limit the number of results returned.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter resolver rule names.
     * The filtering is done locally, so could have a performance impact if the result is large.
     * This argument should be used along with other arguments to limit the number of results returned.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The ID of the outbound resolver endpoint for the desired resolver rules.
     * 
     */
    @Import(name="resolverEndpointId")
    private @Nullable Output<String> resolverEndpointId;

    /**
     * @return The ID of the outbound resolver endpoint for the desired resolver rules.
     * 
     */
    public Optional<Output<String>> resolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }

    /**
     * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Import(name="ruleType")
    private @Nullable Output<String> ruleType;

    /**
     * @return The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    public Optional<Output<String>> ruleType() {
        return Optional.ofNullable(this.ruleType);
    }

    /**
     * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Import(name="shareStatus")
    private @Nullable Output<String> shareStatus;

    /**
     * @return Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public Optional<Output<String>> shareStatus() {
        return Optional.ofNullable(this.shareStatus);
    }

    private GetResolverRulesArgs() {}

    private GetResolverRulesArgs(GetResolverRulesArgs $) {
        this.nameRegex = $.nameRegex;
        this.ownerId = $.ownerId;
        this.resolverEndpointId = $.resolverEndpointId;
        this.ruleType = $.ruleType;
        this.shareStatus = $.shareStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverRulesArgs $;

        public Builder() {
            $ = new GetResolverRulesArgs();
        }

        public Builder(GetResolverRulesArgs defaults) {
            $ = new GetResolverRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameRegex A regex string to filter resolver rule names.
         * The filtering is done locally, so could have a performance impact if the result is large.
         * This argument should be used along with other arguments to limit the number of results returned.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter resolver rule names.
         * The filtering is done locally, so could have a performance impact if the result is large.
         * This argument should be used along with other arguments to limit the number of results returned.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param ownerId When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint for the desired resolver rules.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            $.resolverEndpointId = resolverEndpointId;
            return this;
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint for the desired resolver rules.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(String resolverEndpointId) {
            return resolverEndpointId(Output.of(resolverEndpointId));
        }

        /**
         * @param ruleType The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(@Nullable Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param shareStatus Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
         * 
         * @return builder
         * 
         */
        public Builder shareStatus(@Nullable Output<String> shareStatus) {
            $.shareStatus = shareStatus;
            return this;
        }

        /**
         * @param shareStatus Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
         * 
         * @return builder
         * 
         */
        public Builder shareStatus(String shareStatus) {
            return shareStatus(Output.of(shareStatus));
        }

        public GetResolverRulesArgs build() {
            return $;
        }
    }

}