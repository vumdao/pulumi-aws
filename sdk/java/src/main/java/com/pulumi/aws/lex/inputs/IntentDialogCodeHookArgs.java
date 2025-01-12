// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class IntentDialogCodeHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentDialogCodeHookArgs Empty = new IntentDialogCodeHookArgs();

    @Import(name="messageVersion", required=true)
    private Output<String> messageVersion;

    public Output<String> messageVersion() {
        return this.messageVersion;
    }

    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    private IntentDialogCodeHookArgs() {}

    private IntentDialogCodeHookArgs(IntentDialogCodeHookArgs $) {
        this.messageVersion = $.messageVersion;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentDialogCodeHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentDialogCodeHookArgs $;

        public Builder() {
            $ = new IntentDialogCodeHookArgs();
        }

        public Builder(IntentDialogCodeHookArgs defaults) {
            $ = new IntentDialogCodeHookArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageVersion(Output<String> messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        public Builder messageVersion(String messageVersion) {
            return messageVersion(Output.of(messageVersion));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public IntentDialogCodeHookArgs build() {
            if ($.messageVersion == null) {
                throw new MissingRequiredPropertyException("IntentDialogCodeHookArgs", "messageVersion");
            }
            if ($.uri == null) {
                throw new MissingRequiredPropertyException("IntentDialogCodeHookArgs", "uri");
            }
            return $;
        }
    }

}
