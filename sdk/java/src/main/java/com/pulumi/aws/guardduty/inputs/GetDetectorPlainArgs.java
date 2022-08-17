// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDetectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDetectorPlainArgs Empty = new GetDetectorPlainArgs();

    /**
     * The ID of the detector.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the detector.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetDetectorPlainArgs() {}

    private GetDetectorPlainArgs(GetDetectorPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDetectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDetectorPlainArgs $;

        public Builder() {
            $ = new GetDetectorPlainArgs();
        }

        public Builder(GetDetectorPlainArgs defaults) {
            $ = new GetDetectorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the detector.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetDetectorPlainArgs build() {
            return $;
        }
    }

}