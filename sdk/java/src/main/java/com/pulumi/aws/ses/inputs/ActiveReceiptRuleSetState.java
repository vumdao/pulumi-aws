// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActiveReceiptRuleSetState extends com.pulumi.resources.ResourceArgs {

    public static final ActiveReceiptRuleSetState Empty = new ActiveReceiptRuleSetState();

    /**
     * The SES receipt rule set ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The SES receipt rule set ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the rule set
     * 
     */
    @Import(name="ruleSetName")
    private @Nullable Output<String> ruleSetName;

    /**
     * @return The name of the rule set
     * 
     */
    public Optional<Output<String>> ruleSetName() {
        return Optional.ofNullable(this.ruleSetName);
    }

    private ActiveReceiptRuleSetState() {}

    private ActiveReceiptRuleSetState(ActiveReceiptRuleSetState $) {
        this.arn = $.arn;
        this.ruleSetName = $.ruleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActiveReceiptRuleSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActiveReceiptRuleSetState $;

        public Builder() {
            $ = new ActiveReceiptRuleSetState();
        }

        public Builder(ActiveReceiptRuleSetState defaults) {
            $ = new ActiveReceiptRuleSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The SES receipt rule set ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The SES receipt rule set ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param ruleSetName The name of the rule set
         * 
         * @return builder
         * 
         */
        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        /**
         * @param ruleSetName The name of the rule set
         * 
         * @return builder
         * 
         */
        public Builder ruleSetName(String ruleSetName) {
            return ruleSetName(Output.of(ruleSetName));
        }

        public ActiveReceiptRuleSetState build() {
            return $;
        }
    }

}