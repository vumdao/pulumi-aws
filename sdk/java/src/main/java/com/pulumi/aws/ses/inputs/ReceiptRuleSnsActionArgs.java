// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptRuleSnsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleSnsActionArgs Empty = new ReceiptRuleSnsActionArgs();

    /**
     * The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
    private Output<Integer> position;

    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn", required=true)
    private Output<String> topicArn;

    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Output<String> topicArn() {
        return this.topicArn;
    }

    private ReceiptRuleSnsActionArgs() {}

    private ReceiptRuleSnsActionArgs(ReceiptRuleSnsActionArgs $) {
        this.encoding = $.encoding;
        this.position = $.position;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleSnsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleSnsActionArgs $;

        public Builder() {
            $ = new ReceiptRuleSnsActionArgs();
        }

        public Builder(ReceiptRuleSnsActionArgs defaults) {
            $ = new ReceiptRuleSnsActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encoding The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public ReceiptRuleSnsActionArgs build() {
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            $.topicArn = Objects.requireNonNull($.topicArn, "expected parameter 'topicArn' to be non-null");
            return $;
        }
    }

}