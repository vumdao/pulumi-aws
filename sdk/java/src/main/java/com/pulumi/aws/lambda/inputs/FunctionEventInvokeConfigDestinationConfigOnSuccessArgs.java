// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FunctionEventInvokeConfigDestinationConfigOnSuccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigDestinationConfigOnSuccessArgs Empty = new FunctionEventInvokeConfigDestinationConfigOnSuccessArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private FunctionEventInvokeConfigDestinationConfigOnSuccessArgs() {}

    private FunctionEventInvokeConfigDestinationConfigOnSuccessArgs(FunctionEventInvokeConfigDestinationConfigOnSuccessArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEventInvokeConfigDestinationConfigOnSuccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEventInvokeConfigDestinationConfigOnSuccessArgs $;

        public Builder() {
            $ = new FunctionEventInvokeConfigDestinationConfigOnSuccessArgs();
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigOnSuccessArgs defaults) {
            $ = new FunctionEventInvokeConfigDestinationConfigOnSuccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public FunctionEventInvokeConfigDestinationConfigOnSuccessArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("FunctionEventInvokeConfigDestinationConfigOnSuccessArgs", "destination");
            }
            return $;
        }
    }

}
